package com.te.junit.project;

public class Palindrome {
	private String str = "";

	public Palindrome(String str) {
		super();
		this.str = str;
	}

	public boolean isPalindrome() {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			result += c;
		}
		if (result.equals(str))
			return true;
		return false;
	}

	public static void main(String[] args) {
		String str = "abbb";
		Palindrome palindrome = new Palindrome(str);
		System.out.println("The result is: " + palindrome.isPalindrome());
	}
}
