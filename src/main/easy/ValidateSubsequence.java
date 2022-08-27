package easy;

import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
        var array = Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10);
        var sequence = Arrays.asList(1, 6, -1, 10);

        boolean result = isValidSubsequence(array, sequence);

        printResult(result);
    }

    private static void printResult(boolean result) {
        System.out.println(result);
    }

    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        int equalsElement = 0;

        for (int i=0;i<array.size();i++) {
            if (array.get(i)==sequence.get(equalsElement)) {
                equalsElement++;
            }

            if (equalsElement==sequence.size()) {
                return true;
            }
        }

        return false;
    }

}
