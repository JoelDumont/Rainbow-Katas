package day1;

import java.util.List;

public class NumberOfIncreasesCounter {
    public NumberOfIncreasesCounter() {
    }

    private static boolean isValueIncreasing(int i1, int i2) {
        return i1 < i2;
    }

    public static int countNrOfIncreases(List<Integer> ints) {
        int summe = 0;
        for (int i = 1; i < ints.size(); i += 1) {
            if (isValueIncreasing(ints.get(i -1), ints.get(i))) {
                summe++;
            }
        }
        return summe;
    }
}
