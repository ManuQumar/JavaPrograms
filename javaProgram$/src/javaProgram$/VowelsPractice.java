package javaProgram$;

public class VowelsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String s="apple";
			int count=0;
		//	char[] ch= s.toCharArray();
			for(int i=0; i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i) =='e'||s.charAt(i)=='i' || s.charAt(i) =='o'|| s.charAt(i)=='u')
			count++;
			}
			System.out.println(count);
	}

}
