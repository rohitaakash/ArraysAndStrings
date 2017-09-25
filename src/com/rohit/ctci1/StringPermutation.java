package com.rohit.ctci1;

public class StringPermutation {

	public static void main(String[] args) {

		//should return true
		System.out.println(isStringPermutation("john", "nohj"));
	}

	public static boolean isStringPermutation(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		
		int[] i = charCount(s1);
		int[] j = charCount(s2);
		
		for (int j2 = 0; j2 < j.length; j2++) {
			if(i[j2] != j[j2]) {
				return false;
			}
		}		
		return true;
	}
	
	public static int[] charCount(String s) {
		int[] characterCount = new int[128];
		for (int i = 0; i < s.length(); i++) {
			characterCount[s.charAt(i)] += 1; 
			
		}
		return characterCount;
	}
}
