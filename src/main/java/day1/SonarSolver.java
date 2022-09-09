package day1;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class SonarSolver {
    private final FileReader reader;

    public SonarSolver(String filePath) {
        reader = new FileReader(filePath);
    }

    public int solve() {
        List<Integer> lines = reader.readAllLines().stream()
                .map(Integer::parseInt)
                .collect(toList());
        return NumberOfIncreasesCounter.countNrOfIncreases(lines);
    }
}
