package com.psl;

public class QuickSort {

	public void sort(int arr[], int low, int high){
		
		if(low<high){
			int pi = partition(arr,low,high);
		}
		
	}
	
	private int partition(int[] arr, int low, int high) {
		// TODO Auto-generated method stub
		
		return 0;
	}

	public static void main(String[] args) {

		System.out.println("Quick Sort Example");
		int arr[] = {10,7,9,5,2};
		int n = arr.length;
		QuickSort obj = new QuickSort();
		obj.sort(arr, 0, n-1);
		
	}

}
