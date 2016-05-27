/**
 * 版权归属 谢祥涛
 * 时间 下午1:23:56 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.dao;

import cn.edu.uestc.weibo.entity.Account;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:23:56
 */
public interface AccountDao {
	
	/**
	 * 
	 * @param account
	 * @return
	 */
	Account findByAccount(String account);
	
	/**
	 * 
	 * @param account
	 * @return
	 */
	int insert(Account account);

}
