package com.rico.springboot.jwt.component.claim;

public class IssuedAt extends BaseClaim {

	public IssuedAt(String value) {
		super("iat", value);
	}

	public boolean validate() {
		Integer value = 0;
		try {
			value = Integer.valueOf(this.getValue());
		} catch (NumberFormatException e) {
		}
		return value > 0 ? true : false;
	}
}
