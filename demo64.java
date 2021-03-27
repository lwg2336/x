import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-26 18:23
 */
public class demo64 {
    public static void main(String[] args) {
        int year, month;
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入正确的年份   如：2020");
        year = scanner.nextInt();
        System.out.println("请输入月份   如：1--12月");
        month = scanner.nextInt();
        switch (month) {
            case 2:
                if ((year % 4==0 && year % 100 !=0) || year % 400 ==0) {
                    day = 29;
                }else {
                    day = 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            default:
                System.out.println("输入的月份非法了");
        }
        System.out.println(year+"年"+month+"月"+day+"天");
    }
}
