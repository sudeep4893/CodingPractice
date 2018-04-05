package com.psl5418;

public class Client {

	public static int findStartArea(int n, int m, int[] fill, int[] use) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		int count = 0, sub;
		
		for(int i=0 ; i<fill.length ; i++){
						
			System.out.println("Value of full - " + fill[i] + " Value of use - " + use[i]);
			
				if(fill[i]>use[i]){
					sub = fill[i]-use[i];
					fill[i+1] = fill[i+1] + sub;
					System.out.println("Subtraction - " + sub);
				}else {
					count = count + 1;
				}
			
		}
		
		System.out.println("Count - " + count);
		return 0;
	}

	public static void main(String[] args) {

		/*
		 * You can use Console input as well with the help of Scanner or
		 * BufferedReader classes. Please provide input data in Input box on
		 * right side of window.
		 */
		int n = 3, m = 3;
		int fill[] = { 3, 1, 2 };
		int use[] = { 2, 2, 2 };

		System.out.println(findStartArea(n, m, fill, use));

	}

}
