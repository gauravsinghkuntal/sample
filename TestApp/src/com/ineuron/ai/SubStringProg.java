package com.ineuron.ai;



	public class SubStringProg {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			
			int[]a= {20,10,30};
		    int[] b= {10,20,30,40};	

			for(int j=0;j<a.length;j++) {
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=0;
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			}
			
			for(int j=0;j<a.length;j++) {
				for(int i=0;i<a.length-1;i++)
				{
					if(b[i]>b[i+1]) 
					{
						int temp=0;
						temp=b[i];
						b[i]=b[i+1];
						b[i+1]=temp;
					}
				}
				}

		    boolean bool=false;
		    for(int i=0;i<a.length;i++)
		    {
		    	for(int j=0;j<b.length;j++)
		    	{
		    		if(a[i]==b[j]) {
		    			bool=true;
		    			continue;
		    		}
		    		else {
		    			bool=false;
		    			break;
		    		}
		    	}
		    }
			
		    if(bool=true) System.out.println("Array is substring of parent array");
		    else System.out.println("This Array is not a substring of parent array");
		    
//			for(int j=0;j<a.length;j++) {
//			for(int i=0;i<a.length-1;i++)
//			{
//				if(a[i]>a[i+1])
//				{
//					int temp=0;
//					temp=a[i];
//					a[i]=a[i+1];
//					a[i+1]=temp;
//				}
//			}
//			}
//			
//			for(int j=0;j<a.length;j++) {
//				for(int i=0;i<a.length-1;i++)
//				{
//					if(b[i]>b[i+1]) 
//					{
//						int temp=0;
//						temp=b[i];
//						b[i]=b[i+1];
//						b[i+1]=temp;
//					}
//				}
//				}
	//
//			System.out.println(a);
//			System.out.println(b);
		   
		}

	}

