/**
 * 版权归属 谢祥涛
 * 时间 上午10:16:40 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.dao;

import cn.edu.uestc.weibo.entity.Account;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月25日 上午10:16:40
 */
public interface RegisterDao {
	
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
