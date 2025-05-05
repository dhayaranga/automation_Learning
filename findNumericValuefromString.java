package javaPraticePrograms;

public class findNumericValuefromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Saaral123DK143";
int length = name.length();
int add=0;
for(int i=0;i<length;i++) {
	char b = name.charAt(i);
	if(Character.isDigit(b)) {
		add=add+Character.getNumericValue(b);
		
	}
	
}
System.out.println(add);
	}

}
