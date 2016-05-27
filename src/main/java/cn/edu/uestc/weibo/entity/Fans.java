/**
 * 版权归属 谢祥涛
 * 时间 下午1:38:43 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.entity;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:38:43
 */
public class Fans {
	
	private int fid;
	private String fname;
	private String follow;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getFollow() {
		return follow;
	}
	public void setFollow(String follow) {
		this.follow = follow;
	}
	@Override
	public String toString() {
		return "FansModel [fid=" + fid + ", fname=" + fname + ", follow=" + follow + "]";
	}
	
}
