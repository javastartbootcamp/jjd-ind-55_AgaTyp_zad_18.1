package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        int elementsNo = 40;
        int biggestElement = 4000000;

        FibonacciSequence fibonacci = new FibonacciSequence(elementsNo);

//        System.out.println(fibonacci);
//        System.out.println(fibonacci.getFibonacci().get(40-1));

        int sumOfEvenElements = sumUpEvenElementsWithLimit(fibonacci, biggestElement);
        System.out.println(sumOfEvenElements);
    }

    static int sumUpEvenElementsWithLimit(FibonacciSequence fibonacci, int biggestElement) {
        int fibonacciLastIndex = fibonacci.getElementsNo()-1;
        if (fibonacci.getFibonacci().get(fibonacciLastIndex) < biggestElement) {
//            System.err.println("Zbyt krótka lista.");
            System.out.println("Zbyt krótka lista.");;
            return 0;
        } else {
            return fibonacci.getFibonacci()
                    .stream()
                    .filter(x -> (x % 2 == 0) && (x <= biggestElement))
                    .mapToInt(x -> x)
                    .sum();
        }

    }
}
