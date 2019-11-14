package com.Rise435.WeTube.controller;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.Rise435.WeTube.controller.ex.DescriptionShownException;
import com.Rise435.WeTube.controller.ex.DetailShownException;
import com.Rise435.WeTube.controller.ex.ImgShownException;
import com.Rise435.WeTube.service.ex.PasswordNotMatchException;
import com.Rise435.WeTube.service.ex.ServiceException;
import com.Rise435.WeTube.service.ex.UserNotFoundException;
import com.Rise435.WeTube.service.ex.UsernameDuplicateException;
import com.Rise435.WeTube.util.ResponseResult;

public abstract class BaseController {
	
	/**
	 * 最后的响应状态：成功的时候数值为200
	 */
	public static final Integer SUCCESS = 200;
	
	
	
	
	/**
	 * 从Session获取当前登录的用户id
	 * @param session HttpSession对象
	 * @return 当前登录的用户id
	 */
	protected final Integer getUidFromSession(HttpSession session) {
		return Integer.valueOf(session.getAttribute("uid").toString());
	}
	
	
	
	/**
	 * 从session获取当前页面对应的电影的名字
	 * @param session
	 * @return
	 */
	protected final String getFilmNameFromSession(HttpSession session) {
		return session.getAttribute("filmName").toString();
	}
	
	/**
	 * 从session获取当前页面对应的电影的id(fid)
	 * @param session
	 * @return
	 */
	protected final Integer getFidFromSession(HttpSession session) {
		
		System.err.println("getFidFromSession");
//		System.err.println("session:"+session.getAttribute("fid").toString());
		
		return Integer.valueOf(session.getAttribute("fid").toString());
	}
	
	
	
	
	//异常处理机制这里在合并时要留意
	/**
	 * 统一处理异常
	 * @param e
	 * @return
	 */
	@ExceptionHandler({ServiceException.class, DetailShownException.class})
	public ResponseResult<Void> handleException(Throwable e) {
		
		ResponseResult<Void> rr = new ResponseResult<Void>();//第二个<>没有Void？
		
		rr.setMessage(e.getMessage());
		
		
		
		if (e instanceof UsernameDuplicateException) {
			// 400-用户名冲突
			rr.setState(400);
		} else if (e instanceof UserNotFoundException) {
			// 401-用户数据不存在
			rr.setState(401);
		} else if (e instanceof PasswordNotMatchException) {
			// 402-验证密码失败
			rr.setState(402);
		} else if (e instanceof ImgShownException) {
			System.err.println("ImgShownException");
			rr.setState(1000);//[1000,1100)之间是图片无法显示，找不到图片的异常
		} else if (e instanceof DescriptionShownException) {
			System.err.println("DescriptionShownException");
			rr.setState(1100);//[1100,1200)文字描述异常，找不到相关信息
		}
		//else if (e instanceof AddressNotFoundException) {
//		// 403-收货地址数据不存在的异常
//		rr.setState(403);
//	} else if (e instanceof AccessDeniedException) {
//		// 404-拒绝访问，可能因为权限不足，或数据归属有误
//		rr.setState(404);
//	} else if (e instanceof InsertException) {
//		// 500-插入数据异常
//		rr.setState(500);
//	} else if (e instanceof UpdateException) {
//		// 501-更新数据异常
//		rr.setState(501);
//	} else if (e instanceof DeleteException) {
//		// 502-删除数据异常
//		rr.setState(502);
//	} else if (e instanceof FileEmptyException) {
//		// 600-上传文件时没有选择文件或选中的文件为空时的异常
//		rr.setState(600);
//	} else if (e instanceof FileSizeException) {
//		// 601-上传文件时文件大小超出限制异常
//		rr.setState(601);
//	} else if (e instanceof FileContentTypeException) {
//		// 602-上传文件时文件类型异常
//		rr.setState(602);
//	} else if (e instanceof FileIllegalStateException) {
//		// 603-上传文件时非法状态异常
//		rr.setState(603);
//	} else if (e instanceof FileIOException) {
//		// 604-上传文件时读写异常
//		rr.setState(604);
//	}
		
		return rr;
	}
	
	
	
	
	
	
	
	
}
