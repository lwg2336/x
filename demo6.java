/**
 * @Auther LiuWeiGang
 * @Date 2021-03-09 16:09
 */
public class demo6 {

    /*
     输入一个三位数的整数，打印出个位，百位，十位的数
     */
    public static void main(String[] args) {
       int num = 156;
       int bai = num / 100;
       int shi = num % 100 /10;
       int ge = num % 10;
       System.out.println(bai);
       System.out.println(shi);
       System.out.println(ge);
    }
}
