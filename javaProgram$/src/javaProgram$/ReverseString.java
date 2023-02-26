package javaProgram$;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String PL= "JAva";
			String Rev= "";
			char[] ch=PL.toCharArray();
		int Num=	ch.length;
		System.out.println(Num);
		for(int i=Num-1; i>=0; i--) {
			Rev= Rev+ch[i];
		}
		System.out.println(Rev);
	}

}
