package com.ineuron;

public class ConsonantsProg {

	public static void main(String[] args) {
		
		char []vowels= {'a','e','i','o','u'};
		char[]characters= {'!','@','#','$','%','^','&','*','(',')','-','+','=','_'};
		char[]consonent= {'q','w','r','t','y','u','p','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m'};
		int count_vowels=0;
		int count_consonents=0;
		int count_characters=0;
		String a="aeiou";
		for(int i=0;i<a.length();i++)
		{
			for(int j=0;j<vowels.length;j++)
			{
				if(a.charAt(i)==vowels[j])
				{
					count_vowels++;
				}
				if(a.charAt(i)==characters[j])
				{
					count_characters++;
				}
				if(a.charAt(i)==consonent[j])
				{
					count_consonents++;
				}
				
			}
		}
		System.out.println("the total number of vowels,characters and consonents in the string are :-  " +  "vowels:- " + count_vowels +"characters:-"
				+ count_characters + "consonents" + count_consonents);
	}
}
