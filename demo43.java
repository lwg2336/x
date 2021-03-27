import javax.swing.plaf.synth.SynthDesktopIconUI;
import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-13 7:28
 */
public class demo43 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入对应的数字:1.显示全部  2,查询所有   0,退出");
        int conttle = scanner.nextInt();
        switch (conttle) {
            case 1:
                System.out.println("显示所有");
                break;
            case 2:
                System.out.println("查询所有");
                break;
            case 0:
                System.out.println("欢迎下次再来");
                break;
            default:
                System.out.println("输入了非法的数字，请输入正确的数字");
        }
    }
}
