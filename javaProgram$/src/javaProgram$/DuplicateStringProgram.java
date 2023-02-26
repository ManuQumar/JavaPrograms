package javaProgram$;

public class DuplicateStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name ="I Iam so sorry";
		int len= name.length();
		char[] ch=name.toCharArray();
		for(int i=0; i<len; i++) {
			for(int j=i+1; j<len; j++) {
				if(ch[i]==ch[j]) {
					System.out.print(" "+ ch[i]);
					break;
				}
			}
		}
	}

}
