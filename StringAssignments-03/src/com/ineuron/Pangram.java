package com.ineuron;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG";;
	    boolean bool=false;
		a=a.replace(" ", "");
		char[] b=a.toCharArray();
		int[] ar=new int[26];
		
		for(int i=0;i<b.length;i++)
		{
			int index=b[i]-65;
			ar[index]++;
		}
		for(int i=0; i<ar.length;i++)
		{
			if(ar[i]==0)
			{
				System.out.println("It is not a pangram");
				bool=true;
			}
		}
		if(bool==false)
		{
		System.out.println("It is a  pangram");
		}

	}

}
