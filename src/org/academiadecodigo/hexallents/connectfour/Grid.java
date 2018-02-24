package org.academiadecodigo.hexallents.connectfour;


/**
 * Created by codecadet on 24/02/2018.
 */
public class Grid {

    private Cell[][] cells;
    private int col;
    private int row;
    private int cols;
    private int rows;


    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;
        cells = new Cell[cols][rows];
    }

    public void createGrid() {

        for (col = 0; col < cols; col++) {

            for (row = 0; row < rows; row++) {

                cells[col][row] = new Cell(col * Cell.CELL_SIZE, row * Cell.CELL_SIZE);
            }

        }

    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

}
