package com.bhaskar.algorithms;

public class BubbleSort {
	
	
	static void bubbleSort(int [] arr){
		
		int n=arr.length;
		
		int temp=0;
		
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n-i; j++) {
				//if (arr[j-1]>arr[j]) {
					
		/*		     temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
					*/
					System.out.print(arr[j]);
				//}
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] =  {1,5,8,3,9,4};
		
	//	System.out.println("Before sorted array");
		
		for (int i = 0; i < arr.length; i++) {
		//	System.out.println(arr[i]);
		}
		
	//	System.out.println("After bubble sort");

			bubbleSort(arr);
			
			for (int i = 0; i < arr.length; i++) {
				
			//	System.out.println(arr[i]);
				
			}
	
	}
	

}
