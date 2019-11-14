package com.Rise435.WeTube.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Rise435.WeTube.entity.Film;
import com.Rise435.WeTube.service.ex.ServiceException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FilmServiceTestCase {

	@Autowired
	public IFilmService filmService;
	
	@Test
	public void getFilmByFilmName() {
		try {
			System.err.println("testFilmStarts");
			Film film = new Film();
			film.setFid(1);
			film.setFilmName("Bat Man: Dark Knight");
			film.setFilmImages("http://www.tedu.cn/upper.png");
			System.err.println("123start");
			filmService.getFilmByFid(film.getFid());
			System.err.println("ok");
		} catch(ServiceException e) {
			System.err.println("123getFilmByFilmName");
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
		}
	}
	
	
//	@Test
//	public void addnew()
//	{
//	//	实体类创建
//		Film film = new Film();
//	//	将用户名设置到实体类中
//		film.setFilmName("Film4");
//		film.setFilmImages("picture");
//		film.setFilmType("active");
//		film.setFilmFeature("School");
//	//	调用接口的插入数据方法
//		service.addnew(film, "cool boy");
//		System.err.println("ok");
//		
//	}
	
//	@Test
//	public void getByFid_and_getByFid()
//	{
//		System.err.println(service.getByFid(1));
//		System.err.println(service.getByFilmName("Film1"));
//		System.err.println("ok");
//	}
	
	@Test
	public void getByFid_and_getByFid() {
		List<Film> result = filmService.getTotalFilm();
		for (Film film : result) {
			System.err.println(film);
		}
	}
	
	
	
}
