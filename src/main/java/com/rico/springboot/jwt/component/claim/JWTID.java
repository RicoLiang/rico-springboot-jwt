package com.rico.springboot.jwt.component.claim;

public class JWTID extends BaseClaim {
	public JWTID(String value) {
		super("jti", value);
	}

	public boolean validate() {
		return true;
	}
}
