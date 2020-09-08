package com.lp.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "projects")
public class Project {
	@Id
	@Column(name = "project_id")
	private Long id;
	@Column(name = "project_name")
	private String name;
	@Column(name = "local_env")
	private String localEnv;
	@Column(name = "uat_env")
	private String uatEnv;
	@Column(name = "live_env")
	private String liveEnv;

}
