package com.practice.email;
import java.util.*;
public class EmailAddress {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email address");
		String email=sc.nextLine();
		if(email.matches("^(abc)[@]{1}(bridgelabz)[.]{1}(co)"))
			System.out.println("valid email");
	}
}
