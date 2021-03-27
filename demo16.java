/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 14:50
 */
public class demo16 {

    /*
     两个int类型的值进行交换
      也可以换成其他数据类型
     */

    public static void main(String[] args) {
        int num = 22;
        int num1 = 33;
        System.out.println("num="+num+"num1=" +num1);
        int temp;
        temp = num;
        num = num1;
        num1 = temp;
        System.out.println("num="+num+"num1=" +num1);
    }

}
