import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 7:23
 */
public class demo12 {

    public static void main(String[] args) {
        int year;
        int month;
        int day =0;
        System.out.println("请输入正确的年份和月份");
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        month = scanner.nextInt();
        switch (month) {
            case 2:
                if ((year %4 ==0 && year %100 !=0) || (year % 400 ==0))
                    day = 29;
                else
                day =28;
                break;
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
            case 10:
            case 12:
                day = 31;
                break;
            default:
                System.out.println("输入的月份非法");
        }
        System.out.println(year+"年" + month +"月" +day +"日");
    }
}
