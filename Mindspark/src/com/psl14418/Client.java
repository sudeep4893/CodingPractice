package com.psl14418;

public class Client {

	public static int getWords(int a, int b) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		System.out.println("get Words budy...");
		int count = 0;
		boolean word = true;
		if (a >= 1 && b <= 10000) {

			for (int i = 1; i <= a; i++) {
				if (2 * i > a) {
					System.out.println("last value would be - " + i);
					
				}
				if (2 * i <= a) {
					System.out.println("Condition 2 would be  - " + i);
					if(i >= 2 * i){
						System.out.println(i);
					}
				}
			}

			return count;

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		int a = 5, b = 2;

		System.out.println(getWords(a, b));

	}

}