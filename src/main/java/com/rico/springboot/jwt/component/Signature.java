package com.rico.springboot.jwt.component;

import lombok.Data;

@Data
public class Signature {
	private String value;

	public Signature(String value) {
		this.value = value;
	}
}
