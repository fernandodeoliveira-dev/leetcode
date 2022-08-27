package easy;

public class SortedSquaredArray {

    public static void main(String[] args) {
        int[] array = {-10, -5, 0, 5, 10};
        int[] result = sortedSquaredArray(array);

        printResult(result);
    }

    public static int[] sortedSquaredArray(int[] array) {

        int counter = array.length -1;
        int firstIndex = 0;
        int lastIndex = array.length -1;
        int[] out = new int[array.length];

        for (int i=0; i<array.length; i++) {
            if (Math.abs(array[firstIndex]) > Math.abs(array[lastIndex])) {
                out[counter - i] = array[firstIndex] * array[firstIndex];
                firstIndex++;
            } else {
                out[counter - i] = array[lastIndex] * array[lastIndex];
                lastIndex--;
            }
        }

        return out;
    }

    private static void printResult(int[] result) {
        for (int num: result) {
            System.out.println(num);
        }
    }

}
