import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-20 10:35
 */
public class demo53 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要猜的数");
        int num = (int)(Math.random() * 1000+1);
        int  gusses;
        do {
          System.out.println("猜吧！");
          gusses = scanner.nextInt();
          if (gusses == 0) {
              break;
          }
          if (gusses > num ) {
              System.out.println("猜的数太大了");
          }else if (gusses < num){
              System.out.println("猜的数太小了");
          }
        }while (gusses != num);
        if (gusses == num) {
            System.out.println("恭喜你猜对了");
        }else {
            System.out.println("请下次再来吧");
        }
    }
}
