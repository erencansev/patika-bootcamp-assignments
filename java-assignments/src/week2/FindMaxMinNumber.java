package week2;

public class FindMaxMinNumber {
    public static void main(String[] args) {
        int [] list = {56, 34, 1, 8, 101, -2, 33};

        int first = list [0];
        int last = list [list.length - 1];

        System.out.println("ilk Değer " + first);
        System.out.println("son Değer " + last);

        int min = list [0];
        int max = list [0];

        for (int i : list){
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }

}



