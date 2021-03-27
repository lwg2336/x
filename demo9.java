/**
 * @Auther LiuWeiGang
 * @Date 2021-03-09 22:17
 */
public class demo9 {
    /*
    求圆的面积
     */

    public static void main(String[] args) {
        double r = 8.5;  //定义半径
        double area ,length; //定义周长和面积的数据类型
        area = Math.PI*r*r;  //根据圆的面积公式
        length = 2*Math.PI * r;//根据圆周长的公式计算
        System.out.println("周长为"+length);
        System.out.println("半径为8.5圆的面积是"+area);


    }
}
