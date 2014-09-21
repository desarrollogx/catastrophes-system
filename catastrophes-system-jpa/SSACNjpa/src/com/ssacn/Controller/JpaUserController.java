package com.ssacn.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ssacn.Entity.User;

public class JpaUserController {
	
	private EntityManagerFactory emf = null;
	
	public JpaUserController() {
        emf = Persistence.createEntityManagerFactory("SSCNjpaPU");
    }
    

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(User user) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(user);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
           // Logger.getLogger(jpaUserController.class.getName()).log(Level.INFO," | Se creo el usuario " + user.getName());
        }
    }
    
    public User findUser(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(User.class, id);
        } finally {
            em.close();
        }
    }

}
