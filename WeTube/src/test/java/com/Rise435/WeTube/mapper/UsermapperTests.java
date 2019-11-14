package com.Rise435.WeTube.mapper;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.Rise435.WeTube.mappers.UserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UsermapperTests {

	@Autowired
	public UserMapper mapper;
	
//	@Test
//	public void insert() {
////		实体类创建
//		User user = new User();
//		Date now = new Date();
////		将用户名设置到实体类中
//		user.setUsername("root3");
//		user.setPassword("root");
//		user.setGender(0);
//		user.setPhone("12345678910");
//		user.setUserAvatar("user.jpg");
//		user.setCreatedUser("root");
//		user.setCreatedTime(now);
////		调用接口的插入数据方法
//		Integer rows = mapper.insert(user);
//		System.err.println("TTTTTTT");
//		if(rows > 0)                                                                                       
//		{
//			System.err.println("数据插入成功");
//			System.err.println("rows=" + rows);
//		}
//		
//	}
	
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
//	public void findByUsername() {
//		String userName = "root";
//		System.err.println(userName);
//		User result = mapper.findByUsername(userName);
//		System.err.println(result);
//	}
//	
//	@Test
//	public void findByUid() {
//		Integer uid = 2;
//		User result = mapper.findByUid(uid);
//		System.err.println(result);
//	}
	
}







