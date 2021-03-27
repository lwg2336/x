/**
 * @Auther LiuWeiGang
 * @Date 2021-03-08 21:28
 */
public class demo4 {
    /**
     * 定义，length为周长
     * 定义  args面积
     * 用Math.PI获取π这个值
     * @param args
     */
     public static void main(String[] args) {
         double r =8.5;
         double length,area;
         length = 2*Math.PI*r;
         area = Math.PI*r*r;
         System.out.println("圆的周长为"+  length);
         System.out.println("圆的面积为"+ area);
     }
}
