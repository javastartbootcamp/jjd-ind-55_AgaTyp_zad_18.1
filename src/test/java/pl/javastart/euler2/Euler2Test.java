package pl.javastart.euler2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.javastart.euler2.Euler2.sumUpEvenElementsWithLimit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.assertj.core.api.Assertions;


public class Euler2Test {
//	private Euler2 euler2 = new Euler2();

	@Test
	public void shouldReturnError() {
		//given
		int elementsNo = 10;
		int biggestElement = 1000;
		Euler2 euler2 = new Euler2();

		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);

		//then
		Assertions.assertEquals(0, sumOfEvenElements);
//		assertThat(outContent.toString()).contains("Zbyt krótka lista.");
//		assertAll(
//				() -> assertEquals(0, sumOfEvenElements),
////				() -> Assertions.
//		);
//		Assertions.
	}

	@Test
	public void shouldReturn44() {
		//given
		int elementsNo = 10;
		int biggestElement = 34;
		Euler2 euler2 = new Euler2();

		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);

		//then
		Assertions.assertEquals(44, sumOfEvenElements);
		//		assertThat(outContent.toString()).contains("Zbyt krótka lista.");
		//		assertAll(
		//				() -> assertEquals(0, sumOfEvenElements),
		////				() -> Assertions.
		//		);
		//		Assertions.
	}

	@Test
	public void shouldReturnFibonacciNo() {
		//given
		int elementsNo = 100;
		int offset = 2;
		int biggestElement = 34;
		double goldenRatio = 1.6180339887;
		Euler2 euler2 = new Euler2();


		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int fibonacciLastIndex = fibonacci.getElementsNo()-1;
		int fibonacciPrevLastIndex = fibonacci.getElementsNo()-2;
		int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);

		//then
//		Assertions.assertEquals(44, sumOfEvenElements);
		//		assertThat(outContent.toString()).contains("Zbyt krótka lista.");
		//		assertAll(
		//				() -> assertEquals(0, sumOfEvenElements),
		////				() -> Assertions.
		//		);
		//		Assertions.
	}
}
