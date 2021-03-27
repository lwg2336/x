/**
 * @Auther LiuWeiGang
 * @Date 2021-03-22 20:47
 */
public class demo61 {

    public static void main(String[] args) {
        int[] a = {10,20,30,40,50,60};
        int[] a1 = new int[7];
        System.arraycopy(a, 1, a1, 0, 4);
        for ( int i = 0; i < a1.length;i++) {
            System.out.println(a1[i]);
        }
    }
}
