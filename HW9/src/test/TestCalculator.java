package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Calculator;

class TestCalculator {

	Calculator calculator = new Calculator();

	@Test
	public void Should_add_two_numbers_and_return_result() {
		Assertions.assertEquals(2, calculator.add(1, 1));
	}

	@ParameterizedTest
	@CsvSource({"2,4","1,5","24,3"})
	public void Should_add_two_numbers_and_return_result_parameterized(int valueOne, int valueTwo) {
		// Implement
		Assertions.assertEquals(valueOne + valueTwo, calculator.add(valueOne, valueTwo));
	}

	@Test
	public void Should_substract_two_numbers_and_return_result() {
		// Implement
		Assertions.assertEquals(2, calculator.sub(4, 2));
	}

	@Test
	public void Should_multiply_two_numbers_and_return_result() {
		// Implement
		Assertions.assertEquals(2, calculator.multiply(2, 1));
	}

	@Test
	public void Should_divide_two_numbers_and_return_result() {
		// Implement
		Assertions.assertEquals(0.5f, calculator.divide(1, 2));
	}

	@Test
	public void Should_throw_an_arithmetic_exception_if_denominator_is_zero() {
		// Implement
		Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(1,0));

	}

}
