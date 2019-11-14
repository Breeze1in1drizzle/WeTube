package com.Rise435.WeTube.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.Rise435.WeTube.entity.Film;



public interface FilmMapper {
	
	/**
	 * 通过电影id找到电影信息，
	 * 最后通过mapper传输到service
	 * 用Film类实现数据流传输
	 * @param fid
	 * @return
	 */
	Film showFilmByFid(Integer fid);
	
	
	/**
	 * 
	 * @param fid
	 * @return
	 */
	List<Film> showFilmListByFid(Integer fid);
	
	
	/**
	 * 通过电影名字找电影信息
	 * @param filmName
	 * @return
	 */
	Film showFilmByFilmName(String filmName);
	
	
	
/*---------------------------------------------------------------------*/
	
	//written by 敏轩
	
	/**
	 * 插入用户数据
	 * @param film 电影数据
	 * @return 受影响的行数
	 */
	Integer insert(Film film);
	
	/**
	 * 根据电影id查找匹配的数据
	 * @param fid
	 * @return 匹配的Film
	 */
	Film findByFid(Integer fid);
	
	/**
	 * 根据电影名filmName查询匹配的数据
	 * @param filmName
	 * @return 匹配的Film
	 */
	Film findByFilmName(String filmName);
	
	/**
	 * 遍历电影表中所有数据
	 * @return
	 */
	List<Film> TotalFilm();
	List<Film> searchFilm(@Param("startindex")Integer startindex,@Param("endindex")Integer endindex);
	List<Film> searchFilmNum();
	List<Film> searchFutureFilm(@Param("startindex")Integer startindex,@Param("endindex")Integer endindex);
	List<Film> searchFutureFilmNum();
	
	//敏轩
	
}
