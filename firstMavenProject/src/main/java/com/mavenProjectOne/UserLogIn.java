package com.mavenProjectOne;

import java.util.ResourceBundle;

public class UserLogIn {
	public int userLogin(String in_user, String in_password) {
		ResourceBundle rb = ResourceBundle.getBundle("config");
		String username = rb.getString("username");
		String password = rb.getString("password");

		if(in_user.equals(username) && in_password.equals(password)) {
			return 1;
		}else {
			return 0;
		}
	}
}
