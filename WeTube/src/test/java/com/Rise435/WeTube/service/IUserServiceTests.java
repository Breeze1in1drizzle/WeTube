package com.Rise435.WeTube.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.Rise435.WeTube.entity.User;
import com.Rise435.WeTube.service.ex.ServiceException;


@RunWith(SpringRunner.class)
@SpringBootTest
public class IUserServiceTests {
	@Autowired
	public IUserService service;
	
	@Test
	public void reg() {
		try {
			User user = new User();
			user.setUsername("root4");
			user.setPassword("root");
			user.setGender(1);
			user.setPhone("13800138008");
			service.reg(user);
			System.err.println("OK");
		} catch (ServiceException e) {
			System.err.println(e.getClass().getName());
			System.err.println(e.getMessage());
		}
	}
	
//	@Test
//	public void login() {
//		try {
//			String userName = "root";
//			String password = "root";
//			User data = service.login(userName, password);
//			System.err.println(data);
//		} catch (ServiceException e) {
//			System.err.println(e.getClass().getName());
//			System.err.println(e.getMessage());
//		}
//	}
}
