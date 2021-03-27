import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 22:24
 */
public class demo36 {
    /*
      测算狗狗的年龄相当于人的年龄
     */

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("请输入狗狗的年龄");
     double num = scanner.nextDouble();
     if (num >= 0 && num <= 2) {
         System.out.println("狗狗的年龄是人的"+ num * 10.5);
     }else if (num > 2) {
         System.out.println("狗狗的年龄是人的年龄"+((2 * 10.5+(num - 2) * 4)));
     }

    }
}
