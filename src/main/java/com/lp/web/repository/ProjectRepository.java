package com.lp.web.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp.web.entity.Project;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long> {

	List<Project> findDataById(Long id);

}
