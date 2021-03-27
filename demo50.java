import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-20 6:57
 */
public class demo50 {

    public static void main(String[] args) {
        System.out.println("请输入圆的半径");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double zhouc, mianji;
        zhouc = 2 * Math.PI * num;
        System.out.println("圆的周长为="+zhouc);
        mianji = Math.PI * num * num;
        System.out.println("圆的面积为="+mianji);
    }
}
