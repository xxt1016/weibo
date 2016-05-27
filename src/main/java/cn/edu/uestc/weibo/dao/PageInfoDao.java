/**
 * 版权归属 谢祥涛
 * 时间 上午11:12:07 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.dao;

import cn.edu.uestc.weibo.dto.PageInfo;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月25日 上午11:12:07
 */
public interface PageInfoDao {
	/**
	 * 分页
	 * @param pi
	 * @return
	 * @throws Exception
	 */
	PageInfo findAll(PageInfo pi) ;
}
