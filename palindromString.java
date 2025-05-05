package javaPraticePrograms;

public class palindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "madam";
		char[] a = s.toCharArray();
		String reversed = "";
		for(int i=a.length-1; i>=0;i--) {
			reversed=reversed+a[i];
			
		}
		System.out.println(reversed);
		if(s.equals(reversed)) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palindrome");
		}

	}

}
