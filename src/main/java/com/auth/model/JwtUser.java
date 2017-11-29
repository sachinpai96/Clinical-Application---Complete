package com.auth.model;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
@Table(name = "clinicusers")
public class JwtUser implements UserDetails{
	/**
	 * 
	 */
	private static final long serialVersionUID = -203339093560512981L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userId;

	private String username;

	
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsResetPasswordOnLogin() {
		return IsResetPasswordOnLogin;
	}

	public void setIsResetPasswordOnLogin(Boolean isResetPasswordOnLogin) {
		IsResetPasswordOnLogin = isResetPasswordOnLogin;
	}

	public String getSecurityQuestion() {
		return securityQuestion;
	}

	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}

	public String getSecurityAuestion() {
		return securityAuestion;
	}

	public void setSecurityAuestion(String securityAuestion) {
		this.securityAuestion = securityAuestion;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	private String password;

	@Column(name = "is_reset_password_on_login")
	private Boolean IsResetPasswordOnLogin;

	@Column(name = "security_question")
	private String securityQuestion;

	@Column(name = "security_answer")
	private String securityAuestion;

	private Boolean enabled;


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}



}
