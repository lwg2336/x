import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 21:13
 */
public class demo21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int a = scanner.nextInt();
        int bai = a / 100 %10;
        int shi = a / 10 % 10;
        int ge = a % 10;
        System.out.println("数字123的个位是 :"+ge+"十位是:"+ shi + "百位是:"+bai);


    }
}
