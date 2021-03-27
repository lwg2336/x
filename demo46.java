import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-13 7:56
 */
public class demo46 {
    /*
      使用switch判断闰年或者平年
     */

    public static void main(String[] args) {
        int year;
        int month;
        int day = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入合法的年份：");
        year = scanner.nextInt();
        System.out.println("请输入合法的月份：");
        month = scanner.nextInt();
        switch (month) {
            case 2:
                if ((year % 4==0 && year % 100!=0) || (year % 400 ==0)) {
                    day = 29;
                }else {
                    day = 28;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
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
                System.out.println("输入了非法的月份");
        }
        System.out.println(year +"年" +month +"月"+"是"+day+"天") ;

    }
 }
