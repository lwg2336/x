import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-08 21:51
 */
public class demo5 {
   public static void main(String[] args) {
       int year = 2000;
       if ((year % 4==0 && year % 100 !=0)||(year % 400 ==0)) {
           System.out.println("是闰年");
       }else  {
           System.out.println("是平年");
       }
   }
}
