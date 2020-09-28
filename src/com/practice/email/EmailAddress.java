package com.practice.email;
import java.util.*;
public class EmailAddress {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email address");
		String email=sc.nextLine();
		if(email.matches("^(abc)"))
			System.out.println("valid email");
	}
}
