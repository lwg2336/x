import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-12 14:47
 */
public class demo39 {
    /*
     从键盘上输入一个年月日计算输入的日期是这一年的第几天
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份:");
        int year = scanner.nextInt();
        System.out.println("请输入月份:");
        int month = scanner.nextInt();
        System.out.println("请输入日期:");
        int day = scanner.nextInt();
        int days = 0;
        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += day;  //days = day+days
        }
        System.out.println("今天是"+year+"年"+"中的第"+days+"日");
    }
}
