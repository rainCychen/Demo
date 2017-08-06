package Cell;

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
    public void drop() {
        row++;
    }
    
    public void moveLeft(int d) {
        col -= d;
    }
    
    public String getCellInfo() {
        return row + "," + col;
    }
    
    public void moveRight(int d) {
        col += d;
    }
    public void drop(int d) {
        row += d;
    }
    public void moveLeft() {
        col--;
    }
    public void moveRight() {
        col++;
    }
}
