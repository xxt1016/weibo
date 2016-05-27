/**
 * 版权归属 谢祥涛
 * 时间 下午1:32:07 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.impl;

import javax.security.auth.login.LoginException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import cn.edu.uestc.weibo.dao.AccountDao;
import cn.edu.uestc.weibo.entity.Account;
import cn.edu.uestc.weibo.service.interfaces.AccountService;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:32:07
 */

@Service
public class AccountServiceImpl implements AccountService {
	
	private static final transient Logger log = LoggerFactory.getLogger(AccountServiceImpl.class);

	@Autowired
	private AccountDao accountDao;
	
	public Account login(Account account) throws LoginException {
		log.info("{}偿试登录", account.getEmail());
		
		Account na = accountDao.findByAccount(account.getEmail());
		System.out.println(na);
		//如果na为空， 表达该帐号xxxx
		if( na == null ){
			log.warn("{}登录失败,用户名或不存在", account.getEmail());
			throw new LoginException("用户名不存在!");
		} else if( ! account.getPassword().equals( na.getPassword() ) ){
			log.warn("{}登录失败,或密码错误", account.getEmail());
			throw new LoginException("密码错误!");
		}
		
		log.info("{}登录成功",account.getEmail());
		return na;
	}

	/**
	 * 
	 */
	public int reg(Account account) throws Exception {
		int count = accountDao.insert(account);
		return account.getAccountId();
	}

}
