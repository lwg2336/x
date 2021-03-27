import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-12 21:00
 */
public class demo42 {
    /*
      for循环
     */
    public static void main(String[] args) {

        int sun = 0;
        int temp;
        for (int i = 0;i <=10; i++) {
            temp = i*i;
            System.out.println(temp+"");
            sun +=temp;  //sun = sun+temp
        }
        System.out.println();
        System.out.println(sun);
    }
}
