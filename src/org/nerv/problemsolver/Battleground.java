package org.nerv.problemsolver;

/**
 * Created by tenjutsu25 on 3/13/14.
 */
public class Battleground {

    private Cell[][] cells;

    private int maxrows;
    private int maxcols;

    public Battleground(int maxrows, int maxcols) {
        this.maxrows = maxrows;
        this.maxcols = maxcols;
        this.cells = new Cell[maxrows][maxcols];
        populate();
    }

    public int getMaxrows() {
        return maxrows;
    }

    public int getMaxcols() {
        return maxcols;
    }

    public void printPlot() {
        for (Cell[] cellRows : getCells()) {
            for (Cell cell : cellRows) {
                System.out.print("[".concat(cell.toString()).concat("]"));
            }
            System.out.println();
        }
    }

    public Cell[][] getCells() {
        return cells;
    }

    public void populate() {
        for (int rowpop = 0; rowpop < maxrows; rowpop++) {
            for (int colpop = 0; colpop < maxcols; colpop++) {
                Cell cell = new Cell();
                System.out.println("Adding to " + rowpop + "-" + colpop);
                getCells()[rowpop][colpop] = cell;
            }
        }
    }

    //TODO: Move this later
    public void setNumberedCell(int rowIndex, int colIndex, int number) {
        rowIndex--; colIndex--;
        cells[rowIndex][colIndex].setNumber(number);
    }

}
