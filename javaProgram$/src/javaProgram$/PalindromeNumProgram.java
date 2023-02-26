package javaProgram$;

public class PalindromeNumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Num=191;
		int Rev=0;
		int PalNum=Num;
		while(Num!=0) {
			Rev= Rev*10+ Num%10;
			Num=Num/10;
		}
		if(PalNum==Rev) {
			System.out.println("It is Palindrome Number");
		}
		else
			System.out.println("It is not a Palindrome Number");
	}

}
