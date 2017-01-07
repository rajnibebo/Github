/**
 * 
 */
package com.trantor.leavesys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trantor.leavesys.entities.Leave;

/**
 * @author rajni.ubhi
 *
 */
@Repository("leaveRepository")
public interface LeaveRepository extends JpaRepository<Leave, Long>{

}
