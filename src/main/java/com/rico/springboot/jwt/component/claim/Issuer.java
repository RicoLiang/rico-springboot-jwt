package com.rico.springboot.jwt.component.claim;

public class Issuer extends BaseClaim {

	public Issuer(String value) {
		super("iss", value);
	}

	public boolean validate() {
		return true;
	}
}
