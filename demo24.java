import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 21:43
 */
public class demo24 {
    /*
    ##第六题:分析以下需求，并用代码实现
    1.键盘录入三个int类型的数字
    2.要求：
    (1)求出三个数中的最小值并打印
    (2)求出三个数的和并打印
     */
    public static void main(String[] args) {
        System.out.println("请输入三个数字");
        Scanner scanner = new Scanner(System.in);
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int tree = scanner.nextInt();

        int temp = ((one < two)? one:two);
        int temps = ((temp < tree)? temp:tree);
        int he = one+two+tree;
        System.out.println("最小的数是"+temps);
        System.out.println("三个数的总和为"+he);
    }
}
