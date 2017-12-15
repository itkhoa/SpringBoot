package com.cmc.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmc.dashboard.model.Permission;

public interface PermissionRepository extends JpaRepository<Permission, Integer>{

}
