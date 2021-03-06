package com.psl;

import java.util.HashMap;
import java.util.Map;

public class Client {

	public static int addSplitedNumber(int n) {

		int ress, addSqrs = 0;

		while (n > 0) {
			ress = n % 10;
			n = n / 10;
			addSqrs = addSqrs + ress;

		}
		return addSqrs;
	}

	public static int getIsometricValue(int n, int m) {

		/*
		 * Write your code here Do not write System.out.println here or any
		 * other printing statements Your code may get 0 marks if you do not
		 * follow above instruction.
		 */

		int res, mm, sqr, addSqr, addnumSqr, num;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();

		if (n >= 0 && m <= 1000) {

			for (int i = n; i <= m; i++) {
				n = i;

				sqr = n * n;
				addSqr = Test.addSplitedNumber(sqr);

				mm = i;
				int numSqr = 0;
				while (mm > 0) {
					res = mm % 10;
					mm = mm / 10;
					numSqr = numSqr + (res * res);
				}

				addnumSqr = Test.addSplitedNumber(numSqr);

				if (addSqr == addnumSqr) {

					num = Test.addSplitedNumber(n);
					hmap.put(i, num);
				} else {
					num = 0;
				}

			}

			Map.Entry<Integer, Integer> maxEntry = null;

			for (Map.Entry<Integer, Integer> e : hmap.entrySet()) {
				if (maxEntry == null
						|| e.getValue().compareTo(maxEntry.getValue()) > 0) {

					//System.out.println(e.getKey() + " - " + e.getValue());
					maxEntry = e;

				}

			}

			if (maxEntry == null) {
				return 0;
			} else {

				return Test.addSplitedNumber(maxEntry.getKey());
			}

		} else {
			return 0;
		}

	}

	public static void main(String[] args) {

		/*
		 * You can use Console input as well with the help of Scanner or
		 * BufferedReader classes. Please provide input data in Input box on
		 * right side of window.
		 */
		int n = 43, m = 65;

		System.out.println(getIsometricValue(n, m));

	}

}
