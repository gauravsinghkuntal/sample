package com.ineuron;

public class DuplicatesCharacter {

	public static void main(String[] args) {
		String a="aabbccddeeeeeffffffffgggggglllllll";
		String b="";
		b+=a.charAt(0);
		char[] c= new char[a.length()];
		for(int i=1;i<a.length();i++)
		{
			if(a.charAt(i)==a.charAt(i-1))
			{
				
				c[i-1]=a.charAt(i-1);
				continue;
			}
		}
		System.out.print("duplicates characters and their occurences are :- ");
		for (char d : c) {
			
			System.out.print(d);
		}
	}
}
