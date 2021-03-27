package anli;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-23 18:18
 */
public class CellTest {

    public static void main(String[] args) {
        Cell cell = new Cell();
        cell.row = 5;
        cell.col = 4;
//        cell.drop();
//        cell.moveLeft(3);
//        String str = cell.getCellInfo();
//        System.out.println(str);

        for (int i = 0;i<20; i++) {
            for (int j = 0;j<10;j++) {
                if (i==cell.row && j==cell.col){
                    System.out.print("* ");
                }else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
