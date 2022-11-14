package com.te.junit.project;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class for Palindrome!")
public class TestPalindrome {
	private Palindrome palindrome;
	private String str;

	@BeforeEach
	public void setUpBeforeEachTestMethod() {
		str = "abba";
		palindrome = new Palindrome(str);
	}

	@Test
	@DisplayName("Testing isPalindrome() method!")
	public void testIsPalindrome() {
		System.out.println(palindrome.isPalindrome());
		Assertions.assertTrue(palindrome.isPalindrome());
	}

	@AfterEach
	public void cleanUpAfterEachTestMethod() {
		palindrome = null;
	}
}
