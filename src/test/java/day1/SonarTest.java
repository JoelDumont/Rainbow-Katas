package day1;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SonarTest {
    @Test
    public void isValueIncreasing_increasing_true() {
        final Sonar sonar = new Sonar();
        assertTrue(sonar.isValueIncreasing("1", "2"));
    }

    @Test
    public void isValueIncreasing_decreasing_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing("2", "1"));
    }

    @Test
    public void isValueIncreasing_sameInts_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing("2", "2"));
    }

    @Test
    public void isValueIncreasing_listDecreasing_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing("2", "1"));
    }

    @Test
    public void isValueIncreasing_listSameInts_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing("2", "2"));
    }

    @Test
    public void isValueIncreasing_intsSame_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing(2, 2));
    }

    @Test
    public void isValueIncreasing_intsIncreasing_true() {
        final Sonar sonar = new Sonar();
        assertTrue(sonar.isValueIncreasing(1, 2));
    }

    @Test
    public void isValueIncreasing_intsDecreasing_false() {
        final Sonar sonar = new Sonar();
        assertFalse(sonar.isValueIncreasing(2, 1));
    }



    @Test
    public void countNrOfIncreases_listOfIntsAllIntsDecreasing_zero() {
        //arrange
        final Sonar sonar = new Sonar();
        //act
        int count = sonar.countNrOfIncreases(List.of(2, 1, 0));
        //assert
        assertEquals(0, count);
    }

    @Test
    public void countNrOfIncreases_listOfIntsSomeIntsDecreases_decreasesNotCount() {
        //arrange
        final Sonar sonar = new Sonar();
        //act
        int count = sonar.countNrOfIncreases(List.of(2, 1, 2));
        //assert
        assertEquals(1, count);
    }


}
