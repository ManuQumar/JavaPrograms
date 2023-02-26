package javaProgram$;

public class FibinocciProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value=9;
		int n=0 , n1=1;
		int n3;
		System.out.print(n+" "+n1);
		for(int i=2; i<value; i++) {
			n3=n+n1;
			n=n1;
			n1=n3;
			System.out.print(n3);
		}
		//System.out.println(n3);
	}

}
