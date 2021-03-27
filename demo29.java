import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 20:33
 */
public class demo29 {

    /*
       声明两个int类型的变量并赋值，判断两数之和，如果大于等于50，则打印”helloworld“
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个值");
        int num = scanner.nextInt();
        System.out.println("请输入第二个值:");
        int num1 = scanner.nextInt();
        if (num+num1 < 50) {
            System.out.println("值太小了");
        }else if (num+num1 >= 50) {
            System.out.println("hello world");
        }

    }
}