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


                checkVictory();
                return;
            }

        }

        // ve se é possivel/ inserir mais moedas


        // insere a moeda  na última posição disponivel da coluna

    }

    public boolean checkVictory() {

        // verifica se alguém ganhou
        for (col = 0; col < cols; col++) {

            for (row = 1; row < rows; row++) {

                if (cells[col][row].isPainted()) {

                    // verificar se um destes métodos é verdadeiro para concluir o jogo
                    checkRow(col, row);
                    checkCol(col, row);
                    checkDiagonalUp(col, row);
                    checkDiagonalDown(col, row);
                    continue;
                }
            }
        }
        return false;
    }

    public boolean checkCol(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int victRow = row + 3;

        if (victRow > rows - 1) {
            return false;
        }

        int counter = 0;
        for (row = row + 1; row <= victRow; row++) {

            if (cells[col][row].getColor() != tempColor) {
                return false;
            }


            if (cells[col][row].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                System.out.println("won col");
                return true;
            }
        }
        return false;
    }

    public boolean checkRow(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int victCol = col + 3;
        int counter = 0;

        if (victCol > cols - 1) {
            return false;
        }

        for (col = col + 1; col <= victCol; col++) {

            if (cells[col][row].getColor() != tempColor) {
                return false;
            }

            if (cells[col][row].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                System.out.println("won row");
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagonalUp(int col, int row) {

        //Array out of bound

        int victCol = col + 3;
        int victRow = row - 3;
        Color tempColor = cells[col][row].getColor();
        int counter = 0;

        if (victCol > cols - 1 || victRow < 1) {
            return false;
        }

        row -= 1;
        for (col = col + 1; col <= victCol; col++) {
            System.out.println(col + " " + row);
            if (cells[col + 1][row - 1].getColor() != tempColor) {
                return false;
            }

            if (cells[col][row].getColor() == tempColor) {
                ++counter;
                System.out.println("counter " + counter);
            }

            if (counter == 3) {
                System.out.println("Won Diagonal Up");
                return true;
            }
            row--;
        }
        return false;
    }


    public boolean checkDiagonalDown(int col, int row) {

        Color tempColor = cells[col][row].getColor();
        int victCol = col + 3;
        int victRow = row + 3;
        int counter = 0;

        if ((victCol) > cols - 1 || victRow > rows - 1) {
            return false;
        }

        for (col = col + 1; col <= victCol; col++, row++) {
            if (cells[col + 1][row + 1].getColor() != tempColor) {
                return false;
            }

            if (cells[col][row].getColor() == tempColor) {
                counter++;
            }

            if (counter == 3) {
                System.out.println("Won Diagonal Down");
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
