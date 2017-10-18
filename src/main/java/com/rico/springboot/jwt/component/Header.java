package com.rico.springboot.jwt.component;

import org.apache.commons.lang3.StringUtils;

import lombok.Data;

/**
 * JWT头部分
 * 
 * @author Administrator
 *
 */
@Data
public class Header {

	// 声明类型
	private String type = "JWT";

	// 声明算法id
	private String algorithmId = "HMAC::DEFAULT_ALGO_ID";

	public boolean isHMACAlgorithmId() {
		if (StringUtils.startsWithIgnoreCase(this.algorithmId, "H")) {
			return true;
		}
		return false;
	}

	public boolean isRSAAlgorithmId() {
		if (StringUtils.startsWithIgnoreCase(this.algorithmId, "R")) {
			return true;
		}
		return false;
	}

	/**
	 * 输出Base64字符串
	 * 
	 * @return string
	 */
	public String toBase64String() {
		// Base64Util是一个url安全的Base64Util,后面会提及到
		// return Base64Util::encode($this->toJsonString());
		return "";
	}
}
