package com.zscat.shop.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * 
 * 
 * @author zscat
 * @email 951449465@qq.com
 * @date 2018-02-01 14:20:38
 */
public class StoreSlideDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//id
	private Long id;
	//addTime
	private Date addtime;
	//deleteStatus
	private Boolean deletestatus;
	//url
	private String url;
	//acc_id
	private Long accId;
	//store_id
	private Long storeId;

	/**
	 * 设置：id
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：addTime
	 */
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}
	/**
	 * 获取：addTime
	 */
	public Date getAddtime() {
		return addtime;
	}
	/**
	 * 设置：deleteStatus
	 */
	public void setDeletestatus(Boolean deletestatus) {
		this.deletestatus = deletestatus;
	}
	/**
	 * 获取：deleteStatus
	 */
	public Boolean getDeletestatus() {
		return deletestatus;
	}
	/**
	 * 设置：url
	 */
	public void setUrl(String url) {
		this.url = url;
	}
	/**
	 * 获取：url
	 */
	public String getUrl() {
		return url;
	}
	/**
	 * 设置：acc_id
	 */
	public void setAccId(Long accId) {
		this.accId = accId;
	}
	/**
	 * 获取：acc_id
	 */
	public Long getAccId() {
		return accId;
	}
	/**
	 * 设置：store_id
	 */
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	/**
	 * 获取：store_id
	 */
	public Long getStoreId() {
		return storeId;
	}
}
