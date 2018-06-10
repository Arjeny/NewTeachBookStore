package com.newtech.util;

import java.util.regex.Pattern;

/**
 * 账户相关属性验证
 * @author Mr.J
 *
 */
public class ValidateUtil {

	/**
	 * 正则表达式，验证用户名
	 */
	public static final String REGEX_USERNAME  = "^[a-zA-Z]\\w{5,20}$";
	
	/**
	 *正则表达式，验证密码 
	 */
	public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";
	
	/**
	 * 正则表达式，验证手机号码
	 */
	public static final String REGEX_PHONE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	
	/**
	 * 正则表达式，验证邮箱
	 */
	public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	/**
	 * 校验用户名
	 * @param username
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isUsername(String username) {
		return Pattern.matches(REGEX_USERNAME, username);
	}
	
	/**
	 * 校验密码
	 * @param password
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isPassword(String password) {
		return Pattern.matches(REGEX_PASSWORD, password);
	}
	
	/**
	 * 校验手机号码
	 * @param phone
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isPhone(String phone) {
		return Pattern.matches(REGEX_PHONE, phone);
	}
	
	/**
	 * 校验邮箱
	 * @param email
	 * @return 校验通过返回true，否则返回false
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches(REGEX_EMAIL, email);
	}
}
