package javaProgram$;

public class PalindromeStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Name="wafifaw";
		String Rev="";
	int Strlen=	Name.length();
	for(int i=Strlen-1; i>=0; i--) {
		Rev= Rev+Name.charAt(i);
	}
	if(Name.equalsIgnoreCase(Rev)) {
		System.out.println("It is a palindrome String");
	}else
		System.out.println("It is not a palindrome String");
	}

}
