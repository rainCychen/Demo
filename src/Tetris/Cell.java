package Tetris;

public class Cell {
	int row;
    int col;
    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }
    public Cell() {
        this(0, 0);
    }
    
    public Cell(Cell cell) {
        this(cell.row, cell.col);
    }
        public String getCellInfo() {
        return row + "," + col;
    }
}
