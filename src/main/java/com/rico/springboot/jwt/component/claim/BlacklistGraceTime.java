package com.rico.springboot.jwt.component.claim;

/**
 * 记录刷新次数
 * 
 * @author Administrator
 *
 */
public class BlacklistGraceTime extends BaseClaim {

	public BlacklistGraceTime(String value) {
		super("blgt", value);
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
