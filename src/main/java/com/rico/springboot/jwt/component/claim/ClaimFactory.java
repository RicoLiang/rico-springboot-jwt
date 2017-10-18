package com.rico.springboot.jwt.component.claim;

public class ClaimFactory {
	/**
	 * 创建Claim
	 * 
	 * @param name
	 * @param value
	 * @return Audience|ExpirationTime|IssuedAt|Issuer|JWTID|NotBefore|Subject
	 */
	public static BaseClaim create(String name, String value) {
		BaseClaim claim = null;
		switch (name) {
		case "aud":
			claim = new Audience(value);
			break;
		case "exp":
			claim = new ExpirationTime(value);
			break;
		case "iat":
			claim = new IssuedAt(value);
			break;
		case "iss":
			claim = new Issuer(value);
			break;
		case "jti":
			claim = new JWTID(value);
			break;
		case "nbf":
			claim = new NotBefore(value);
			break;
		case "sub":
			claim = new Subject(value);
			break;
		case "blgt":
			claim = new BlacklistGraceTime(value);
			break;
		case "rexp":
			claim = new RefreshExpirationTime(value);
			break;
		default:
			claim = new CustomClaim(name, value);
			break;
		}
		return claim;
	}
}
