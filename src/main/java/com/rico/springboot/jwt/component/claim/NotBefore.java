package com.rico.springboot.jwt.component.claim;

public class NotBefore extends BaseClaim {

	public NotBefore(String value) {
		super("nbf", value);
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
