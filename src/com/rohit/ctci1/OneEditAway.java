package com.rohit.ctci1;

public class OneEditAway {

	public static void main(String[] args) {
		System.out.println(isOneEditAway("Pale", "Ple"));
		
	}
	
	public static boolean isOneEditAway(String str1, String str2) {
		if(str1.length() == str2.length()) {
			return stringReplace(str1, str2);
		}else if(str2.length() - str1.length() == 1) {
			return stringInsert(str1, str2);
		}else if(str1.length() - str2.length() == 1) {
			return stringInsert(str2, str1);
		}else {
			return false;
		}
	}
	
	public static boolean stringReplace(String s1, String s2) {
		boolean replace = false;
		for (int i = 0; i < s1.length(); i++) {
			if(s1.charAt(i) != s2.charAt(i)) {
				if(replace) {
					return false;
				}
				replace = true;
			}
			
		}
		return replace;
	}
	
	public static boolean stringInsert(String s1, String s2) {
		boolean insert = false;
		for (int i = 0, j = 0; i < s1.length(); ) {
			if(s1.charAt(i) != s2.charAt(j)) {
				if(insert) {
					return false;
				}
				insert = true;
				j++;
			}else {
				i++;
				j++;
			}
			
		}
		return insert;
	}
}
