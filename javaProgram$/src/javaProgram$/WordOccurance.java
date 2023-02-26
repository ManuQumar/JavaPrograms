package javaProgram$;

import java.util.HashMap;

public class WordOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word= "I love my self and my family";
//		char[]	ch=word.toCharArray();
//		for(int i=0; i<word.length() ;i++) {
//			for( int j=i+1; j<word.length(); j++) {
//			if(	ch[i]==ch[j]) {
//				System.out.println("these are the repeated characters " +ch[j]);
//				break;
//			}
//			
//			}
//		}
		// first you spilt the word so that you can store into string array
		//as single word
		String [] Single= word.split(" ");
		// here we use empty hashmap
				HashMap<String, Integer> map = new HashMap<String, Integer>();
				for( String Word : Single) {
					if(map.containsKey(Word)) {
						map.put(Word, map.get(Word)+1);
					}
					else {
						map.put(Word, 1);
					}
				}
				System.out.println(map);
	}

}
