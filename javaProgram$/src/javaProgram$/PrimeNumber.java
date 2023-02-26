package javaProgram$;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// prime number means which divids with 1 and itself
		int Num=5;
		int count =0;
		if(Num>1) {
			for(int i=1; i<=Num; i++) {
if(Num%i==0) 
	count ++;
			}
if(count==2) {
	System.out.println("It is a prime Number");
}
else
	System.out.println("It is not a prime Number");
			}
		else
			System.out.println("Number should not be zero");
	}

}
