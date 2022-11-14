package com.te.junit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/*
 * @Test
 * @DisplayName
 * @Disabled
 * @Order
 * @TestMethodOrder
 * @BeforeEach
 * @AfterEach
 * @BeforeAll
 * @AfterAll
 * @RepeatedTest
 * 
 * */

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Test Cases For Message Class")
public class TestMessage {

	@RepeatedTest(value = 5, name = ": {currentRepetition}/{totalRepetitions}")
	@DisplayName("Repeated Test")
	public void aRepeatedTest() {
		System.out.println("---> aRepeatedTest()!");
	}

	@BeforeAll
	public static void startUp() {
		System.out.println("--> startUp()!");
	}

	@BeforeEach
	@DisplayName("Set Up Before Each Test")
	public void setUpBeforeEachTest() {
		System.out.println("-> setUpBeforeEachTest()!");
	}

	@Test
	@DisplayName("Get Message Test")
	@Order(22)
	public void testGetMessage() {
		System.out.println("testGetMessage()!");
	}

	@Test
	@DisplayName("Send Message Test")
	// @Disabled
	@Order(1)
	public void testSendMessage() {
		System.out.println("testSendMessage()!");
	}

	@Test
	@DisplayName("Update Message Test")
	@Order(2)
	public void testUpdateMessage() {
		System.out.println("testUpdateMessage()!");
	}

	@AfterEach
	@DisplayName("Clean Up Before Each Test")
	public void cleanUpAfterEachTest() {
		System.out.println("-> cleanUpAfterEachTest()!");
	}

	@AfterAll
	public static void cleanUp() {
		System.out.println("--> cleanUp()!");
	}
}
