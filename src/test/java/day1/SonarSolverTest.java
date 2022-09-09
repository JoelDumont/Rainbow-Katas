package day1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SonarSolverTest {
    private  static final String PATH_TO_FILE1 = "./src/test/resources/test1.txt";
    private  static final String PATH_TO_FILE2 = "./src/test/resources/test2.txt";
    private  static final String PATH_TO_FILE3 = "./src/test/resources/test3.txt";
    private static final int expectedIncreases1 = 6;
    private static final int expectedIncreases2 = 3;
    private static final int expectedIncreases3 = 6;



    @ParameterizedTest()
    @EnumSource(TestValue.class)
    public void solveSimpleTextFile(TestValue testValue){
        SonarSolver sonarSolver = new SonarSolver(testValue.filePath);
        assertEquals(testValue.expected, sonarSolver.solve());
    }

    private enum TestValue {
        FILE_1(PATH_TO_FILE1, expectedIncreases1),
        FILE_2(PATH_TO_FILE2, expectedIncreases2),
        FILE_3(PATH_TO_FILE3, expectedIncreases3);

        private String filePath;
        private int expected;

        TestValue(String filePath, int expected) {
            this.filePath = filePath;
            this.expected = expected;
        }
    }
}
