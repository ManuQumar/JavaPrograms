package javaProgram$;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="RACEE";
		String s1="CARE";
		if(s.length()!=s1.length()) {
			System.out.println("These are not Anagram Strings");
			
		}
		char [] ch=s.toCharArray();
		char [] ch1=s1.toCharArray();
		Arrays.sort(ch);
		Arrays.sort(ch1);
		System.out.println(Arrays.equals(ch, ch1));
	}

}
