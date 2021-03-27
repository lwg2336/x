import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-12 20:45
 */
public class demo40 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入合法的年份（如：2020）");
        int year = scanner.nextInt();
        if ((year % 4 ==0 && year % 100 !=0)||(year % 400 ==0)) {
            System.out.println(year+"年是闰年");
        }else {
            System.out.println(year+"年是平年");
        }
    }
}
