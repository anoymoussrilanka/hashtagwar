package com.srilanka.hashtagwar;

public class Executor {
	
	public static void main(String[] args) {
		
		//update your facebook login details here.		

		final String userName = "facebook email id";
		final String password = "facebook password";
		
		FacebookOperation facebook = new FacebookOperation();
		
		facebook.loginFaceBook(userName,password);
//		facebook.createPost();
		facebook.commentPost("https://www.facebook.com/photo/?fbid=3113049145577181&set=gm.542241197625241",2);
	}

}
