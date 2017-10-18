package com.rico.springboot.jwt.component.claim;

public class ExpirationTime extends BaseClaim {
	public ExpirationTime(String value) {
		super("exp", value);
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
