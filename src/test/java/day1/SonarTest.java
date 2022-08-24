package day1;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SonarTest {
    public static final String PATH_TO_FILE = "./src/test/resources/input.txt";

    @Test
    public void readLines_one_readFirstLine() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readLines(1);
        //assert
        assertEquals(List.of("182"), result);
    }

    @Test
    public void readLines_nrOfLinesX_readXLines() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readLines(2);
        //assert
        assertEquals(Arrays.asList("182", "188"), result);
    }

    @Test
    public void readAllLines_fileWithXLines_xLinesRead() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readAllLines();
        //assert
        assertEquals(2_000, result.size());
    }

    @Test
    public void isValueIncreasing_increasing_true() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertTrue(sonar.isValueIncreasing("1", "2"));
    }

    @Test
    public void isValueIncreasing_decreasing_false() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertFalse(sonar.isValueIncreasing("2", "1"));
    }

    @Test
    public void isValueIncreasing_sameInts_false() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertFalse(sonar.isValueIncreasing("2", "2"));
    }

    @Test
    public void countNrOfIncreases_allIncreasing_allIntsCount() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases("1", "2", "3");
        //assert
        assertEquals(2, count);
    }

    @Test
    public void countNrOfIncreases_allDecreasing_zero() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases("2", "1", "0");
        //assert
        assertEquals(0, count);
    }

    @Test
    public void countNrOfIncreases_someDecreases_decreasesNotCount() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases("2", "1", "2");
        //assert
        assertEquals(1, count);
    }

    @Test
    public void isValueIncreasing_intsSame_false() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertFalse(sonar.isValueIncreasing(2, 2));
    }

    @Test
    public void isValueIncreasing_intsIncreasing_true() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertTrue(sonar.isValueIncreasing(1, 2));
    }

    @Test
    public void isValueIncreasing_intsDecreasing_false() {
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        assertFalse(sonar.isValueIncreasing(2, 1));
    }

    @Test
    public void countNrOfIncreases_allIntsIncreasing_allIntsCount() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases(1, 2, 3);
        //assert
        assertEquals(2, count);
    }

    @Test
    public void countNrOfIncreases_allIntsDecreasing_zero() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases(2, 1, 0);
        //assert
        assertEquals(0, count);
    }

    @Test
    public void countNrOfIncreases_someIntsDecreases_decreasesNotCount() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        int count = sonar.countNrOfIncreases(2, 1, 2);
        //assert
        assertEquals(1, count);
    }

}
