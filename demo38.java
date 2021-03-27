import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-12 13:39
 */
public class demo38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的身高 (cm)");
        int height = scanner.nextInt();
        System.out.println("请输入你的财富(千万)");
        double wealth = scanner.nextDouble();
        System.out.println("请输入你的颜值(true/false)");
        boolean tooler = scanner.nextBoolean();
        if (height >=180 && wealth >= 1 &&  tooler) {
            System.out.println("符合条件可以");
        }else if (height >=180 || wealth >=1 || tooler) {
            System.out.println("比上不足比下有余");
        }else {
            System.out.println("对不起！条件不符合");
        }
    }
}
