package com.rico.springboot.jwt.component.claim;

public class CustomClaim extends BaseClaim {

	public CustomClaim(String name, String value) {
		super(name, value);
	}

	public boolean validate() {
		return true;
	}
}
