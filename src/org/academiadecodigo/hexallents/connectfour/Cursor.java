package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Cursor {

    private Grid grid;
    private Rectangle rectangle;
    private int col;


    public Cursor(Grid grid){
        this.grid = grid;
        rectangle = new Rectangle(Cell.PADDING, Cell.PADDING, Cell.CELL_SIZE, Cell.CELL_SIZE);
        rectangle.fill();
    }

    public void moveRight() {
        if(col < grid.getCols()-1){
            col++;
            rectangle.translate(Cell.CELL_SIZE, 0);
        }
    }

    public void moveLeft() {
        if( col > 0){
            col--;
            rectangle.translate(- Cell.CELL_SIZE, 0);
        }
    }

    public void dropCoin() {

        // verifica qual a coluna
        // col --> valor de coluna atualizado


        // ve se é possivel inserir mais moedas



        // insere a moeda  na última posição disponivel da coluna

    }
    public int cursorCol() {
        return col;
    }

}
