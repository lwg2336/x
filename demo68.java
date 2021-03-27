/**
 * @Auther LiuWeiGang
 * @Date 2021-03-27 9:35
 */
public class demo68 {
    public static void main(String[] args) {
        int x =1;
        while (x<=10) {
            System.out.println("进入循环x的初始值为=" + x);
            switch (x) {
                case 0:
                    System.out.println("进入switch语句 x=" + x);
                    break;
                case 1:
                    System.out.println("进入switch语句 x=" + x);
                    break;
                case 2:
                    System.out.println("进入switch语句:x=" + x);
                    break;
                case 3:
                    System.out.println("进入switch语句:x=" + x);
                    break;
            }
            if (x==5) {
                break;
            }
            x++;
            System.out.println("跳出switch循环但是还在循环中 ");
        }
    }
}
