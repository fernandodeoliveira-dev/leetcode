package easy;

import java.util.*;

public class TwoNumberSum {

    public static void main(String[] args) {

        int[] array = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;

        int[] result = twoNumberSum(array, targetSum);

        printResult(result);
    }

    private static void printResult(int[] result) {
        for (int num: result) {
            System.out.println(num);
        }
    }

    public static int[] twoNumberSum(int[] array, int targetSum) {

        Set<Integer> visitedSet = new HashSet<Integer>();

        for (int num: array) {
            if (visitedSet.contains(targetSum-num)) {
                return new int[]{targetSum-num, num};
            } else {
                visitedSet.add(num);
            }
        }
        return new int[0];
    }
}
