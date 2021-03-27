/**
 * @Auther LiuWeiGang
 * @Date 2021-03-22 17:56
 */
public class demo59 {

    public static void main(String[] args) {
        int[] arry = new int[10];
        for (int i = 0; i<arry.length;i++) {
            arry[i] = (int)(Math.random()*100);
            System.out.println(arry[i]);
        }
        int max = arry[0];
        for (int i = 1;i<arry.length;i++) {
            if (arry[i] > max) {
                max = arry[i];
            }
        }
        System.out.println("最大值为"+max);
    }
}
