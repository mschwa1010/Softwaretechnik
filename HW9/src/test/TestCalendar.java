package test;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calendar;

class TestCalendar {
	
	

	@ParameterizedTest
	@ValueSource(ints = {1804, 1932, 2020, 2280, 2396})
	public void Should_return_true(int year) {
		// Implement
		
		Calendar calendar = new Calendar(year);
			
		Assertions.assertTrue(calendar.isLeapYear());
	
	}

	@ParameterizedTest
	@ValueSource(ints = {1805, 1933, 2021, 2281, 2397})
	public void Should_return_false(int year) {
		
		Calendar calendar = new Calendar(year);

		Assertions.assertFalse(calendar.isLeapYear());
	}

	@ParameterizedTest
	@ValueSource(ints = {12,1321,3122,123123,12332})
	public void Should_return_if_year_is_leap(int year) {
		// Implement
		
		Calendar calendar = new Calendar(year);
		GregorianCalendar gregorianCalendar = new GregorianCalendar();
		
		Assertions.assertEquals(gregorianCalendar.isLeapYear(year), calendar.isLeapYear());
	}
	
	@ParameterizedTest
	@ValueSource(ints = {0, -1})
	public void shouldThrowIllegaLArgumentException(int year) {
		
		Calendar calendar = new Calendar(year);
		Assertions.assertThrows(IllegalArgumentException.class, () -> calendar.isLeapYear());
	}


}
