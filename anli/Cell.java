package anli;

/**
 * @Auther LiuWeiGang
 * @Date 2021-03-23 18:15
 */
public class Cell {
    int row;
    int col;
    void drop() {
        row++;
    }
    void moveLeft(int n) {
       col -= n;
    }
    String getCellInfo() {
        return row +"," +col;
    }
}
