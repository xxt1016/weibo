/**
 * 版权归属 谢祥涛
 * 时间 下午1:39:20 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:39:20
 */
public class Weibo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -465319302342301146L;
	
	
	private int wid;
	private Account account;
	private String content;
	private int liked;
	private int comment;
	
	private Date wdatetime;

	public int getWid() {
		return wid;
	}

	public void setWid(int wid) {
		this.wid = wid;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getLiked() {
		return liked;
	}

	public void setLiked(int liked) {
		this.liked = liked;
	}

	public int getComment() {
		return comment;
	}

	public void setComment(int comment) {
		this.comment = comment;
	}

	public Date getWdatetime() {
		return wdatetime;
	}

	public void setWdatetime(Date wdatetime) {
		this.wdatetime = wdatetime;
	}
	
	
	@Override
	public String toString() {
		return "Weibo [wid=" + wid + ", account=" + account + ", content=" + content + ", liked=" + liked + ", comment="
				+ comment + ", wdatetime=" + wdatetime + "]";
	}

}
