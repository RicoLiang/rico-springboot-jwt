package com.rico.springboot.jwt.contracts;

import java.util.List;

public interface ISign {
	/**
	 * 返回算法
	 * 
	 * @return string|int
	 */
	String getAlgorithm();

	/**
	 * 返回支持的算法id列表
	 * 
	 * @return string []
	 */
	List<String> getSupportAlgorithmIds();

	/**
	 * 签名
	 * 
	 * @param $data
	 *            string 数据
	 * @param $secretKey
	 *            string 秘钥
	 * @return string
	 */
	String sign(String data, String secretKey);

	/**
	 * 验证签名
	 * 
	 * @param $expects
	 *            string 预期结果
	 * @param $data
	 *            string 待验证数据
	 * @param $secretKey
	 *            string 秘钥
	 * @return bool
	 */
	boolean verify(String expects, String data, String secretKey);

	/**
	 * 验证秘钥是否合法
	 * 
	 * @param $secretKey
	 * @return bool
	 */
	boolean validateSecretKey(String secretKey);
}
