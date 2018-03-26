package pl.ttpc.cleancode;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import pl.ttpsc.cleancode.WeightedAverageCalculator;

import static org.junit.Assert.*;

public class WeightedAverageCalculatorTest {

    private WeightedAverageCalculator sut;

    @Before
    public void setUp() {
        sut = new WeightedAverageCalculator();
    }
    @After
    public void tearDown() {
        sut = null;
    }

    @Test
    public void shouldReturnMinValue() {
        sut.add(1);
        sut.add(-1);
        sut.add(0);

        assertEquals(-1, sut.getMin());
    }
    @Test
    public void shouldReturnMaxValue() {
        sut.add(1);
        sut.add(-1);
        sut.add(0);

        assertEquals(1, sut.getMax());
    }
    @Test
    public void shouldReturnCountOfItem() {
        sut.add(3);
        sut.add(3);
        sut.add(3);
        sut.add(3);

        assertEquals(4, sut.getCount(3));
    }
    @Test
    public void shouldReturnCountOfItemAsString() {
        sut.add(1);
        sut.add(1);

        assertEquals("2", sut.getCountAsString(1));
    }

    @Test
    public void shouldCalculateAverage() {
        sut.add(-1);
        sut.add(-1);
        sut.add(2);
        sut.add(2);
        sut.add(4);

        assertEquals(1.2, sut.calculateAverage(), 0.000001);

    }
}