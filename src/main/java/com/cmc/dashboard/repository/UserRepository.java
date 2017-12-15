package com.cmc.dashboard.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cmc.dashboard.dto.UserUtilizationDTO;
import com.cmc.dashboard.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	@Query(value = "SELECT u.user_id from users u where u.group_id = 1", nativeQuery = true)
	public List<Integer> findUserByGroup();
	

	@Query(value = "SELECT new com.cmc.dashboard.dto.UserUtilizationDTO(u.userId, u.fullName, up.manDay, up.fromDate, up.toDate) "
			+ "FROM User as u "
			+ "LEFT JOIN u.userPlans as up "
			+ "ORDER BY u.userId"
			)
	public List<UserUtilizationDTO> getUserUtilization();
}
