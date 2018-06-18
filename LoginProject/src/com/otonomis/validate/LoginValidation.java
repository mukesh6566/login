package com.otonomis.validate;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginValidation {
	
	public static boolean validateEmail(String email)
	{
	
		   String regex = "^(.+)@(.+)$";
		    
		   Pattern pattern = Pattern.compile(regex);
		   
		   Matcher matcher = pattern.matcher(email);
		  /// System.out.println(email +" : "+ matcher.matches());
		   boolean status=matcher.matches();
		   return status;
	}

}
