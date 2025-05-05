package javaPraticePrograms;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 13;
		boolean b = true;
		if(a<=1)
		{
			b=true;
		}
		else {
			for(int i=0;i<=Math.sqrt(a);i++) {
				if(a%i==0) {
					b=false;
				}
			}
		}
	}

}
