package javaProgram$;

public class ReverseNumberr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num= 9876;
//StringBuffer BF= new StringBuffer(String.valueOf(num));
// StringBuffer Reverse = BF.reverse();
// System.out.println(Reverse);
		StringBuilder SB= new StringBuilder();
		SB.append(num);
	StringBuilder	rev= SB.reverse();
	System.out.println(rev);
	}

}
