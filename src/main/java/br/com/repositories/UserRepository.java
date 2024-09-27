package br.com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

import br.com.models.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public UserDetails findByUsername(String username);
	
}
