package com.Rise435.WeTube.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Rise435.WeTube.mappers.PersonMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTestCase {

	@Autowired
	public PersonMapper personMapper;
	
	@Test
	public void getPersonImgByFid(Integer fid) {
		
	}
	
	@Test
	public void getPersonImgByFilmName(String filmName) {
		
	}
	
}
