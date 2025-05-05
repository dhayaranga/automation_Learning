package javaPraticePrograms;

public class charOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "Dhayanithi Ranganathanaaa";
		String toLowerCase = name.toLowerCase();
		char[] b = toLowerCase.toCharArray();
		int count = 0;
		System.out.println(b.length);
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a') {
				count++;
			}

		}
		System.out.println("Occurance of A is : " + count);
	}

}
