import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-23 7:53
 */
public class demo62 {
    public static void main(String[] args) {
        int[] arr = {22,88,96,654,3258,45,8,64,35};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
