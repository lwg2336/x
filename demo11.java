import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-09 22:51
 */
public class demo11 {
    public static void main(String[] args) {
        int year;
        int month;
        int days = 0;
        System.out.println("请输入完整的年份和月份:");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        month = scanner.nextInt();
        switch (month) {
            case 2:
                if ((year % 4==0 && year % 100 !=0) || (year % 400==0))
                    days = 29;
                else
                    days = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 10:
            case 12:
                days = 31;
                break;
            default:
                System.out.println("月份数据非法");
        }
        System.out.println(year+"年" + month +"月" +days +"天");
    }
}
