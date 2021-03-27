import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 21:39
 */
public class demo34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长方形的长");
        double ch = scanner.nextDouble();
        System.out.println("请输入长方形的宽");
        double k = scanner.nextDouble();
        double zc = 2 * (ch + k);
        double mj = ch * k;
        System.out.println("长方形的周长为"+zc);
        System.out.println("长的方形的面积为"+mj);
    }
}
