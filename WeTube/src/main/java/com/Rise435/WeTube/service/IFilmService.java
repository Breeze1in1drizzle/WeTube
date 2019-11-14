package com.Rise435.WeTube.service;

import java.util.List;

import com.Rise435.WeTube.entity.Film;
import com.Rise435.WeTube.service.ex.FilmNotFoundException;
import com.Rise435.WeTube.service.ex.InsertException;
import com.Rise435.WeTube.service.ex.UpdateException;

public interface IFilmService {
	
	/**
	 * 根据id号码来找到对应的数据库中与film有关的信息，
	 * 然后用这些信息构建Film类，通过返回类来达到数据传输的目的
	 * service这里调用mapper
	 * mapper直接与xml文件挂钩
	 * @param fid
	 * @return
	 * @throws FilmNotFoundException
	 * @throws UpdateException
	 */
	public Film getFilmByFid(Integer fid) throws FilmNotFoundException, UpdateException;
	
	
	/**
	 * 根据电影名字找到电影相关信息
	 * @param filmName
	 * @return
	 * @throws FilmNotFoundException
	 * @throws UpdateException
	 */
	public Film getFilmByFilmName(String filmName) throws FilmNotFoundException, UpdateException;
	
	
	public List<Film> getFilmListByFid(Integer fid) throws FilmNotFoundException, UpdateException;
	
	
	
	
	
	
	
	
	
	
	/**
	 * 增加新的电影
	 * @param Film 电影对象
	 * @throws InsertException 插入数据异常
	 */
	void addnew(Film film, String username) 
			throws InsertException;
	
	/**
	 * 根据电影filmName查询
	 * @param filmName 电影名
	 * @return 匹配的电影数据，如果没有匹配的数据，则返回null
	 */
	Film getByFilmName(String filmName);
	
	/**
	 * 根据电影id查询收货地址数据
	 * @param fid 电影id
	 * @return 匹配的收货地址数据，如果没有匹配的数据，则返回null
	 */
	Film getByFid(Integer fid);
	
	/**
	 * 读取所有film
	 * @return 返回一个list 包括数据库中所有电影的信息
	 */
	List<Film> getTotalFilm();
	
	List<Film> listFilm(Integer startindex,Integer endindex)throws Exception;
	List<Film> searchFilmNum()throws Exception;
	List<Film> listFutureFilm(Integer startindex,Integer endindex)throws Exception;
	List<Film> searchFutureFilmNum()throws Exception;
	
//	/**
//	 * 根据id删除收货地址数据
//	 * @param uid 当前登录的用户的id
//	 * @param aid 将删除的收货地址数据的id
//	 * @throws AddressNotFoundException 收货地址数据不存在的异常
//	 * @throws AccessDeniedException 拒绝访问，可能因为权限不足，或数据归属有误
//	 * @throws DeleteException 删除数据异常
//	 * @throws UpdateException 更新数据异常
//	 */
//	void delete(Integer uid, Integer aid) 
//			throws AddressNotFoundException, 
//				AccessDeniedException, 
//				DeleteException, UpdateException;
//	
//	/**
//	 * 设置默认收货地址
//	 * @param uid 当前登录的用户的id
//	 * @param aid 将要设置为默认收货地址的数据的id
//	 * @throws AddressNotFoundException 收货地址数据不存在的异常
//	 * @throws AccessDeniedException 拒绝访问，数据归属有误
//	 * @throws UpdateException 更新数据异常
//	 */
//	void setDefault(Integer uid, Integer aid) 
//			throws AddressNotFoundException, 
//				AccessDeniedException, UpdateException;
//
	
	
	
	
	
}
