package com.rohit.ctci1;

public class PalindromePermutation {
	public static void main(String[] args) {
		System.out.println(isPalindromeString("ch o ch"));
	}

	public static boolean isPalindromeString(String s) {

		int characterLength = 0;
		int[] countChar = new int[26];
		for (int i = 0; i < countChar.length; i++) {
			countChar[i] = 0;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				countChar[s.charAt(i) - 'a'] = countChar[s.charAt(i) - 'a'] + 1;
				characterLength++;
			}
		}

		boolean check = false;
		
		if (characterLength % 2 == 0) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					if (countChar[s.charAt(i) - 'a'] % 2 != 0) {
						return false;
					}
				}
			}
			check = true;
		}else {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
					if (countChar[s.charAt(i) - 'a'] % 2 == 1) {
						if(check) {
							return false;
						}
						check = true;
					}
				}
			}
		}
		return check;

	}
}
