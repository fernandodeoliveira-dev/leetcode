package easy;

import java.util.Arrays;

public class TandemBicycle {

    public static void main(String[] args) {
        int[] redShirtSpeeds = {5, 5, 3, 9, 2};
        int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
        int result = tandemBicycle(redShirtSpeeds, blueShirtSpeeds, false);

        printResult(result);
    }

    public static int tandemBicycle(int[] redShirtSpeeds,
                                    int[] blueShirtSpeeds,
                                    boolean fastest) {

        Arrays.sort(redShirtSpeeds);
        Arrays.sort(blueShirtSpeeds);

        int idxAux = fastest ? blueShirtSpeeds.length - 1 : 0;

        int sum = 0;

        for (int i=0; i<redShirtSpeeds.length; i++) {
            sum += Math.max(redShirtSpeeds[i], blueShirtSpeeds[idxAux]);
            idxAux += fastest ? - 1 : 1;
        }

        return sum;
    }

    private static void printResult(int result) {
        System.out.println(result);
    }
}
