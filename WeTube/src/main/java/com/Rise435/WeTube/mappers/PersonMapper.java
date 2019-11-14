package com.Rise435.WeTube.mappers;

import java.util.List;

import com.Rise435.WeTube.entity.Person;

public interface PersonMapper {
	
	
	/**
	 * 通过电影id找到对应的演职人员的信息
	 * 通过数据库中信息构造Person实例
	 * 通过调用mapper实现数据流传输至service
	 * @param fid
	 * @return
	 */
	Person showPersonImgByFid(Integer fid);
	
	
	/**
	 * 
	 * @param filmName
	 * @return
	 */
	Person showPersonImgByFilmName(String filmName);
	
	
	List<Person> showPersonImgListByFid(Integer fid);
	
}
