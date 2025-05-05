package javaPraticePrograms;

public class upperToLower {

	public void upperToLowerProgram() {
		String name ="I am, Saaral";
		char[] charArray = name.toCharArray();;
		for(int i=0;i<name.length();i++) {
			if((charArray[i]>=65) && (charArray[i]<=90)) {
				charArray[i]=(char)(charArray[i]+32);
			}
		}String c="";
		
		 for(int i=0;i<charArray.length;i++) { 
			 c=c+charArray[i];
			 }
		 System.out.println(c);
		 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		upperToLower upperToLowerPROGRAM = new upperToLower();
		upperToLowerPROGRAM.upperToLowerProgram();
		

	}

}
