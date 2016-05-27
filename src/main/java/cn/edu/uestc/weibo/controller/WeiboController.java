/**
 * 版权归属 谢祥涛
 * 时间 下午4:42:16 2016年5月24日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.uestc.weibo.dto.PageInfo;
import cn.edu.uestc.weibo.entity.Weibo;
import cn.edu.uestc.weibo.service.interfaces.WeiboService;

/**
 * @author xxt
 * @email 15228948543@163.com
 * 2016年5月24日 下午4:42:16
 */
@Controller
@RequestMapping("/u")
public class WeiboController {
	
	@Autowired
	private WeiboService weiboService;
	
	
	@RequestMapping("/{accountId}/home")
	public String home(@PathVariable("accountId") int accountId, Model model){
		
		try {
			PageInfo<Weibo> pi = weiboService.weibo(accountId, 1);
			
			model.addAttribute("pi", pi);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return "home/index";
	}

}
