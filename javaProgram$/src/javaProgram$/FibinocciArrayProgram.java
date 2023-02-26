package javaProgram$;

public class FibinocciArrayProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a[] = new int [10];
		int n= 	a.length;
		  a[0] = 0;
		  a[1] =1;
		  System.out.print(a[0]+" "+ a[1]);
		  for(int i=2; i<n; i++) {
			  a[i]= a[i-1]+a[i-2];
			  System.out.print(" " +a[i]);
		  }
		  
	}

}
