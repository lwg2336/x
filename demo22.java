/**
 * @Auther LiuWeiGang
 * @Date 2021-03-10 21:28
 */
public class demo22 {

    public static void main(String[] args) {
        short s = 20;
        int i = 30;
        s+=i; //s=s+i  s= 20+30
        System.out.println(s);
        int x = 0;
        int y = 0;
        int z = 0;
        boolean a,b;
//        a = x>0 & y++>1;
//        System.out.println("a="+a);  //false
//        System.out.println("y="+y); //1

//        b = x>0 && z++>1;
//        System.out.println("b="+b);
//        System.out.println("z="+z);

        a = x>0 || y++>1;
        System.out.println("a="+a);
        System.out.println("y="+y);
    }
}
