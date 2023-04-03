package lec1;

public class Main {
    int count = 0;


    public static void main(String[] args) {
        byte a = 22;
        byte b = 28;
        byte x = (byte) (a ^ b);
        System.out.println(findd(x));

    }

    private static int findd(int n) {

        int count = 0;
        while (n > 0) {
            n =n&(n-1);
            count++;
        }
        return count;
    }
}