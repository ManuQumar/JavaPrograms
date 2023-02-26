package javaProgram$;

public class CountChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int count=0;
			String s="Manipulation";
			int len =s.length();
	//	char ch[]	=s.toCharArray();
		for(int i=0; i<len-1; i++) {
			s.charAt(i);
			count++;
		}
			System.out.println(count);
	}

}
