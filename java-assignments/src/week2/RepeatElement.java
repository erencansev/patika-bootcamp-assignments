package week2;

public class RepeatElement {
    public static void main(String[] args) {
        int[] arr = {10, 20, 20, 10, 10, 20, 5, 20};

        int[] repeat = new int[arr.length];
        boolean[] counted = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !counted[j]) {
                    count++;
                    counted[j] = true;
                }
            }
            if (!counted[i]) {
                repeat[i] = count;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (repeat[i] > 0) {
                System.out.println(arr[i] + " sayısı " + repeat[i] + " kere tekrar edildi.");
            }
        }
    }
}

