package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.simplegraphics.graphics.Color;
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

    public void cursorDropCoin() {
        grid.dropCoin(col, rectangle.getColor());
    }

    public int getCursorCol() {
        return col;
    }

    public void setColor(Color colorPlayer) {
        rectangle.setColor(colorPlayer);

    }

}
