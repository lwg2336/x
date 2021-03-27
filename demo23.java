import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 21:36
 */
public class demo23 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入成绩:");
        int cj = scanner.nextInt();
        if (cj>90) {
            System.out.println("成绩优秀奖励1000元");
        }else if (cj<90 && cj>60){
            System.out.println("成绩中等");
        }else {
            System.out.println("没有及格需要努力");
        }
    }
}
