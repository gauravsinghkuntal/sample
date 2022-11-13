package com.ineuron;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="aabbccddeeeeeffffffffgggggglllllll";
		String b="";
		b+=a.charAt(0);
		for(int i=1;i<a.length();i++)
		{
			if(a.charAt(i)==a.charAt(i-1))
			{
				continue;
			}
			else 
			{
			for(int j=i+1;j<a.length();j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					b+=a.charAt(i);
					break;
				}
			}
			}
			
		}
        System.out.println("Input String is :- " + a);
        System.out.println("==========================");
        System.out.println("processing ........");
        System.out.println("==========================");
		System.out.println("String without any duplicates is :- " + b );
	}

}
