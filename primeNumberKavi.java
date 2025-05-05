package javaPraticePrograms;

public class primeNumberKavi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=30;
		boolean flag=true;
		if(num<=1) {
			flag=false;
		}
		else {
			for(int i=2;i<=Math.sqrt(num);i++) {
				if(num%i==0) {
					flag=false;
				}
			}
		}
		if(flag) {
			System.out.println(num +"is a Prime Number");
		}
		else {
			System.out.println(num + "is not a Prime Number");
		}

	}

}
