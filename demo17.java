/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 18:07
 */
public class demo17 {

    /*
      三元运算符:第一个表达式进行判断,如果值为true则执行第二个
     */
    public static void main(String[] args) {
        int a = 56;
        int b = 45;//三元运算符
        int c = 88;
       int max= ((a>b)? a : b);
       int max1 = ((max>c)? max:c);
       System.out.println(max1);
    }
}
