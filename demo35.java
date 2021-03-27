import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 22:08
 */
public class demo35 {
    /*
      需求：键盘输入一个圆的半径的值，并且计算圆的周长和面积

     */
    public static void main(String[] args) {
        double perimeter,area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入圆的半径值为：");
        double num = scanner.nextDouble();
        perimeter = 2 * Math.PI * num;
        area = Math.PI * num * num;
        System.out.println("圆的周长为="+perimeter);
        System.out.println("圆的面积为="+area);
    }
}
