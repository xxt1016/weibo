/**
 * 版权归属 谢祥涛
 * 时间 下午2:17:31 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.edu.uestc.weibo.dao.WeiboDao;
import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Weibo;
import cn.edu.uestc.weibo.service.interfaces.WeiboService;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午2:17:31
 */
@Service
public class WeiboServiceImpl implements WeiboService {
	
	@Autowired
	private WeiboDao weiboDao;

	
	public PageInfo<Weibo> weibo(int accountId, int current) throws Exception {
		
		PageInfo<Weibo> pi = new PageInfo<Weibo>( current );
		
		int count = weiboDao.count(accountId);
		
		List<Weibo> list = weiboDao.findById(accountId, pi.getStart(), pi.getSize());
		
		pi.setCount(count);
		pi.setList(list);
		
		return pi;
	}

}
