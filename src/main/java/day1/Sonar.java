package day1;

import java.util.List;

public class Sonar {
    public Sonar() {
    }

    public boolean isValueIncreasing(final String s1, final String s2) {
        return isValueIncreasing(Integer.parseInt(s1), Integer.parseInt(s2));
    }

    public boolean isValueIncreasing(int i1, int i2) {
        return i1 < i2;
    }

    public int countNrOfIncreases(List<Integer> ints) {
        int summe = 0;
        for (int i = 1; i < ints.size(); i += 1) {
            if (isValueIncreasing(ints.get(i -1), ints.get(i))) {
                summe++;
            }
        }
        return summe;
    }
}
