package com.sbi.hh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.sbi.hh.Entity.BCD;
import com.sbi.hh.Entity.HHPersonDetailsEntity;
import com.sbi.hh.service.HHPersonService;

@RestController
@RequestMapping(value="Person")
public class HHPersonDetailsController {

	@Autowired
	private HHPersonService service;
	
	@RequestMapping(value="/all",method=RequestMethod.GET)
	public ResponseEntity<BCD> getAllDAta(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<BCD> response1 =restTemplate.getForEntity("http://localhost:8080/student/1",BCD.class);
		BCD bcd = response1.getBody();
		bcd.setName("hiiiiiiiiii :");
		ResponseEntity<BCD> response = new ResponseEntity<BCD>(bcd,HttpStatus.OK);
		return response;
		/*List<HHPersonDetailsEntity>	data=service.getAll();
		ResponseEntity<List<HHPersonDetailsEntity>> response=new ResponseEntity<>(data,HttpStatus.OK);
		return response;*/
		
	}
}
