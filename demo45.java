import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-13 7:52
 */
public class demo45 {
    /*
     闰年判断
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正确的年份:");
        int year = scanner.nextInt();
        if ((year % 4==0 && year  % 100 !=0) || (year % 400==0)) {
            System.out.println(year+"是闰年");
        }else {
            System.out.println(year+"是平年");
        }
    }
}
