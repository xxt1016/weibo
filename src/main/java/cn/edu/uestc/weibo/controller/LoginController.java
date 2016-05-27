/**
 * 版权归属 谢祥涛
 * 时间 下午4:41:57 2016年5月24日
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
 * 2016年5月24日 下午4:41:57
 */
@Controller
public class LoginController {
	
	@Autowired
	private AccountService accountService;
	
	@RequestMapping("/login")
	public String login(Account account, HttpSession session){
		
		try {
			//调用login方法
			account = accountService.login(account);
			//将account存储在session中
			session.setAttribute("account", account);
		} catch (Exception e) {
			// TODO: handle exception
		}
		//res.sendRedirect(arg0);重定向
		return "redirect:/u/" + account.getAccountId() + "/home";
	}

}