package com.lp.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "project_props")
public class ProjectProps {
	@Id
	private Long id;
	@Column(name = "prop_key")
	private String propKey;
	@Column(name = "prop_value")
	private String propValue;
	
	
}
