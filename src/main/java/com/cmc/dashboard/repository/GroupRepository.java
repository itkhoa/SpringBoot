package com.cmc.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cmc.dashboard.model.Group;

public interface GroupRepository extends JpaRepository<Group, Integer>{
	
	@Query("select g from Group g where g.groupId = :groupId")
	public Group findById(@Param("groupId") int groupId);
	
	@Query("select g from Group g where g.groupName = :groupName")
	public Group findByName(@Param("groupName") String groupName);
}
