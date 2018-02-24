package org.academiadecodigo.hexallents.connectfour;

import java.awt.*;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Cursor {

    private Grid grid;
    private Cell cursor;
    private int col;
    private int row;

    public Cursor(){
        cursor = new Cell(0,0);
    }

    public void moveRight() {
        if( col < grid.getCols()) {
            col++;

        }
    }

    public void moveLeft() {
        if( col > 0){
            col--;
        }
    }

}
