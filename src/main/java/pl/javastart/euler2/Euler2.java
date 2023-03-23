package pl.javastart.euler2;

public class Euler2 {

    public static void main(String[] args) {
        int biggestElement = 4000000;

        int sumOfEvenElements = sumUpEvenElementsWithLimit(biggestElement);
        System.out.println(sumOfEvenElements);
    }

    static int sumUpEvenElementsWithLimit(int biggestElement) {
        int prevElement = 0;
        int nextElement = 1;
        int newElement;
        int sumUpEvenElements = 0;

        do {
            newElement = (prevElement + nextElement);
            prevElement = nextElement;
            nextElement = newElement;
            if (newElement % 2 == 0) {
                sumUpEvenElements += newElement;
            }

        } while (newElement <= biggestElement);

        return sumUpEvenElements;

    }
}
