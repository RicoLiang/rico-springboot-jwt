package com.rico.springboot.jwt.component;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.rico.springboot.jwt.component.claim.BaseClaim;

import lombok.Data;

@Data
public class Payload {

	private List<BaseClaim> claims;

	/**
	 * 根据name返回一个Claim
	 * 
	 * @param name
	 * @return BaseClaim
	 */
	public BaseClaim getClaim(String name) {
		List<BaseClaim> collect = claims.stream().filter(s -> StringUtils.equalsIgnoreCase(s.getName(), name))
				.collect(Collectors.toList());
		return collect.get(0);
	}

	/**
	 * 增加一个Claim
	 * 
	 * @param claim
	 */
	public void addClaim(BaseClaim claim) {
		for (Iterator<BaseClaim> it = claims.iterator(); it.hasNext();) {
			BaseClaim item = it.next();
			if (StringUtils.equalsIgnoreCase(item.getName(), claim.getName())) {
				item.setValue(claim.getValue());
				return;
			}
		}
	}

	/**
	 * 输出Base64字符串
	 * 
	 * @return string
	 */
	public String toBase64String() {
		// return Base64Util.encode(this.toJsonString());
		return "";
	}

	/**
	 * 输出JSON字符串
	 * 
	 * @return string
	 * @throws JsonProcessingException
	 */
	public String toJsonString() throws JsonProcessingException {
		Map<String, String> values = new HashMap<String, String>(8);
		this.claims.forEach(item -> {
			values.put(item.getName(), item.getValue());
		});
		ObjectMapper mapper = new ObjectMapper();
		return mapper.writeValueAsString(values);
	}
}
