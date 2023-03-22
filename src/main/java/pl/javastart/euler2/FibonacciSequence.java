package pl.javastart.euler2;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSequence {
	private int elementsNo;
	private List<Integer> fibonacci;

	public FibonacciSequence(int elementsNo) {
		this.elementsNo = elementsNo;
		fibonacci = createFibonacci(elementsNo);
	}

	private List<Integer> createFibonacci(int elementsNo) {
		List<Integer> fibonacci = new ArrayList<Integer>();
		int prevElement = 0;
		int nextElement = 1;
		int sum = 0;

		for (int i = 0; i < elementsNo; i++) {
			sum = (prevElement + nextElement);
			prevElement = nextElement;
			nextElement = sum;

			fibonacci.add(sum);
		}
		return fibonacci;
	}

	@Override
	public String toString() {
		return "FibonacciSequence{" +
				"fibonacci=" + fibonacci +
				'}';
	}

	public int getElementsNo() {
		return elementsNo;
	}

	public void setElementsNo(int elementsNo) {
		this.elementsNo = elementsNo;
	}

	public List<Integer> getFibonacci() {
		return fibonacci;
	}

	public void setFibonacci(List<Integer> fibonacci) {
		this.fibonacci = fibonacci;
	}
}
