import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-13 7:46
 */
public class demo44 {
    /*
      age年龄判断
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年龄  （1-100）");
        int Age = scanner.nextInt();
        if (Age >0 && Age <= 30) {
            System.out.println("儿童时期");
        }else if (Age > 30 && Age <= 60) {
            System.out.println("中年时期");
        }else{
            System.out.println("老年时期");
        }
    }
}
