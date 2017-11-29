package com.example.maven.git_with_branch_calculator_v10;

import static org.junit.Assert.assertEquals;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorV10Test {

	// instanserar objekt här = konstruktorn rä nåbar för alla metoder i klassen.
	CalculatorV10 c = new CalculatorV10();
	private static final Logger LOG = Logger.getLogger(CalculatorV10.class.getName());

	@Test
	public void testAdd() {

		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			firstNumber = random.nextInt(100); // = värde mellan 0-99
			secondNumber = random.nextInt(100); // = värde 0-99
			result = firstNumber + secondNumber;
			
			LOG.info("Testing the method add with " + firstNumber + " and " + secondNumber);
			assertEquals(c.add(firstNumber, secondNumber), result);
			LOG.info(c.add(firstNumber, secondNumber) + " = " + result + "\n");
		}
	}
	
	@Test
	public void testSubtract() {

		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			firstNumber = random.nextInt(100); // = värde mellan 0-99
			secondNumber = random.nextInt(100); // = värde 0-99
			result = firstNumber - secondNumber;
			
			LOG.info("Testing the method subtract with " + firstNumber + " and " + secondNumber);
			assertEquals(c.subtract(firstNumber, secondNumber), result);
			LOG.info(c.subtract(firstNumber, secondNumber) + " = " + result + "\n");
		}
	}
	
	@Test
	public void testMultiply() {

		Random random = new Random();
		int firstNumber = 0;
		int secondNumber = 0;
		int result = 0;

		for (int i = 0; i < 10; i++) {

			firstNumber = random.nextInt(100); // = värde mellan 0-99
			secondNumber = random.nextInt(100); // = värde 0-99
			result = firstNumber * secondNumber;
			
			LOG.info("Testing the method multiply with " + firstNumber + " and " + secondNumber);
			assertEquals(c.multiply(firstNumber, secondNumber), result);
			LOG.info(c.multiply(firstNumber, secondNumber) + " = " + result + "\n");
		}
	}

}
