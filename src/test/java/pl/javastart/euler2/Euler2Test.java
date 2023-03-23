package pl.javastart.euler2;

import static pl.javastart.euler2.Euler2.sumUpEvenElementsWithLimit;

import java.io.ByteArrayOutputStream;

import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class Euler2Test {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void shouldReturn10() {
        //given
        int biggestElement = 10;

        //when
        int sumOfEvenElements = sumUpEvenElementsWithLimit(biggestElement);

        //then
        Assertions.assertThat(sumOfEvenElements).isEqualTo(10);

    }

    @Test
    public void shouldReturn44() {
        //given
        int biggestElement = 34;

        //when
        int sumOfEvenElements = sumUpEvenElementsWithLimit(biggestElement);

        //then
        Assertions.assertThat(sumOfEvenElements).isEqualTo(44);

    }

    @Test
    public void shouldReturn188() {
        //given
        int biggestElement = 144;

        //when
        int sumOfEvenElements = sumUpEvenElementsWithLimit(biggestElement);

        //then
        Assertions.assertThat(sumOfEvenElements).isEqualTo(188);

    }
}
