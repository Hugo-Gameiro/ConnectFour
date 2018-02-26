package org.academiadecodigo.hexallents.connectfour;


import org.academiadecodigo.simplegraphics.graphics.Color;

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

    public void dropCoin(int col, Color color) {

        //insert coin if row available
        for (row = rows - 1; row > 0; row--) {

            if (!cells[col][row].isPainted()) {
                cells[col][row].setColor(color);
                cells[col][row].setPainted();
            }
        }



        // ve se é possivel/ inserir mais moedas


        // insere a moeda  na última posição disponivel da coluna

    }

    public boolean checkVictory() {

        // verifica se alguém ganhou
        for (col = 0; col < cols; col++) {

            for (row = 0; row < rows; row++) {

                if (cells[col][row].isPainted()) {

                    //verificar se um destes métedos é verdadeiro para concluir o jogo
                    checkRow(col, row);
                    checkCol(col, row);
                    checkDiagonalUp(col, row);
                    checkDiagonalDown(col, row);
                }
            }

            return true;

        }
        return false;
    }

    public boolean checkRow(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int counter = 0;
        for (row = row; row < row + 4; row++) {
            if (cells[col][row].getColor() == null) {
                return false;
            }

            if (cells[col][row].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean checkCol(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int counter = 0;
        for (col = col; col < col + 4; col++) {
            if (cells[col][row].getColor() == null) {
                return false;
            }

            if (cells[col][row].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalUp(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int counter = 0;
        for (col = col; col < col + 4; col++) {
            if (cells[col+1][row-1].getColor() == null) {
                return false;
            }

            if (cells[col][col].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                return true;
            }
        }
        return false;
    }


    public boolean checkDiagonalDown(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int counter = 0;
        for (col = col; col < col + 4; col++) {
            if (cells[col+1][row+1].getColor() == null) {
                return false;
            }

            if (cells[col][col].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                return true;
            }
        }
        return false;
    }

    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

}
