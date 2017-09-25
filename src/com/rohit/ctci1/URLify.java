package com.rohit.ctci1;

public class URLify {

	public static void main(String[] args) {
		System.out.println(urlString("Mr John Smith    ".toCharArray(), 13 ));
	}
	
	public static char[] urlString(char[] s, int trueLength) {
		
		int countSpaces = 0;
		for (int i = 0; i < trueLength; i++) {
			if(s[i] == ' ') {
				countSpaces++;
			}
		}
		
		int urlLength = trueLength + countSpaces*2;	
		if(trueLength < s.length) {
			s[trueLength] = '\0';
		}
		
		for (int i = trueLength - 1, j = urlLength - 1; i >= 0; i--) {
			if(s[i] == ' ') {
				s[j] = '0';
				s[j-1] = '2';
				s[j-2] = '%';
				j = j - 3;
			}else {
				s[j] = s[i];
				j = j - 1;
			}
		}
		return s;
	}
}
