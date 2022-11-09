package com.ineuron.ai;




import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int count=0;
		System.out.print("Please enter the size of the array ! "+ " ");
		int size=scan.nextInt();
		int []a =new int [size];
		System.out.print("Please enter the elements of the array ! ");
		for(int i=0;i<a.length;i++) {
			a[i]=scan.nextInt();
		}
		int []b=new int[size];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
					System.out.println("Duplicate element found at index " +  j + "and the element is :-" + " " + a[i] );
					for(int k=0;k<b.length;k++) {
						b[k]=a[i];
					}
					break;
				}
			}
		}
		System.out.print("total no of duplicates present in the array are :- " +  count);
		
		

	}

}
