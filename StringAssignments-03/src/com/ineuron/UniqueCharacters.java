package com.ineuron;

public class UniqueCharacters {

	public static void main(String[] args) {
		
		String a="abcdefaa ";
		a=a.trim();a=a.replaceAll(" ", "");a=a.toLowerCase();
		boolean bool=false;
		for(int i=0;i<a.length();i++)
			{
		   for(int j=(i+1);j<a.length();j++)
		   {
			   if(a.charAt(i)==a.charAt(j))
			   {
				   bool=true;
				   break;
			   }
			   else
			   {
				   bool=false;
			   }
		   }
		   if(bool==true) break;
		   
			}
		if(bool==true)
		{
			System.out.println("Provided string does not contain unique characters ");
		}
		else 
		{
			System.out.println(" Provided string contains unique characters");
		}
		}
}
