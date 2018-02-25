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

        for (row = rows - 1  ; row > 0; row--) {

           if (!cells[col][row].getPainted()) {
               cells[col][row].setColor(color);
               cells[col][row].isPainted();


           }



       }

        // col --> valor de coluna atualizado


        // ve se é possivel/ inserir mais moedas


        // insere a moeda  na última posição disponivel da coluna

    }

    public boolean checkVictory() {

        if ()
        // verifica se alguem ganhou
        // retorna true em vitoria
        return true;
    }


    public int getCols() {
        return cols;
    }

    public int getRows() {
        return rows;
    }

}
