package javaProgram$;

public class SwappingwithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int Num= 100;
			int value= 200;
			System.out.println("before Swap " +Num + "   "+value);
			Num= Num*value;
			value=Num/value;
			Num=Num/value;
			System.out.println("after Swap " +Num + "   "+value);
	}

}
