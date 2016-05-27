/**
 * 版权归属 谢祥涛
 * 时间 下午2:21:17 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.interfaces;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Weibo;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午2:21:17
 */
public interface WeiboService {

	/**
	 * 查询当前用户微薄信息列表
	 * @param accountId
	 * @param current
	 * @return
	 * @throws Exception
	 */
	PageInfo<Weibo> weibo( int accountId, int current) throws Exception;
	
}

