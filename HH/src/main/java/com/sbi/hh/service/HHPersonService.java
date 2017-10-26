package com.sbi.hh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbi.hh.Entity.HHPersonDetailsEntity;
import com.sbi.hh.dao.HHPersonDetailsDao;
@Service
public class HHPersonService implements HHPersonDetailsIService{

	@Autowired
	private HHPersonDetailsDao dao;
	@Override
	public List<HHPersonDetailsEntity> getAll() {
		
		return dao.findAll();
	}

}
