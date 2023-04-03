package lec1;

public class Two_non_repeating {

    public static void main(String[] args) {
        int[] a =new int[]{2,3,4,3,2,5};
        two_repeat(a);
    }

    private static void two_repeat(int[] a) {
        int xor =0;
        int x = 0,y =0;
        for (int i=0;i<a.length;i++){
            xor^=a[i];
        }
        int right_mostBit = (xor & (-xor));

        for (int i=0;i<a.length;i++){
            if ((a[i] & right_mostBit) !=0){
                x ^=a[i];
            }
            else
                y^=a[i];
        }
        System.out.println(x+ "  "+y);
    }
}
