package com.rico.springboot.jwt;

public class Tester {

	public static void main(String[] args) throws Exception {
		Tester t = new Tester();
		String str = "https://test.globalsign.cn/#/registerhttps://test.globalsign.cn/#/registerhttps://test.globalsign.cn/#/registerhttps://test.globalsign.cn/#/register";
		String encode = t.encode(str.getBytes("UTF-8"));
		System.out.println(encode);

		byte[] decode = t.decode(encode);
		System.out.println(new String(decode, "UTF-8"));
	}

	public String encode(byte[] data) {
		return javax.xml.bind.DatatypeConverter.printBase64Binary(data);
	}

	public byte[] decode(String encoded) {
		return javax.xml.bind.DatatypeConverter.parseBase64Binary(encoded);
	}
}
