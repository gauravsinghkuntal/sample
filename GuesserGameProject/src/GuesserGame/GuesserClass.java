package GuesserGame;

import java.util.Scanner;

class Input{

	public int inputChoice() {
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Please enter the Value you want to provode to the empire !");
		int a=scan.nextInt();
		return a;
		
	}
}

class Guessers{
	
	public int[] guessers() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter the number of players :- ");
		int size=scan.nextInt();
		System.out.println();
		int[] a=new int[size];
		System.out.println("Hey Players ! Welcome to the game , please enter your choices:- ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print("Hi Player " + " " + i + " " + "please provide your choice:-" + (a[i]=scan.nextInt()));
			System.out.println();
		}
		return a;
	} 
}


class Validator {

	boolean bool=false;
	Input input=new Input();
	int a=input.inputChoice();
	Guessers guessers=new Guessers();
	int[]b= guessers.guessers();
	public void validate() {
		for(int i=0;i<b.length;i++)
		{
			if(a==b[i])
			{
				bool=true;
				break;
			}
			else
			{
				continue;
			}
		}
		if(bool==true)
		{
			System.out.println("Congratulations ! you have correctly guessed the correct number and the number is:- " + a);
		}
		else 
		{
			System.out.println("OOPS ! you have incorrectly guessed the number . Better luck next time ");
		}
	}
}

public class GuesserClass {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		Validator validator=new Validator();
		System.out.println("Thank you for providing Imput  ");
		validator.validate();
		
		 
		
		
     
	
	}

}
