package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateSubsequence {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(5, 1, 22, 25, 6, -1, 8, 10));
        List<Integer> sequence = new ArrayList<>(Arrays.asList(1, 6, -1, 10));

        boolean result = isValidSubsequence(array, sequence);

        printResult(result);
    }

    private static void printResult(boolean result) {
        System.out.println(result);
    }

    public static boolean isValidSubsequence(List<Integer> array,
                                             List<Integer> sequence) {
        int found = 0;

        for (int i=0;i<array.size();i++) {
            if (array.get(i)==sequence.get(found)) {
                found++;
            }

            System.out.print("Item: " + array.get(i));
            System.out.println(", found " + found + " of " + sequence.size());

            if (found==sequence.size()) {
                return true;
            }
        }

        return false;
    }

}
