/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 11:25
 */
public class demo15 {
    /*
    逻辑与逻辑或
     */

    public static void main(String[] args) {
        boolean a =true;
        boolean b= false;
        short c= 42;
        if ((c++==42) &&(b=true ))
            if ((a=false) || (++c==45))
                System.out.println("c="+c);
    }
}
