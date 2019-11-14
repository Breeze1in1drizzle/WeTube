package com.Rise435.WeTube.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rise435.WeTube.entity.Person;
import com.Rise435.WeTube.mappers.PersonMapper;
import com.Rise435.WeTube.service.IPersonService;
import com.Rise435.WeTube.service.ex.PersonNotFoundException;
import com.Rise435.WeTube.service.ex.UpdateException;

@Service
public class PersonServiceImpl implements IPersonService {
	
	@Autowired
	public PersonMapper personMapper;
	
	@Override
	public Person getPersonImgByFid(Integer fid) throws PersonNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("getPersonImgByFid");
		return personMapper.showPersonImgByFid(fid);
	}

	@Override
	public Person getPersonImgByFilmName(String filmName) throws PersonNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("getPersonImgByFilmName");
		return personMapper.showPersonImgByFilmName(filmName);
	}

	@Override
	public List<Person> getPersonImgListByFid(Integer fid) throws PersonNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("getPersonImgListByFid");
		return personMapper.showPersonImgListByFid(fid);
	}
	
	
	
	
}
