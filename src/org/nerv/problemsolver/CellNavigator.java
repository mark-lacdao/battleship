package org.nerv.problemsolver;

import java.util.List;

/**
 * Created by tenjutsu25 on 3/13/14.
 */
public class CellNavigator {

    private Cell[][] cells;
    private int maxcol;
    private int maxrow;

    public CellNavigator(Battleground battleground) {
        this.cells = battleground.getCells();
        this.maxcol = battleground.getMaxcols() - 1;
        this.maxrow = battleground.getMaxrows() - 1;
    }

    public Cell getWestCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        if (colIndex == 0) {
            return null;
        }
        int westCellColIndex = colIndex - 1;
        return cells[rowIndex][westCellColIndex];
    }

    public Cell getEastCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        if (maxcol <= colIndex) {
            return null;
        }
        int eastCellColIndex = colIndex + 1;
        return cells[rowIndex][eastCellColIndex];
    }

    public Cell getNorthCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        if (rowIndex == 0) {
            return null;
        }
        int northRowIndex = rowIndex - 1;
        return cells[northRowIndex][colIndex];
    }

    public Cell getSouthCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        if (maxrow <= rowIndex) {
            return null;
        }
        int southCellRowIndex = rowIndex + 1;
        return cells[southCellRowIndex][colIndex];
    }

    public Cell getNorthWestCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        boolean northCellNull = getNorthCell(rowIndex, colIndex) == null;
        boolean westCellNull = getWestCell(rowIndex, colIndex) == null;
        if (northCellNull || westCellNull) {
            return null;
        }
        return cells[rowIndex - 1][colIndex - 1];
    }

    public Cell getSouthWestCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        boolean southCellNull = getSouthCell(rowIndex, colIndex) == null;
        boolean westCellNull = getWestCell(rowIndex, colIndex) == null;
        if (southCellNull || westCellNull) {
            return null;
        }
        return cells[rowIndex + 1][colIndex - 1];
    }

    public Cell getNorthEastCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        boolean northCellNull = getNorthCell(rowIndex, colIndex) == null;
        boolean eastCellNull = getEastCell(rowIndex, colIndex) == null;
        if (northCellNull || eastCellNull) {
            return null;
        }
        return cells[rowIndex - 1][colIndex + 1];
    }

    public Cell getSouthEastCell(int rowIndex, int colIndex) {
        validateIndices(rowIndex, colIndex);
        rowIndex--;
        colIndex--;
        boolean southCellNull = getSouthCell(rowIndex, colIndex) == null;
        boolean eastCellNull = getEastCell(rowIndex, colIndex) == null;
        if (southCellNull || eastCellNull) {
            return null;
        }
        return cells[rowIndex + 1][colIndex + 1];
    }

    public void validateIndices(int rowIndex, int colIndex) {
        if (rowIndex == 0 || colIndex == 0 || rowIndex > maxrow || colIndex > maxcol) {
            System.err.println("Invalid specified row and/or col indices.");
            System.exit(0);
        }
    }

}
