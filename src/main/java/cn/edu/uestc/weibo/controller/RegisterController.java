/**
 * 版权归属 谢祥涛
 * 时间 上午9:57:20 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.service.interfaces.AccountService;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月25日 上午9:57:20
 */

@Controller
public class RegisterController {
	
	@Autowired
	private AccountService accountservice;
	
	@RequestMapping("/register")
	public String reg(Account account, HttpSession session){
		
		session.setAttribute("account", account);
		
		return null;
		
	}
}
