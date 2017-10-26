package com.sbi.hh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbi.hh.Entity.HHPersonDetailsEntity;

@Repository
public interface HHPersonDetailsDao extends JpaRepository<HHPersonDetailsEntity, Integer>{

}
