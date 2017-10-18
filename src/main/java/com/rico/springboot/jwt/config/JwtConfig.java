package com.rico.springboot.jwt.config;

/**
 * jwt参数配置文件
 * 
 * @author Administrator
 *
 */
public class JwtConfig {
	/**
	 * HMAC 签名秘钥<br/>
	 * HMAC 签名秘钥是用来为token进行HMAC签名的
	 */
	public String secret_key = "JWT_SECRET_KEY";

	/**
	 * RSA 签名私钥<br/>
	 * RSA 签名私钥是用来为token进行RSA签名的
	 */
	public String private_secret_key = "JWT_PRIVATE_SECRET_KEY";

	/**
	 * RSA 签名公钥<br/>
	 * RSA 签名公钥是用来为token进行RSA签名解密的
	 */
	public String public_secret_key = "JWT_PUBLIC_SECRET_KEY";

	/**
	 * Token 有效期<br/>
	 * 指定token的有效时间(单位毫秒),默认1小时
	 */
	public int JWT_TTL = 60 * 60 * 1000;

	/**
	 * Token 刷新有效期<br/>
	 * 指定token过期后,多长一段时间内,使用过期的token能够刷新。默认为12小时
	 */
	public int JWT_REFRESH_TTL = 12 * 60 * 60 * 1000;

	/**
	 * JWT 算法ID<br/>
	 * Token HMAC签名的HASH算法<br/>
	 * 对称算法:HS256, HS384, HS512<br/>
	 * 非对称算法,需提供公私钥:RS256, RS384, RS512<br/>
	 */
	public String JWT_ALGORITHM = "Lsxiao/JWT/Singer/HMAC::DEFAULT_ALGO_ID";

	/**
	 * 指定Token在某时间之前无法使用<br/>
	 * 指定一个时间增量(单位秒),在此签发时间+此事件增量时间之前,Token都不能使用
	 */
	public int JWT_NOT_BEFORE = 0;

	/**
	 * 刷新Token次数差值<br/>
	 * 最新刷新次数会缓存在Server,如果客户端的token刷新次数与Server缓存相差大于此值,就会判定无效Token
	 */
	public int JWT_REFRESH_DIFF_LIMIT = 2;

	/**
	 * 黑名单宽限时间,单位秒<br/>
	 * 每次刷新后,Token会被加入黑名单,在高并发的情况下,后续请求Token会无效,当设置宽限时间后,Token刷新后,
	 * 加入黑名单的Token只要处于宽限时间内,则是有效的。
	 */
	public int JWT_BLACK_LIST_GRACE_TIME = 30;
}
