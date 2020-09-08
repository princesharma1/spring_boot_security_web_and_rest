package com.lp.web.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lp.web.entity.ProjectProps;
import com.lp.web.repository.PropRepository;

@Service
public class PropService {

	@Autowired
	PropRepository propRepository;

	public List<ProjectProps> getList() {
		return propRepository.findAll();
	}

	public Map<String, String> getValueData() {
		List<ProjectProps> list = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		list = getList();
		for (Iterator<ProjectProps> itr = list.iterator(); itr.hasNext();) {
			ProjectProps p = itr.next();
			map.put(p.getPropKey(), p.getPropValue());

		}
		return map;
	}
}
