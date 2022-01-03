package com.jenkin.jenkinTC;

import org.testng.annotations.Test;

import utility.BaseClass;

public class UserLogin extends BaseClass{
	
	@Test
	public void userLoginWithValidCredentials() {
		System.out.println("user Login With Valid Credentials");
	}

	@Test
	public void userLoginWithInvalidCredentials() {
		System.out.println("userLoginWithInvalidCredentials");
	}
}
