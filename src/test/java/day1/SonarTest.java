package day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SonarTest {
    public static final String PATH_TO_FILE = "./src/test/resources/input.txt";

    @Test
    public void readFirstLine() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readLines(1);
        //assert
        assertEquals(List.of("182"), result);
    }

    @Test
    public void readMultipleLines() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readLines(2);
        //assert
        assertEquals(Arrays.asList("182", "188"), result);
    }

    @Test
    public void readAllLines() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final List<String> result = sonar.readAllLines();
        //assert
        assertEquals(2_000, result.size());
    }

    @Test
    public void compareTwoLines_increasing() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        boolean count = sonar.compareLines("1", "2");
        //assert
        assertEquals(true,  count);
    }

    @Test
    public void compareTwoLines_decreasing() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        boolean count = sonar.compareLines("2", "1");
        //assert
        assertEquals(false,  count);
    }
    @Test
    public void compareTwoLines_same() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        boolean count = sonar.compareLines("2", "2");
        //assert
        assertEquals(false,  count);
    }

    @Test
    public void compareThreeLines_increasing() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        boolean count = sonar.compareLines("1","2","3");
        //assert
        assertEquals(false,  count);
    }
}
