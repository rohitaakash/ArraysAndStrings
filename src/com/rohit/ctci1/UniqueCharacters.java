package com.rohit.ctci1;

public class UniqueCharacters {

	public static void main(String[] args) {

		//should return false as 'o' gets repeated
		System.out.println(isUnique("John Doe"));
	}
	
	public static boolean isUnique(String s) {
		int[] characterCount = new int[128];
		for (int i = 0; i < s.length(); i++) {
			characterCount[s.charAt(i)] += 1; 
			if(characterCount[s.charAt(i)] > 1) {
				return false;
			}
		}
		
		return true;
		
	}

}
