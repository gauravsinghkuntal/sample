package com.ineuron.ai;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a= {100,90,80,70,10};
		for(int j=0;j<a.length;j++) {
		for(int i=0;i<a.length-1-j;i++) {  // we have used because we don't want to iterate over already iterated element 
			if(a[i+1]<a[i]) 
			{
				
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
			}
		}
		}
		for(int b:a) {
			System.out.print(b + " ");
		}
		
//int[] a= {7,5,2,3,1,4,6};
//		
//		
//			for(int j=1;j<a.length;j++)
//			{
//				if(a[j]<a[j-1])
//				{
//					int tempVar=a[j];
//					a[j]=a[j-1];
//					a[j-1]=tempVar;
//				}
//			}
//		
//		
//		for(int el:a)
//		{
//			System.out.print(el+" ");
//		}
//		

	}

}
