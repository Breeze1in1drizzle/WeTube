package com.Rise435.WeTube.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Rise435.WeTube.entity.User;
import com.Rise435.WeTube.mappers.UserMapper;
import com.Rise435.WeTube.service.IUserService;
import com.Rise435.WeTube.service.ex.InsertException;
import com.Rise435.WeTube.service.ex.PasswordNotMatchException;
import com.Rise435.WeTube.service.ex.UserNotFoundException;
import com.Rise435.WeTube.service.ex.UsernameDuplicateException;

/*
 * 业务层实现
 */
@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
//	注册
	@Override
	public void reg(User user) throws UsernameDuplicateException, InsertException {
		// TODO Auto-generated method stub
//		根据尝试注册的用户名查询用户数据
		System.err.println(user);
		String username = user.getUsername();
		User result = findByUsername(username);
//		检查用户名是否重用
		if (result == null) {
//			设置is_deleted
			user.setIsDelete(0);
			
//			设置日志
			Date now = new Date();
			user.setUsername(username);
			user.setCreatedTime(now);
			user.setModifiedUser(username);
			user.setModifiedTime(now);
			
//			执行注册
			userMapper.insert(user);
		}
	}
	
//	封装
	private User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(username);
	}

	@Override
	public User login(String username, String password) 
			throws UserNotFoundException, PasswordNotMatchException {
		// TODO Auto-generated method stub
//		根据userName查找用户
		User result = findByUsername(username);
		
//		若为空
		if(result == null)
		{
			throw new UserNotFoundException(
					"登录失败！尝试登录的用户不存在！");
		}
//		判断is_deleted
		if(result.getIsDelete().equals(1))
		{
			
			throw new UserNotFoundException(
					"登录失败！尝试登录的用户不存在！");
		}
//		获取密码
		if(result.getPassword().equals(password))
		{
			result.setPassword(null);
			result.setIsDelete(null);
			
			return result;
		}
		else
		{
			throw new PasswordNotMatchException(
					"登录失败！密码错误！");
		}
		
	}

}
