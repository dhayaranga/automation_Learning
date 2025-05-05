package javaPraticePrograms;

import java.util.Scanner;

public class stringReverse {
	static Scanner s;
	static String a;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		s = new Scanner(System.in);
		a = s.nextLine();
		StringBuffer sbuf = new StringBuffer();
		sbuf.append(a);
		System.out.println(sbuf.reverse());
		methodTwo();

	}

	public static void methodTwo() {
		char charArray[] = a.toCharArray();
		String afterReversal = "";
		int arraySize = charArray.length;
		for (int i = arraySize - 1; i >= 0; i--) {
			afterReversal = afterReversal + charArray[i];

		}
		System.out.println(afterReversal);
	}

}
