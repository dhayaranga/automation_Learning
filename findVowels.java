package javaPraticePrograms;

public class findVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name = "Saaral is a good girleu";
char[] charArray= name.toCharArray();
char[] vowels= {'a','e','i','o','u'};
int count=0;
for(int i=0;i<name.length();i++) {
	for(int j=0;j<vowels.length;j++) {
		if(charArray[i]==vowels[j]) {
			count++;			
		}
	}
	
}System.out.println(count);
	}

}
