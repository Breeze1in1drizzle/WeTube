package com.Rise435.WeTube.service.impl;


import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rise435.WeTube.entity.Film;
import com.Rise435.WeTube.mappers.FilmMapper;
import com.Rise435.WeTube.service.IFilmService;
import com.Rise435.WeTube.service.ex.FilmNotFoundException;
import com.Rise435.WeTube.service.ex.InsertException;
import com.Rise435.WeTube.service.ex.UpdateException;

@Service
public class FilmServiceImpl implements IFilmService {

	@Autowired
	public FilmMapper filmMapper;
	
	
	@Override
	public Film getFilmByFid(Integer fid) throws FilmNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("FilmServiceImpl_getFilmByFid");
		return filmMapper.showFilmByFid(fid);
	}

	@Override
	public Film getFilmByFilmName(String filmName) throws FilmNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("FilmServiceImpl_getFilmByFilmName");
		return filmMapper.showFilmByFilmName(filmName);
	}

	@Override
	public List<Film> getFilmListByFid(Integer fid) throws FilmNotFoundException, UpdateException {
		// TODO Auto-generated method stub
		System.err.println("FilmServiceImpl, getFilmListByFid, fid:" + fid);
		List<Film> filmList = filmMapper.showFilmListByFid(fid);
		for (int i = 0; i < filmList.size(); i++) {
			System.err.println("filmList:" + filmList.subList(i, i).toString());
		}
		return filmList;
	}
	
	
	
	
	
	@Override
	public void addnew(Film film, String username) throws InsertException {
		// TODO Auto-generated method stub

		// 4项日志：时间是直接创建对象得到，用户名使用参数username
		Date now = new Date();
		film.setCreatedUser(username);
		film.setCreatedTime(now);
		film.setModifiedUser(username);
		film.setModifiedTime(now);

		// 执行增加：insert(Address address);
		filmMapper.insert(film);
	}

	@Override
	public Film getByFilmName(String filmName) {
		// TODO Auto-generated method stub
		return filmMapper.findByFilmName(filmName);
	}

	@Override
	public Film getByFid(Integer fid) {
		// TODO Auto-generated method stub
		return filmMapper.findByFid(fid);
	}

	@Override
	public List<Film> getTotalFilm() {
		// TODO Auto-generated method stub
		return filmMapper.TotalFilm();
	}

	@Override
	public List<Film> listFilm(Integer startindex,Integer endindex) throws Exception {
		try{
			List<Film> obj=filmMapper.searchFilm( startindex, endindex);
			return obj;
			}
		catch(Exception e){
			System.err.println("数据异常1");
			return null;	
		}
		
	}

	@Override
	public List<Film> searchFilmNum() throws Exception {
		try{
			List<Film> obj=filmMapper.searchFilmNum();
			return obj;
			}
		catch(Exception e){
			System.err.println("数据异常4");
			return null;	
		}
	}

	@Override
	public List<Film> listFutureFilm(Integer startindex, Integer endindex) throws Exception {
		try{
			List<Film> obj=filmMapper.searchFutureFilm(startindex, endindex);
			return obj;
			}
		catch(Exception e){
			System.err.println("数据异常1");
			return null;	
		}
	}

	@Override
	public List<Film> searchFutureFilmNum() throws Exception {
		try{
			List<Film> obj=filmMapper.searchFutureFilmNum();
			return obj;
			}
		catch(Exception e){
			System.err.println("数据异常5");
			return null;	
		}
	}
	
	
	
	
}
