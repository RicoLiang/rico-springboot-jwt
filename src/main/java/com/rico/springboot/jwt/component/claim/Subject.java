package com.rico.springboot.jwt.component.claim;

public class Subject extends BaseClaim {

	public Subject(String value) {
		super("subject", value);
	}

	public boolean validate() {
		return true;
	}
}
