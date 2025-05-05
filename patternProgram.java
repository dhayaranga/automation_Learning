package javaPraticePrograms;

public class patternProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =5;
		int temp=1;
		for(int i=0;i<a;i++ ) {
			for (int j=0;j<=i;j++) {
			System.out.print( temp+"	");
			temp=temp+1;
			}
			System.out.println(" ");
		}
	int temp2 = 1;
	for(int i=0;i<a;i++ ) {
		for (int j=5;j>i;j--) {
		System.out.print( temp2+"	");
		temp2=temp2+1;
		}
		System.out.println(" ");
	}
}

}
