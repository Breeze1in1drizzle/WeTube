package com.Rise435.WeTube.controller;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.Rise435.WeTube.entity.User;
import com.Rise435.WeTube.service.IUserService;
import com.Rise435.WeTube.util.ResponseResult;

@RestController
@RequestMapping("/users")
public class UserController extends BaseController {
	
	@Autowired
	private IUserService userService;
	
	/**
	 * 确定上传文件的名称
	 */
	private static final String UPLOAD_DIR = "upload";
	/**
	 * 确定上传文件的最大大小
	 */
	private static final long UPLOAD_MAX_SIZE = 1 * 1024 * 1024;
	/**
	 * 确定允许上传的类型的列表
	 */
	private static final List<String> UPLOAD_CONTENT_TYPES
			= new ArrayList<>();

	static {
		UPLOAD_CONTENT_TYPES.add("image/jpeg");
		UPLOAD_CONTENT_TYPES.add("image/png");
		UPLOAD_CONTENT_TYPES.add("image/gif");
		UPLOAD_CONTENT_TYPES.add("image/bmp");
	}
	
	@RequestMapping("/reg")
	public ResponseResult<Void> reg(User user) {
		userService.reg(user);
		return new ResponseResult<>(SUCCESS);
	}
	
	@RequestMapping("/login")
	public ResponseResult<User> login(
		@RequestParam("username") String username,
		@RequestParam("password") String password,
		HttpSession session) {
		
		// 执行登录验证
		User data = userService.login(username, password);
		// 向Session中封装用户信息
		session.setAttribute("uid", data.getUid());
		session.setAttribute("username", data.getUsername());
		// 返回
		return new ResponseResult<>(SUCCESS, data);
	}
}
