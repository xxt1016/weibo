/**
 * 版权归属 谢祥涛
 * 时间 上午10:14:57 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.interfaces;

import javax.security.auth.login.LoginException;

import cn.edu.uestc.weibo.entity.Account;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月25日 上午10:14:57
 */
public interface RegisterService {
	
	/**
	 * 用户注册
	 * @param account
	 * @return
	 * @throws LoginException
	 */
	Account register(Account account) throws LoginException;
	
	/**
	 * 
	 * @param account
	 * @return
	 * @throws Exception
	 */
	int reg(Account account) throws Exception;
}
