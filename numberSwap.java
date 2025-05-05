package javaPraticePrograms;

public class numberSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 11;
		int temp;
		System.out.println("Before value of A is " + a);
		System.out.println("Before value of B is " + b);
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("value of A is " + a);
		System.out.println("value of B is " + b);
		System.out.println("value of temp is " + temp);
		withoutVariable();
	}
	public static void withoutVariable() {
		int c = 11;
		int d = 12;
		//First = First-second // Second = First+Second // First = Second-First
		c=c-d;
		d=c+d;
		c=d-c;
		System.out.println("Value of C is " +c);
		System.out.println("Value of d is " +d);
		//First = First*second // Second = First/Second // First = First/Second
		c=c*d;
		d=c/d;
		c=c/d;
		
		System.out.println("Value of C is " +c);
		System.out.println("Value of d is " +d);
	}

}
