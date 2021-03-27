import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 21:07
 */
public class demo31 {

    /*
       在控制台输入一个狗的年龄;狗出生的前两年没一岁相当于人的10.5岁，以后则是相当于人的四岁,
       请计算一下狗狗的年龄相当于人多的年纪
     */

      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("请输入狗狗的年龄");
          double dogAge = scanner.nextDouble();
          if (dogAge >=0 && dogAge <= 2) {
              System.out.println("狗狗的年龄相当于人的年龄是="+ dogAge*10.5);
          }else if (dogAge >2 ) {
              System.out.println("狗狗的年龄相当于人年龄是="+ (2 * 10.5 +(dogAge - 2)*4));
          }
      }
}
