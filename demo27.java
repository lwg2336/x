import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 14:59
 */
public class demo27 {

    public static void main(String[] args) {
        int num,num1,num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个数进行比较最大值:");
        num = scanner.nextInt();
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        int max;
        if (num >=num1 && num > num2) {
            max = num;
        }else if (num1 >num2 && num1 >num) {
            max = num1;
        }else {
            max = num2;
        }
        System.out.println("三个数中最大值为="+max);

    }
}
