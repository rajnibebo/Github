package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.business.IUser;
import com.trantor.leavesys.entities.User;

/**
 * @author rajni.ubhi
 *
 */
@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long>{
	@Query(value="from User user where user.userName =:userName")
	public IUser getUserByUserName(@Param("userName") String userName);
}
