package day1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class NumberOfIncreasesCounterTest {
    @Test
    public void countNrOfIncreases_listOfIntsAllIntsDecreasing_zero() {
        //arrange
        final NumberOfIncreasesCounter numberOfIncreasesCounter =  new NumberOfIncreasesCounter();
        //act
        int count = numberOfIncreasesCounter.countNrOfIncreases(List.of(2, 1, 0));
        //assert
        assertEquals(0, count);
    }

    @Test
    public void countNrOfIncreases_listOfIntsSomeIntsDecreases_decreasesNotCount() {
        //arrange
        final NumberOfIncreasesCounter numberOfIncreasesCounter =  new NumberOfIncreasesCounter();
        //act
        int count = numberOfIncreasesCounter.countNrOfIncreases(List.of(2, 1, 2));
        //assert
        assertEquals(1, count);
    }


}
