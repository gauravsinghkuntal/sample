package com.ineuron;

 public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="2552";
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			b+=a.charAt(i);
		}
		if(a.equals(b))
		{
			System.out.println("It is palindrome !");
		}
		else 
		{
			System.out.println("It is not a palindome");
		}
	}
}
