package com.newtech.util;

import java.util.regex.Pattern;

/**
 * �˻����������֤
 * @author Mr.J
 *
 */
public class ValidateUtil {

	/**
	 * ������ʽ����֤�û���
	 */
	public static final String REGEX_USERNAME  = "^[a-zA-Z]\\w{5,20}$";
	
	/**
	 *������ʽ����֤���� 
	 */
	public static final String REGEX_PASSWORD = "^[a-zA-Z0-9]{6,20}$";
	
	/**
	 * ������ʽ����֤�ֻ�����
	 */
	public static final String REGEX_PHONE = "^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
	
	/**
	 * ������ʽ����֤����
	 */
	public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
	
	/**
	 * У���û���
	 * @param username
	 * @return У��ͨ������true�����򷵻�false
	 */
	public static boolean isUsername(String username) {
		return Pattern.matches(REGEX_USERNAME, username);
	}
	
	/**
	 * У������
	 * @param password
	 * @return У��ͨ������true�����򷵻�false
	 */
	public static boolean isPassword(String password) {
		return Pattern.matches(REGEX_PASSWORD, password);
	}
	
	/**
	 * У���ֻ�����
	 * @param phone
	 * @return У��ͨ������true�����򷵻�false
	 */
	public static boolean isPhone(String phone) {
		return Pattern.matches(REGEX_PHONE, phone);
	}
	
	/**
	 * У������
	 * @param email
	 * @return У��ͨ������true�����򷵻�false
	 */
	public static boolean isEmail(String email) {
		return Pattern.matches(REGEX_EMAIL, email);
	}
}
