/**
 * 版权归属 谢祥涛
 * 时间 下午2:50:19 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.impl;

import javax.security.auth.login.LoginException;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.entity.Weibo;
import cn.edu.uestc.weibo.service.interfaces.WeiboService;
import cn.edu.uestc.weibo.service.interfaces.AccountService;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午2:50:19
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-dao.xml"})
public class AccountServiceImplTest {

	@Autowired
	private AccountService accountService;
	
	@Autowired
	private WeiboService weiboService;
	
	@Test
	public void testLogin() throws LoginException{
		
		Account account = new Account();
		account.setEmail("zs@163.com");
		account.setPassword("123456");
		
		
		Account nc = accountService.login(account);
		
		Assert.assertNotNull( nc );
		
		System.out.println( nc );
		
	}
	
	@Test
	public void testReg() throws Exception{
		Account a = new Account();
		a.setEmail("ls@163.com");
		a.setPassword("123456");
		a.setPic("/h.jpg");
		
		int id = accountService.reg(a);
		
		System.out.println("accountid=" + id);
		
		Assert.assertEquals(18, id);
		
	}
	
	@Test
	public void testWeibo() throws Exception{
		
		PageInfo<Weibo> pi = weiboService.weibo(18, 1);
		
		System.out.println( pi );
		
	}
	
}
