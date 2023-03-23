package pl.javastart.euler2;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static pl.javastart.euler2.Euler2.sumUpEvenElementsWithLimit;

import java.io.ByteArrayOutputStream;
import java.util.Optional;

//import org.junit.jupiter.api.Assertions;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;


public class Euler2Test {
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

	@Test
	public void shouldReturnError() {
		//given
		int elementsNo = 10;
		int biggestElement = 1000;

		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);

		//then
		SoftAssertions softAssertions = new SoftAssertions();
		softAssertions.assertThat(sumOfEvenElements).isEqualTo(0);
		softAssertions.assertThat(outContent.toString()).contains("Zbyt krótka lista.");

	}

	@Test
	public void shouldReturn44() {
		//given
		int elementsNo = 10;
		int biggestElement = 34;

		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);

		//then
		Assertions.assertThat(sumOfEvenElements).isEqualTo(44);

	}

	@Test
	public void shouldReturnCorrectFibonacciNo() {
		//given
		int elementsNo = 40;
		int offset = 1;
		double goldenRatio = 1.6180339887;

		//when
		FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);
		int fibonacciLastIndex = fibonacci.getElementsNo()-1;
		int fibonacciLastElement = fibonacci.getFibonacci().get(fibonacciLastIndex);

		int lastElement = (int) Math.round((Math.pow(goldenRatio, (elementsNo + offset)) - Math.pow(1 - goldenRatio, (elementsNo + offset)))
								/ Math.sqrt(5));

		//then
		Assertions.assertThat(fibonacciLastElement).isEqualTo(lastElement);

	}
}
