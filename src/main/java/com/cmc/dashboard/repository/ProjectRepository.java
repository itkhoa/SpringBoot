/**
 * 
 */
package com.cmc.dashboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cmc.dashboard.model.ProjectCss;
/**
 * @author nahung
 *
 */
public interface ProjectRepository extends JpaRepository<ProjectCss, Integer> {
	
	
}
