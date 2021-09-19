package com.springbootcrud;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
		String password="editor";
		String encodedPassword = encoder.encode(password);
		System.out.println("Encoded password : "+encodedPassword);
	}
	 
}
