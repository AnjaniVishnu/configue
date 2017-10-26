package com.sbi.hh.service;

import java.util.List;

import com.sbi.hh.Entity.HHPersonDetailsEntity;
import com.sbi.hh.dao.HHPersonDetailsDao;

public interface HHPersonDetailsIService {


	
	public List<HHPersonDetailsEntity> getAll();
}
