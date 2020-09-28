package com.practice.email;
import java.util.*;
public class EmailAddress {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email address");
		String email=sc.nextLine();
		if(email.matches("^(abc)[_+.-]{0,1}[a-zA-Z]*[@]{1}(bridgelabz|gmail|yahoo)[.]{1}(co|com|net)[.]{0,1}[a-z]{0,2}"))
			System.out.println("valid email");
	}
}
