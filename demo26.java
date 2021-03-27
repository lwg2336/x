import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 21:49
 */
public class demo26 {
    /*
    ##第二题:分析以下需求，并用代码实现
​ 1.键盘录入一个三位整数数，请分别获取该三位数上每一位的数值
​ 2.例如：键盘录入的整数123的个位、十位、百位，分别是3、2、1
​ 3.打印格式:“数字123的个位是 3, 十位是 2, 百位是 1”
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int temp = scanner.nextInt();
        int bai = temp / 100;
        int shi = temp /10 %10;
        int ge = temp % 10;
        System.out.println("百位数是="+bai +"十位是="+shi+"个位是="+ge);
    }
}
