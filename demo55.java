/**
 * @Auther LiuWeiGang
 * @Date 2021-03-22 12:26
 */
public class demo55 {

    public static void main(String[] args) {
        //7*8=56

        for (int num = 1; num <= 9; num++) {
            for (int i = 1; i <= num; i++) {
                System.out.print(i + "*" + num + "=" + i * num + "\t");
            }
            System.out.println();
        }
    }
}
