package javaProgram$;

public class ReverseStringg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Babu= "Krishna";
		String Rev="";
	int StrLen=	Babu.length();
	for(int i=StrLen-1; i>=0; i--) {
		Rev= Rev+Babu.charAt(i);
	}
	System.out.println(Rev);
	}

}
