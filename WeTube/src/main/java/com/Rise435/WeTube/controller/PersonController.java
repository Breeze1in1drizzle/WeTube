package com.Rise435.WeTube.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rise435.WeTube.entity.Person;
import com.Rise435.WeTube.service.IPersonService;
import com.Rise435.WeTube.util.ResponseResult;

@RestController
@RequestMapping("/person")
public class PersonController extends BaseController {
	
	@Autowired
	private IPersonService personService;
	
	
	
	
	
	@GetMapping("/fetchPersonByFid")
	public ResponseResult<Person> fetchPersonByFid(HttpSession session) {
		
		Integer fid = getFidFromSession(session);
		
		Person data = personService.getPersonImgByFid(fid);
		
		return new ResponseResult<Person>(SUCCESS, data);
	}
	@GetMapping("/fetchPersonByFilmName")
	public ResponseResult<Person> fetchPersonByFilmName(HttpSession session) {
		
		String filmName = getFilmNameFromSession(session);
		
		Person data = personService.getPersonImgByFilmName(filmName);
		
		return new ResponseResult<Person>(SUCCESS, data);
	}
	
	
	
	
	
	@GetMapping("/{id}/fetchPersonListByFid")
	public ResponseResult<List<Person>> fetchPersonListByFid(HttpSession session) {
		
		System.err.println("fetchPersonListByFid");
		
		Integer fid = getFidFromSession(session);
		
		System.err.println("fetchPersonListByFid_middle");
		
		List<Person> data = personService.getPersonImgListByFid(fid);
		
		System.err.println("fetchPersonListByFid_end");
		
		return new ResponseResult<List<Person>>(SUCCESS, data);
	}
	
	
	
}
