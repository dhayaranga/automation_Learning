package javaPraticePrograms;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Saaral";
		char[] charArray = name.toCharArray();
		String reversed="";
		
		String c = "DK";
/*		StringBuffer buffer = new StringBuffer();
		//buffer.append(a).reverse();
		//System.out.println(buffer);
		String news = buffer.reverse().toString();
		System.out.println(news);
		
		StringBuilder builder = new StringBuilder();
		String b = builder.append(c).reverse().toString();
		System.out.println(b);
*/		
		for(int i=charArray.length-1;i>=0;i--) {
			reversed=reversed+charArray[i];
		}
		System.out.println(reversed);
		
		//Swap Number:
		int first = 20;
		int second = 40;
		first=first-second;
		second = first+second;
		first = second - first;
		System.out.println("second :" +second+ "first :"+ first);
		
		//Reverse Number
		int number=12345678;
		int reversednum=0;
		while(number!=0) {
		reversednum=reversednum*10;
		reversednum=reversednum+number%10;
		number=number/10;
		}
		System.out.println(reversednum);
		
		//Length of the String
		int length=0;
		for(char a:charArray) {
		length++;	
		}System.out.println(length);
		
		//Find smallest number
		int givenArray[]= {1,2,3,6,9,10};
		int smallValue = Integer.MAX_VALUE;
		
		for(int i=0;i<givenArray.length;i++) {
			if(givenArray[i]<smallValue)
			{
				smallValue=givenArray[i];
			}
		}System.out.println(smallValue);
	}
	
	
}
