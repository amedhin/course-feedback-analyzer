package com.gmail.aamedhin;

public class UserValidtaionService {

	public boolean isUserValid(String user, String password) {

		if (user.equals("teacher") && password.equals("teacher"))
			return true;
		else if (user.equals("student") && password.equals("student"))
			return true;
		else return false;
	}
}
