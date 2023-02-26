package javaProgram$;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num= 4321;
		int Rev=0;
		while(Num!=0) {
			Rev= Rev*10+Num%10;
			Num= Num/10;
		}
		System.out.println(Rev);
	}

}
