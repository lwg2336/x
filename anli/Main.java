package anli;

import java.util.Scanner;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-25 19:30
 */
public class Main {
    public static void main(String[] args) {
        Cld cld = new Cld();
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入年份：");
        year = scanner.nextInt();
        String[][] a =new String[12][42];//因为要输出一年的日历，所以设置了12个月，每个月预留6*7=42个位置


        for(int i = 0;i<12;i++){
            cld.setDemo(year,i+1);
            a[i]=cld.getCalendar();
        }
        char[] str = "日 一 二 三 四 五 六".toCharArray();
        for(int i = 0 ;i<4;i++){
            for(int k = 0;k<3;k++){
                for(char c:str){
                    System.out.printf("%3c",c);
                }
                System.out.print("    ");
            }
            System.out.println();
            for(int j = 0 ;j<6;j++){
                for(int m = 0 ; m<3;m++){
                    for(int n = 0;n<7;n++){
                        System.out.printf("%6s",a[i*3+m][j*7+n]);//i*3+m表示当前月份，j*7+n表示当前日期，不用多解释了吧？
                    }
                    System.out.printf("   ");
                }
                System.out.println();
            }
        }


    }
}
