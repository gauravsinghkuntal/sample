package com.ineuron;

public class Anagram {


	public static void main(String[] args) {
		String a="abcdef";
		String b="fedcba";
		boolean bool=false;
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<b.length();j++)
			{
				if(a.charAt(i)==b.charAt(j))
				{
					bool =true;
					break;
				}
				else 
				{
					bool=false;
				}
			}
		}
		if(bool==true)
		{
			System.out.println("it is a anagram");
		}
		else 
		{
		    System.out.println("it is not a anagram !");
		}
	}
}
