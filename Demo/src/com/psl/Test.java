package com.psl;

public class Test {

	public static int addSplitedNumber(int n) {

		int ress, addSqrs = 0;

		while (n > 0) {
			ress = n % 10;
			n = n / 10;
			addSqrs = addSqrs + ress;

		}
		return addSqrs;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 29, res, res1, numSqr = 0;
		int mm = n;
		int sqr, addSqr, addnumSqr;

		int num;
		// case1 - square the number > split that number > add that splitted
		// number
		System.out.println("Case-1");
		sqr = n * n;

		addSqr = Test.addSplitedNumber(sqr);

		System.out.println(" Remainder - " + addSqr);

		// case2 - split that number > square the splitted number > add that
		// number
		System.out.println("******************************************");
		System.out.println("Case - 2");
		while (mm > 0) {
			res = mm % 10;
			mm = mm / 10;

			numSqr = numSqr + (res * res);
		}

		addnumSqr = Test.addSplitedNumber(numSqr);

		System.out.println("add Case2 - " + addnumSqr);

		// Find MAX number between two

		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		if (addSqr == addnumSqr) {
			System.out.println("n is -- " + n);
			num = n;
			System.out.println("======");
		} else {
			num = 0;
			System.out.println("++++++");
		}

		System.out.println("iso number is - " + num);

		int Result;

		Result = Test.addSplitedNumber(num);
		System.out
				.println(" ***********  Final answer iso value is - ************ "
						+ Result);
	}

}
