import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-19 21:43
 */
public class demo49 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  num = (int)(Math.random()*1000+1);
        System.out.println("请输入你猜的数!");
        int gasser =  scanner.nextInt();
        while (gasser != num) {
            if (gasser == 0) {
                break;
            }
            if (gasser > num) {
                System.out.println("猜的数太大了");
            }else {
                System.out.println("猜的输太小了");
            }
            System.out.println("猜吧！");
            gasser = scanner.nextInt();
        }
        if (gasser == num) {
            System.out.println("恭喜你猜对了");
        }else {
            System.out.println("下次再来");
        }
    }
}
