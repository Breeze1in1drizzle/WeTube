package com.Rise435.WeTube.mapper;


import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Rise435.WeTube.entity.Film;
import com.Rise435.WeTube.mappers.FilmMapper;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmMapperTestCase {
	
	@Autowired
	public FilmMapper filmMapper;
	
	@Test
	public void showByFid() {
//		Integer fid = 1;
//		List<Film> film = filmMapper.showFilmListByFid(fid);
		
	}
	
	@Test
	public void showByFilmName(String filmName) {
		
	}
	
	
	
//	@Test
//	public void insert() {
////		实体类创建
//		Film film = new Film();
////		将用户名设置到实体类中
//		film.setFilmName("Film3");
//		film.setFilmImages("picture");
//		film.setFilmType("active");
//		film.setFilmFeature("School");
////		调用接口的插入数据方法
//		Integer rows = mapper.insert(film);
//		if(rows > 0)                                                                                       
//		{
//			System.err.println("数据插入成功");
//			System.err.println("rows=" + rows);
//		}
//		
//	}
	
	@Test
	public void TotalFilm() {
//		实体类创建
		List<Film> result = new ArrayList<>();
//		调用接口的插入数据方法
		result = filmMapper.TotalFilm();
		for (Film film : result) {
			System.err.println(film);
		}
		
	}
	
//	@Test
//	public void updatePassword() {
//		Integer uid = 9;
//		String password = "8888";
//		String modifiedUser = "超级管理员";
//		Date modifiedTime = new Date();
//		Integer rows = mapper.updatePassword(uid, password, modifiedUser, modifiedTime);
//		System.err.println("rows=" + rows);
//	}
//	
//	@Test
//	public void updateInfo() {
//		User user = new User();
//		user.setUid(8);
//		user.setGender(0);
//		user.setPhone("13100131001");
//		user.setEmail("root@tedu.cn");
//		user.setModifiedUser("超级管理员");
//		user.setModifiedTime(new Date());
//		Integer rows = mapper.updateInfo(user);
//		System.err.println("rows=" + rows);
//	}
//
//	@Test
//	public void updateAvatar() {
//		Integer uid = 10;
//		String avatar = "这里应该是头像的路径";
//		String modifiedUser = "超级管理员";
//		Date modifiedTime = new Date();
//		Integer rows = mapper.updateAvatar(uid, avatar, modifiedUser, modifiedTime);
//		System.err.println("rows=" + rows);
//	}
//	
//	@Test
//	public void findByFilmName() {
//		String filmName = "Film1";
//		System.err.println(filmName);
//		Film result = mapper.findByFilmName(filmName);
//		System.err.println(result);
//	}
	
//	@Test
//	public void findByFid() {
//		Integer fid = 1;
//		System.err.println(fid);
//		Film result = mapper.findByFid(fid);
//		System.err.println(result);
//	}
	
}
