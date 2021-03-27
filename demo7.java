/**
 * @Auther LiuWeiGang
 * @Date 2021-03-09 21:37
 */
public class demo7 {
    /*
    给出一个年份，判断是闰年还时平年
     */
    public static void  main(String[] args) {

        int year = 2000;
        if ((year % 4 ==0 && year % 100 !=0) || (year % 400==0)) {
            System.out.println("2000年是闰年");
        }else {
            System.out.println("2000年是平年");
        }
    }
}
