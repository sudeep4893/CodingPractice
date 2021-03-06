package com.psl9418;

public class Client {

	public static int findStartArea(int n, int m, int[] fill, int[] use) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		
		int result = 0;

		try{
		if(n >= 2 && n <= 1000 && m >= 1 && m <= 1000){
		
		for (int i = 0; i < n; i++) {

			int count = 0;
			int currentPetrol=0;
			boolean isComplete=true;
			int j = i;
			
			while(count<n){
				if(j>n-1){
					j = j-n;
				}
				
				currentPetrol+=fill[j]-use[j];
				
				if(currentPetrol > m){
					currentPetrol = m;
				}
				
				if(currentPetrol < 0){
					isComplete = false;
					break;
				}
				count++;
				j++;
			}
			
			if(isComplete == true){
				result++;
			}
		}

		return result;
		}else{
			return 0;
		}
		
		}catch(Exception e){
			return 0;
		}
	}

	public static void main(String[] args) {

		int n = 4000, m = 10;
		int fill[] = { 5,4,9,10 };
		int use[] = { 3,4,8,2};

		System.out.println(findStartArea(n, m, fill, use));

	}

}
