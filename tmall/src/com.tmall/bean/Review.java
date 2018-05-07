package com.tmall.bean;

import java.util.Date;

public class Review {

	private String content;
	private Date createDate;
	/**
	 * @description more-to-one relationship between  review and user
	 */
	private User user;
	/**
	 * @description more-to-one relationship between  review and product
	 */
	private Product product;
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
