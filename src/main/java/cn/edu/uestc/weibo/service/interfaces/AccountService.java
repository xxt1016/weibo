/**
 * 版权归属 谢祥涛
 * 时间 下午2:21:01 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.interfaces;

import javax.security.auth.login.LoginException;

import cn.edu.uestc.weibo.entity.Account;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午2:21:01
 */
public interface AccountService {
	
	/**
	 * 用户登录
	 * @param account
	 * @return
	 * @throws LoginException
	 */
	Account login(Account account) throws LoginException;
	
	/**
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */
	int reg(Account account) throws Exception;
	

}
