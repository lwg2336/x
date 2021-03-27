import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-23 16:53
 */
public class demo63 {
    public static void main(String[] args) {
        int[] arry = {122,45,5,9,89,68,23,56,444,5789,654};
        Arrays.sort(arry);
        for (int i = 0;i<arry.length;i++) {
            System.out.println(arry[i]);

        }
    }
}
