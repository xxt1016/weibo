/**
 * 版权归属 谢祥涛
 * 时间 上午10:42:13 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.interfaces;

import cn.edu.uestc.weibo.dto.PageInfo;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月25日 上午10:42:13
 */
public interface PageInfoService {
	
	/**
	 * 
	 */
	PageInfo findAll(PageInfo pi) throws Exception;
}
