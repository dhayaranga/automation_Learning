package javaPraticePrograms;

import java.util.Arrays;

public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int a[] = { 5000, 789, 5000, 678, 991, 553, 2000 };
		int smallest = Integer.MAX_VALUE;
		for(i=0;i<a.length;i++) {
			if(a[i]<smallest) {
				smallest= a[i];
			}

		}
		System.out.println(smallest);
		Arrays.sort(a);
		System.out.println(a[0]);
	}

}
