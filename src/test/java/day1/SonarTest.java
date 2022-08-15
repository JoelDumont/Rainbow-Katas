package day1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SonarTest {
    public static final String PATH_TO_FILE = "./src/test/resources/input.txt";

    @Test
    public void readFirstLine() {
        //arrange
        final Sonar sonar = new Sonar(PATH_TO_FILE);
        //act
        final String result = sonar.readFirstLine();
        //assert
        assertEquals(result,"182");
    }

    @Test
    public void firstTwoLines_increasingOrDecreasing() {
        //arrange
        //act
        //assert
    }
}
