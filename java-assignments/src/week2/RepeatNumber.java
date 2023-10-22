package week2;

import java.util.Arrays;

public class RepeatNumber {
    public static void main(String[] args) {
        int[] list = {1, 33, 55, 42, 55, 1, 2, 64, 24, 11};
        int[] duplicate = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j] && !isFound(duplicate, list[i])) {
                    duplicate[startIndex++] = list[i];
                }
            }
        }

        int[] result = Arrays.copyOf(duplicate, startIndex);
        System.out.println(Arrays.toString(result));
    }

    static boolean isFound(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }
}
