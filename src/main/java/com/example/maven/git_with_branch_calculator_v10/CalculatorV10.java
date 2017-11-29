package com.example.maven.git_with_branch_calculator_v10;

public class CalculatorV10 {

	public int add(int firstNumber, int secondNumber) {

		return firstNumber + secondNumber;
	}

	public int subtract(int firstNumber, int secondNumber) {

		return firstNumber - secondNumber;
	}

	public int multiply(int firstNumber, int secondNumber) {

		return firstNumber * secondNumber;
	}

	public double division(int firstNumber, int secondNumber) {

		double result = 0;
		
		if (secondNumber != 0) {
			result = firstNumber / secondNumber;
		} else {
			System.out.println("\nDivision by zero is not possible and will give the fake result -0.123456789");
			result = -0.123456789;
		}
		return result;

	}

}
