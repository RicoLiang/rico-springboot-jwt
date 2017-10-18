package com.rico.springboot.jwt.component.claim;

import lombok.Data;

@Data
public class BaseClaim {

	public BaseClaim(String name, String value) {
		this.name = name;
		this.value = value;
	}

	/**
	 * 名字
	 */
	protected String name;

	/**
	 * 值
	 */
	protected String value;

	/**
	 * 验证值是否正确
	 */
	protected boolean validate() {
		return false;
	}
}
