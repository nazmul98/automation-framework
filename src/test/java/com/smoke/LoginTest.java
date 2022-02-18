package com.smoke;

import com.generic.LoginPageEvent;

public class LoginTest {
	public static void main(String[] args) {
		LoginPageEvent lg = new LoginPageEvent();
		
		lg.getLoginPage();
		lg.getLogin();
		lg.tearDown();
	}
}
