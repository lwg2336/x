import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 20:43
 */
public class demo30 {
    /*
     声明两个double类型的变量并赋值，判断第一个数大于10.0，且第二个数小于20.0，打印两数之和否则打印两数的乘积
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个类型为double类型的值:");
        double num = scanner.nextDouble();
        System.out.println("请输入第二个double类型的值:");
        double num1 = scanner.nextDouble();
        if (num >= 10.0 && num1 <= 20.0) {
            double num2 = num+num1;
            System.out.println("两个数的和为="+num2);
        }else if (num < 10.0 && num1 > 20.0){
            double num3 = num*num1;
            System.out.println("两个数的乘积为="+num3);
        }
    }
}
