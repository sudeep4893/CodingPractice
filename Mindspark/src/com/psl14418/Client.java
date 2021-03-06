package com.psl14418;

public class Client {

	/*
	 * public static int getWords(int a, int b) {
	 * 
	 * 
	 * Write your code here Do not write System.out.println here or any other
	 * printing statements Your code may get 0 marks if you do not follow above
	 * instruction.
	 * 
	 * 
	 * System.out.println("get Words budy..."); int count = 0; boolean word =
	 * true; if (a >= 1 && b <= 10000) {
	 * 
	 * for (int i = 1; i <= a; i++) { if (2 * i > a) {
	 * System.out.println("last value would be - " + i);
	 * 
	 * } if (2 * i <= a) { System.out.println("Condition 2 would be  - " + i);
	 * if(i >= 2 * i){ System.out.println(i); } } }
	 * 
	 * return count;
	 * 
	 * } else { return 0; }
	 * 
	 * }
	 */

	public static int getWords(int a, int b) {

		int ans = 0, i, j, k, t, case1Start = a / 2 + 1, MOD = 10007;
		/**
		 * Once again a DP problem 10:30 P.M.Time Complexity O(a*a*b) // Not a
		 * good Algorithm, might not fetch 100 marks 11:06 P.M. OPTIMIZED: Now
		 * code runs in O(a*b) // DP of DP :) Hint: At each position of the
		 * word, try to find the probabilty of a character to be present then
		 * count the sum of the possiblities of all the character at last
		 * position Note: Using long just to avoid using mod operation after
		 * each sum PLEASE FIX SEGMENTATION FAULT FOR C and C++
		 * */
		long DP[][] = new long[b][a + 1];
		for (i = 0; i < b; ++i) {

			long alwaysPossible = 0;
			System.out.println("case1Start - " + case1Start);
			long notAlwaysArray[] = new long[case1Start];
			System.out.println("notAlwaysArray - " + notAlwaysArray);
			if (i > 0) {
				k = i - 1;
				for (t = case1Start; t <= a; ++t) {
					alwaysPossible += DP[k][t];
				}
				if (alwaysPossible >= MOD)
					alwaysPossible %= MOD;
				// Optimization to O(a*b), now it's a good algo
				notAlwaysArray[0] = 0;
				notAlwaysArray[1] = DP[k][1];
				for (t = 2; t < case1Start; ++t) {
					notAlwaysArray[t] = notAlwaysArray[t - 1] + DP[k][t];
				}
			}
			for (j = 1; j <= a; ++j) {
				if (i == 0) {
					DP[i][j] = 1;// atFirst place all char can be used
				} else {

					DP[i][j] = alwaysPossible;// init
					/*
					 * //for O(a*a*b) solution (Won't pass all test case for
					 * standard time constraint) //Working on optimization
					 * for(t=1;t<case1Start;++t){ if(2*t>j){ break; } DP[i][j]
					 * += DP[k][t];
					 * 
					 * }
					 */
					/*
					 * for(t=1;2*t<=j;++t){ DP[i][j] += DP[k][t]; }
					 */

					/*
					 * long test = 0; for(t=1;2*t<=j;++t){ test += DP[k][t]; }
					 * 
					 * if(test != notAlwaysArray[j/2]){ //Opimization not
					 * working }
					 */
					DP[i][j] += notAlwaysArray[j / 2]; // Optimization to
														// O(a*b), now it's a
														// good algo
					if (DP[i][j] >= MOD)
						DP[i][j] %= MOD;
				}
			}
		}
		for (i = case1Start; i <= a; ++i) {
			ans += DP[b - 1][i];
			if (ans >= MOD)
				ans %= MOD;
		}
		return ans;
	}

	public static void main(String[] args) {

		int a = 5, b = 2;

		System.out.println(getWords(a, b));

	}

}
