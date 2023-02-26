package javaProgram$;

public class SwapTwoStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="ABC";
String s2="ZYX";
	System.out.println("Before swap " + s1+" "+s2);
	s1=		s1+s2;
	s2=s1.substring(0, 3);
	s1=s1.substring(3);
	System.out.println("After swap " + s1+" "+s2);
	}

}
