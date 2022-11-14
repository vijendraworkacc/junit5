package com.te.junit.project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

/* Maven is a powerful project management tool (adding jar files, creating build, documentation,
 * managing release versions, managing resources) that is based on POM (project object model).
 * 
 * Annotations:
 * 
 * @Test
 * @DisplayName
 * @Order
 * @TestMethodOrder
 * @BeforeEach
 * @AfterEach
 * @BeforeAll
 * @AfterAll
 * @Disabled
 * @RepeatedTest
 * 
 * Dependencies:
 * 1. junit-jupiter-engine
 * 2. junit-jupiter-api
 * 
 * Test case/ class
 * 
 * class name App -> test class name TestApp
 * method name save -> test method name testSave()
 * 
 * @TestMethodOrder(org.junit.jupiter.api.MethodOrderer.OrderAnnotation.class) -> This annotation is used to 
 * define the sequence at which the test methods are executed.
 * 
 * @Order(number) -> We can give an order number to a method.
 * 
 * We can also name the methods as test1Save(), test2Update(), test3Delete() to order the execution of the 
 * test methods. We can also do something like this test1ASave(), test1BSave(), test1CSave().
 * 
 * =====================
 * 
 * @Test -> Denotes that a method is a test method. Unlike JUnit 4’s @Test annotation, this annotation does 
 * not declare any attributes, since test extensions in JUnit Jupiter operate based on their own dedicated 
 * annotations. Such methods are inherited unless they are overridden.
 * 
 * @ParameterizedTest -> Denotes that a method is a parameterized test. Such methods are inherited unless 
 * they are overridden.
 * 
 * @RepeatedTest -> Denotes that a method is a test template for a repeated test. Such methods are inherited 
 * unless they are overridden.
 * 
 * @TestFactory -> Denotes that a method is a test factory for dynamic tests. Such methods are inherited 
 * unless they are overridden.
 * 
 * @TestTemplate -> Denotes that a method is a template for test cases designed to be invoked multiple times 
 * depending on the number of invocation contexts returned by the registered providers. 
 * Such methods are inherited unless they are overridden.
 * 
 * @TestClassOrder -> Used to configure the test class execution order for @Nested test classes in the 
 * annotated test class. Such annotations are inherited.
 * 
 * @TestMethodOrder -> Used to configure the test method execution order for the annotated test class; 
 * similar to JUnit 4’s @FixMethodOrder. Such annotations are inherited.
 * 
 * @TestInstance -> Used to configure the test instance life cycle for the annotated test class. 
 * Such annotations are inherited.
 * 
 * @DisplayName -> Declares a custom display name for the test class or test method. Such annotations 
 * are not inherited.
 * 
 * @DisplayNameGeneration -> Declares a custom display name generator for the test class. Such annotations 
 * are inherited.
 * 
 * @BeforeEach -> Denotes that the annotated method should be executed before each 
 * @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; 
 * analogous to JUnit 4’s @Before. Such methods are inherited unless they are overridden.
 * 
 * @AfterEach -> Denotes that the annotated method should be executed after each 
 * @Test, @RepeatedTest, @ParameterizedTest, or @TestFactory method in the current class; 
 * analogous to JUnit 4’s @After. Such methods are inherited unless they are overridden.
 * 
 * @BeforeAll -> Denotes that the annotated method should be executed before all 
 * @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; 
 * analogous to JUnit 4’s @BeforeClass. Such methods are inherited (unless they are hidden or overridden) and must be static (unless the "per-class" test instance lifecycle is used).
 * 
 * @AfterAll -> Denotes that the annotated method should be executed after all 
 * @Test, @RepeatedTest, @ParameterizedTest, and @TestFactory methods in the current class; 
 * analogous to JUnit 4’s @AfterClass. Such methods are inherited (unless they are hidden or overridden) 
 * and must be static (unless the "per-class" test instance life cycle is used).
 * 
 * @Nested -> Denotes that the annotated class is a non-static nested test class. 
 * @BeforeAll and @AfterAll methods cannot be used directly in a @Nested test class unless the "per-class" 
 * test instance life cycle is used. Such annotations are not inherited.
 * 
 * @Tag -> Used to declare tags for filtering tests, either at the class or method level; 
 * analogous to test groups in TestNG or Categories in JUnit 4. Such annotations are inherited at 
 * the class level but not at the method level.
 * 
 * @Disabled -> Used to disable a test class or test method; analogous to JUnit 4’s @Ignore. 
 * Such annotations are not inherited.
 * 
 * @Timeout -> Used to fail a test, test factory, test template, or lifecycle method if its execution 
 * exceeds a given duration. Such annotations are inherited.
 * 
 * @ExtendWith -> Used to register extensions declaratively. Such annotations are inherited.
 * 
 * @RegisterExtension -> Used to register extensions programmatically via fields. 
 * Such fields are inherited unless they are shadowed.
 * 
 * @TempDir -> Used to supply a temporary directory via field injection or parameter injection 
 * in a life cycle method or test method; located in the org.junit.jupiter.api.io package.
 * 
 * =======================
 * 
 * Assertions
 * Assumptions
 * 
 * */

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("Testing Message Class")
public class TestMessage {

	private String actual;
	private String expected;
	private Message message;
	private boolean condition;

	@RepeatedTest(value = 5, name = "--> {currentRepetition}/{totalRepetitions}")
	@DisplayName("Repeted Test!")
	public void repeatedTest() {
		System.out.println("(Repeated Test!)");
	}

	@BeforeAll
	public static void startUp() {
		System.out.println("--> startUp()!");
	}

	@AfterAll
	public static void cleanUp() {
		System.out.println("--> cleanUp()!");
	}

	/* This method will be executed before each test method! */
	@BeforeEach
	public void setUpBeforeEachTestMethod() {
		message = new Message();
		actual = message.getMessaage();
		expected = "This is the actual message!";
		System.out.println("-> setUpBeforeEachTestMethod()!");
	}

	/* This method will be executed after each test method */
	@AfterEach
	public void cleanUpAfterEachTestMethod() {
		message = null;
		actual = null;
		expected = null;
		System.out.println("-> cleanUpAfterEachTestMethod()!");
	}

	@Test
	@DisplayName("Test method for getMessage()!")
	@Order(33)
	// @Disabled
	public void testGetMessage() {
		Assertions.assertEquals(expected, actual);
		System.out.println("testGetMessage()!");
	}

	@Test
	@DisplayName("Test method for updateMessage()!")
	@Order(1)
	public void testUpdateMessage() {
		condition = message.updateMessaage();
		Assertions.assertTrue(condition);
		System.out.println("testUpdateMessage()!");
	}

	@Test
	@DisplayName("Test method for deleteMessage()!")
	@Order(5)
	public void testDeleteMessage() {
		System.out.println("testDeleteMessage()!");
	}
}
