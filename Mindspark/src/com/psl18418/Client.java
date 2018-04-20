package com.psl18418;

public class Client {

	public static int findSize(int n, int[] cards) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		if(n>=1 && n <=5000){
			
			for(int i=0 ; i<n ; ++i){
				System.out.println(cards[i]);
			}
			return 1;
			
		}else{
		
			return 0;
			
		}
		
	}

	public static void main(String[] args) {

		int n = 7;
		int cards[] = { 4, 5, 2, 3, -4, -3, -5 };

		System.out.println(findSize(n, cards));

	}

}