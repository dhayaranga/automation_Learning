package javaPraticePrograms;

public class numbersSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abs = 516;
		int reversed = 0;
		while (abs != 0) {
			reversed = reversed * 10;
			reversed = reversed + abs % 10;
			abs = abs / 10;
		}
		System.out.println(reversed);
	}

}
