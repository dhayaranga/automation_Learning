package javaPraticePrograms;

import java.util.Scanner;

public class reverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String a = s.nextLine();
		String b="";
		
		String[] temp = a.split(" ");
		for(int c=temp.length-1;c>=0;c--) {
			b=b+temp[c]+" ";
		}
		System.out.println(b);
		
	}

}
