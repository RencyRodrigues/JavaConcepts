package com.encaps_inheritance;

public class Login {
private String Username;
public String getUsername() {
	return Username;
}
public void setUsername(String username) {
	Username = username;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
private String Password;
	

	public void login() {
		System.out.println("Username:"+Username);
		System.out.println("Password:"+Password);
	}

}
