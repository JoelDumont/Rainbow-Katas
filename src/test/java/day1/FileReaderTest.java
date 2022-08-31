package day1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    public static final String PATH_TO_FILE = "./src/test/resources/input.txt";

    @Test
    public void readLines_one_readFirstLine() {
        //arrange
        final FileReader fileReader = new FileReader(PATH_TO_FILE);
        //act
        final List<String> result = fileReader.readLines(1);
        //assert
        assertEquals(List.of("182"), result);
    }

    @Test
    public void readLines_nrOfLinesX_readXLines() {
        //arrange
        final FileReader fileReader = new FileReader(PATH_TO_FILE);
        //act
        final List<String> result = fileReader.readLines(2);
        //assert
        assertEquals(Arrays.asList("182", "188"), result);
    }

    @Test
    public void readAllLines_fileWithXLines_xLinesRead() {
        //arrange
        final FileReader fileReader = new FileReader(PATH_TO_FILE);
        //act
        final List<String> result = fileReader.readAllLines();
        //assert
        assertEquals(2_000, result.size());
    }
}
