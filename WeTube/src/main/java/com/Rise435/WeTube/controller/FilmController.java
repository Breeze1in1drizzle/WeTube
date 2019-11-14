package com.Rise435.WeTube.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Rise435.WeTube.entity.Film;
import com.Rise435.WeTube.service.IFilmService;
import com.Rise435.WeTube.util.ResponseResult;

@RestController
@RequestMapping("/films")
public class FilmController extends BaseController {
	
	
	@Autowired
	private IFilmService filmService;
	
	@GetMapping("/{fid}/fetchFilmByFid")
	public ResponseResult<Film> fetchFilmByFid(HttpSession session) {
		System.err.println("FilmController");
		//从session中获取fid
//		Integer fid = Integer.valueOf(session.getAttribute("fid").toString());
		Integer fid = getFidFromSession(session);
		System.err.println("FilmController_to_middle");
		//调用业务层对象执行
		Film data = filmService.getFilmByFid(fid);
		System.err.println("FilmController_to_end");
		//返回
		return new ResponseResult<Film>(SUCCESS, data);
	}
	
	
	@GetMapping("/{id}/fetchFilmByFilmName")
	public ResponseResult<Film> fetchFilmByFilmName(HttpSession session) {
		
		System.err.println("fetchFilmByFilmName");
		
		String filmName = getFilmNameFromSession(session);
		
		Film data = filmService.getFilmByFilmName(filmName);
		
		System.err.println("fetchFilmByFilmName_to_end");
		
		return new ResponseResult<Film>(SUCCESS, data);
	}
	
	
	
	@GetMapping("/{fid}/fetchFilmListByFid")
	public ResponseResult<List<Film>> fetchFilmListByFid(HttpSession session) {
		
		System.err.println("fetchFilmListByFid");
		
		Integer fid = getFidFromSession(session);
		
		List<Film> data = filmService.getFilmListByFid(fid);
		
		System.err.println("FilmController_fetchFilmListByFid");
		
		return new ResponseResult<List<Film>>(SUCCESS, data);
	}
	
	
	
	/*---------------------------------------------------*/
	@RequestMapping("/addnew")
	public ResponseResult<Void> addnew(
			Film film, HttpSession session) {
		// 从session中获取username
		String username = "root";
		System.err.println(film);
		// 调用业务层对象执行：addressService.addnew(address, username);
		filmService.addnew(film, username);
		// 返回成功
		return new ResponseResult<>(SUCCESS);
	}
	
	@GetMapping("/")
	public ResponseResult<List<Film>> getTotalFilm(
			HttpSession session) {
		// 调用业务层对象执行
		List<Film> data = filmService.getTotalFilm();
		// 返回
		return new ResponseResult<>(SUCCESS, data);
	}

	@GetMapping("/Now/{page1}/")
	public ResponseResult<List<Film>> searchFilm(
			@PathVariable("page1")Integer page1){
		ResponseResult<List<Film>> rr
        = new ResponseResult<List<Film>>();
		try {
			System.err.println("*****3******");
				Integer endindex=12*page1;
				Integer startindex=endindex-12;
		        List<Film> data=filmService.listFilm(startindex,endindex);
		        rr.setState(200);
		        rr.setData(data);
		    } catch (Exception e) {
		    	System.err.println("数据异常2");
		        rr.setState(2);
		        rr.setMessage(e.getMessage());
		    }
		return rr;}
	
	@GetMapping("/Future/{pagefuture}/")
	public ResponseResult<List<Film>> searchFutureFilm(
			@PathVariable("pagefuture")Integer pagefuture){
		ResponseResult<List<Film>> rr
        = new ResponseResult<List<Film>>();
		try {
			
			System.err.println("*****2******");
				Integer endindex=12*pagefuture;
				Integer startindex=endindex-12;
		        List<Film> data=filmService.listFutureFilm(startindex, endindex);
		        rr.setState(200);
		        rr.setData(data);
		    } catch (Exception e) {
		    	System.err.println("数据异常3");
		        rr.setState(2);
		        rr.setMessage(e.getMessage());
		    }
		return rr;}
	
	
	@GetMapping("/{isFuture}/")
	public ResponseResult<List<Film>> searchFilmNum(
			@PathVariable("isFuture")Integer isFuture){
		ResponseResult<List<Film>> rr
        = new ResponseResult<List<Film>>();
		try {
				System.err.println("*****1******");
				List<Film> data;
				if(isFuture==0)
					{ data=filmService.searchFilmNum();}
				else if(isFuture==1)
				{ 
					data=filmService.searchFutureFilmNum();}
				else 
					data=null;
		        rr.setState(200);
		        rr.setData(data);
		    } catch (Exception e) {
		    	System.err.println("数据异常3");
		        rr.setState(2);
		        rr.setMessage(e.getMessage());
		    }
		return rr;}
	
	
	
	
	@GetMapping("/savesession")
	public ResponseResult<Void> saveSession(
			@PathVariable("fid")Integer fid,
			HttpSession session){
		ResponseResult<Void> rr
        = new ResponseResult<>();
		try {
			session.setAttribute("fid", fid);
			rr.setState(200);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rr;
	}
	
	
	
}
