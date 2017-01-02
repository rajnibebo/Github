package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.entities.User;

/**
 * @author rajni.ubhi
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	
}
