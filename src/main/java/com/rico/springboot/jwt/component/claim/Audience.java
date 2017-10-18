package com.rico.springboot.jwt.component.claim;

public class Audience extends BaseClaim {
	public Audience(String value) {
		super("aud", value);
	}

	public boolean validate() {
		return true;
	}
}
