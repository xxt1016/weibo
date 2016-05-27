/**
 * 版权归属 谢祥涛
 * 时间 下午1:37:59 2016年5月24日
 * 项目名 weibo
 * Copyright (c) 2016, 15228948543@163.com All Rights Reserved.
 */
package cn.edu.uestc.weibo.entity;

import java.io.Serializable;

/**
 * @author xxt
 * @email 1522894853@163.com
 * 2016年5月24日 下午1:37:59
 */
public class Account implements Serializable {

	private static final long serialVersionUID = -5201444145446943166L;
	
	
	private int accountId;
	private String email;
	private String password;
	private String name;
	private String pic;
	private int follow;
	private int fans;
	private int weibo;
	
	
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getFollow() {
		return follow;
	}
	public void setFollow(int follow) {
		this.follow = follow;
	}
	public int getFans() {
		return fans;
	}
	public void setFans(int fans) {
		this.fans = fans;
	}
	public int getWeibo() {
		return weibo;
	}
	public void setWeibo(int weibo) {
		this.weibo = weibo;
	}
	
	
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", pic=" + pic + ", follow=" + follow + ", fans=" + fans + ", weibo=" + weibo + "]";
	}

}
