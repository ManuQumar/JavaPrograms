package javaProgram$;

public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= { 49 , 57, 23, 90, 32};
		//first i take first index as maximum value
		int max= a[0];
	for(int i=0; i<a.length; i++) {
		if(a[i]>max) {
			max=a[i];
		}
	}
		System.out.println(max);
	}

}
