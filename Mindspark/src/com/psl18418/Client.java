package com.psl18418;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static int findSize(int n, int[] cards) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		List<Integer> list = new ArrayList<>();
		List<Integer> grp = new ArrayList<>();
		if(n>=1 && n <=5000){
			
			for(int i=0 ; i<n ; i++){
				//System.out.println(cards[i]);
				if(i == 0){
					grp.add(cards[0]);
					if(cards[0] == cards[i]){
						
					}
				}
				
				
				
			}
			System.out.println("list created " + list);
			System.out.println("group " + grp);
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
