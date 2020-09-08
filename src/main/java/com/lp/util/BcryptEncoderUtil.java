package com.lp.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderUtil {

	public static final String encodePassword(String password) {
		BCryptPasswordEncoder enc = new BCryptPasswordEncoder();
		String encodePass = enc.encode(password);
		return encodePass;
	}
	
	/*
	 * public static void main(String[] args) {
	 * System.out.println(encodePassword("admin")); }
	 */

}
