package com.lp.web.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lp.web.entity.ProjectProps;

@Repository
public interface PropRepository extends JpaRepository<ProjectProps, Long> {


}
