package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Sonar {
    final String pathToFile;

    public Sonar(final String pathToFile) {
        this.pathToFile = pathToFile;
    }

    public String readFirstLine() {
        try (final BufferedReader reader = new BufferedReader(new FileReader(pathToFile));) {
            return reader.readLine();
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}
