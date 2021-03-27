/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 20:40
 */
public class demo18 {

    public static void main(String[] args) {
        int a = 2;
        int b= 3;
        int c =88;
        System.out.println("a"+a+"b"+b+"c"+c);
        int max = ((a>b)?a : b);
        int maxa = ((max>c)?max:c);
        System.out.println(max);
        System.out.println(maxa);
    }
}
