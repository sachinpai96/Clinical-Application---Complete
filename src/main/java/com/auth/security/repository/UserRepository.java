package com.auth.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth.model.JwtUser;


public interface UserRepository extends JpaRepository<JwtUser, Long> {

	/*JwtUser findByUsernameIgnoreCase(String userName);

	JwtUser findByUserIdNotAndUsernameIgnoreCase(Long userId, String userName);
*/
	JwtUser findByUsernameIgnoreCase(String username);
}
