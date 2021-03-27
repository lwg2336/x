/**
 * @Auther LiuWeiGang
 * @Date 2021-03-11 15:15
 */
public class demo28 {
    /*
     前++和后++
     */

    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        short z = 50;
        if ((z++==40) && (y=true)) {    //z=51>40    false
            z++;
        }
        if ((x=false) || (++z==43)){  //z=52>43
            z++;
        }
        System.out.println("z=" +z);
    }
}
