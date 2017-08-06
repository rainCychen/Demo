package Tetris;

public class O {
	Cell[] cells;// 属性,用来存储一个方块的四个格子的坐标
    /**
     * 构造方法，为属性cells进行初始化
     */
    public O() {
        this(0, 0);
    }
    /**
     * 构造方法，为属性cells进行初始化
     * 
     * @param row
     *            顺时针方向 ，第一个坐标的行
     * @param col
     *            顺时针方向 ，第一个坐标的列
     */
    public O(int row, int col) {
        cells = new Cell[4];
        // 按顺时针方向初始化Cell
        cells[0] = new Cell(row, col);
        cells[1] = new Cell(row, col + 1);
        cells[2] = new Cell(row + 1, col);
        cells[3] = new Cell(row + 1, col + 1);
    }
    /**
     * 按顺时针方向，打印方块中四个格子所在的坐标
     */
    public void print() {
        String str = "";
        for (int i = 0; i < cells.length - 1; i++) {
            str += "(" + cells[i].getCellInfo() + "), ";
        }
        str += "(" + cells[cells.length - 1].getCellInfo() + ")";
        System.out.println(str);
    }
    /**
     * 使方块下落一个格子
     */
    public void drop() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].row++;
        }
    }
    /**
     * 使方块左移一个格子
     */
    public void moveLeft() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col--;
        }
    }
    /**
     * 使用方块右移一个格子
     */
    public void moveRight() {
        for (int i = 0; i < cells.length; i++) {
            cells[i].col++;
        }
    }
}
