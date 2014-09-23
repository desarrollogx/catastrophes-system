package com.ssacn.jpa.Entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: User
 *
 */
@Entity
@Table(name = "user")
@SequenceGenerator(name = "id_user", sequenceName = "user_id_user_seq", allocationSize = 1)
@NamedQueries({
    @NamedQuery(name = "User.findByLogin", query = "SELECT u FROM User u WHERE u.login = :login")})
public class User implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Basic(optional = false)
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    @Basic(optional = false)
    @Column(name = "login")
    private String login;
    @Basic(optional = false)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @Column(name = "email")
    private String email;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
	
   
}
