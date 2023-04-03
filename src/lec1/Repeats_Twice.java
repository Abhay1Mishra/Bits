package lec1;

public class Repeats_Twice {
    public static void main(String[] args) {
        int rus = 0;
        int[] a = new int[]{4, 5, 3, 4, 5};

        for (int i = 0; i < a.length; i++) {
            rus ^= a[i];

        }
        System.out.println(rus);

    }
}
