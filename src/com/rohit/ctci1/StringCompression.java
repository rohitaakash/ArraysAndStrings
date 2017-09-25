package com.rohit.ctci1;

public class StringCompression {
	public static void main(String[] args) {
		System.out.println(compressedString("aabbbccdddddaaaa"));
		System.out.println(compressedString("abcda"));
		
	}
	
	public static String compressedString(String str) {
		
		int count = 0;
		StringBuilder sb = new StringBuilder(getCompressedLength(str));
		for (int i = 0; i < str.length(); i++) {
			if(i!=str.length()-1 && str.charAt(i) != str.charAt(i+1)) {
				count++;
				sb.append(str.charAt(i));
				sb.append(""+count);
				count = 0;
			}else if (i == str.length()-1){
				count++;
				sb.append(str.charAt(i));
				sb.append(""+count);
			}else {
				count++;
			}
			
		}
		
		if(sb.length() >= str.length()) {
			return str;
		}else {
			return sb.toString();
		}
		
	}
	
	public static int getCompressedLength(String s) {
		int length = 0;
		for (int i = 0; i < s.length(); i++) {
			if(i != s.length()-1 && s.charAt(i) != s.charAt(i+1)) {
				length += 2;
			}else if (i == s.length()-1) {
				length += 2;
			}
		}
		return length;
	}
}
