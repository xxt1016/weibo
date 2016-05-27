/**
 * 版权归属 谢祥涛
 * 时间 下午2:41:55 2016年5月25日
 * 项目名 WB
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.dao;

import java.util.List;

/**
 * @author xxt
 * @email 15228948543@163.com
 * 2016年5月25日 下午2:41:55
 */
public class PageBean<T> {
	private int pageIndex;
	private int pageSize;
	private int count;
	private int pageCount;
	private int start;
	private int end;
	private List<T> list = null;
	
	public void init(){
		
		/*
		 * 根count 和 pageCount计算页面数pageSize
		 */
		int pageSize_x=(int)count/pageCount;
		if(count >= pageCount){
			this.pageSize=count%pageCount==0?pageSize_x:pageSize_x+1;
		}else{
			this.pageSize=1;
		}
		//判断页数和当前页数
		if(pageIndex > pageSize){
			pageIndex=pageSize;
		}
		if(pageIndex<1){
			pageIndex=1;
		}
		//根据当前页计算起始和结束条目
		this.start=(pageIndex-1)*pageCount+1;
		this.end=pageIndex*pageCount;
	}
	
	public PageBean(int pageIndex,int count,int pageCount){
		super();
		this.pageIndex = pageIndex;
	}
}
