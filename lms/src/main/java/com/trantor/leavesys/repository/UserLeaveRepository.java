/**
 * 
 */
package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.entities.UserLeave;

/**
 * @author rajni.ubhi
 *
 */
@Repository
public interface UserLeaveRepository extends JpaRepository<UserLeave, Long>{

}
