/**
 * 版权归属 谢祥涛
 * 时间 下午1:54:57 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.edu.uestc.weibo.entity.Weibo;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:54:57
 */
public interface WeiboDao {
	
	/**
	 * 获得关注微博总条数
	 * @param accountId
	 * @return
	 */
	int count(int accountId);
	
	/**
	 * 查询关注人所以微博
	 * @param accountId 当前登录用户
	 * @param start 分页起始索引
	 * @param size 每多少条
	 * @return
	 */
	List<Weibo> findById(@Param("accountId") int accountId, @Param("start")int start, @Param("size")int size);

}
