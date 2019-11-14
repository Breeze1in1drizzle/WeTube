package com.Rise435.WeTube.service;

import java.util.List;

import com.Rise435.WeTube.entity.Person;
import com.Rise435.WeTube.service.ex.FilmNotFoundException;
import com.Rise435.WeTube.service.ex.PersonNotFoundException;
import com.Rise435.WeTube.service.ex.UpdateException;

public interface IPersonService {
	
	
	/**
	 * 根据id号码来找到对应的数据库中与Person有关的信息，
	 * 然后用这些信息构建Film类，通过返回类来达到数据传输的目的
	 * service这里调用mapper
	 * mapper直接与xml文件挂钩
	 * @param fid
	 * @return
	 * @throws FilmNotFoundException
	 * @throws UpdateException
	 */
	public Person getPersonImgByFid(Integer fid) throws PersonNotFoundException, UpdateException;
	
	
	/**
	 * 根据演职人员名字找到电影相关信息
	 * @param filmName
	 * @return
	 * @throws FilmNotFoundException
	 * @throws UpdateException
	 */
	public Person getPersonImgByFilmName(String filmName) throws PersonNotFoundException, UpdateException;
	
	
	
	
	public List<Person> getPersonImgListByFid(Integer fid) throws PersonNotFoundException, UpdateException;
	
	
}
