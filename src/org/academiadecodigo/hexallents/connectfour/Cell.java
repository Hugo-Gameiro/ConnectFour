package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Cell {

    private int row;
    private int col;
    public static final int CELL_SIZE = 50;
    public static final int PADDING = 10;
    private Rectangle rectangle;
    private Color color;
    private boolean isOccupied;


    public Cell(int col, int row) {
        this.col = col;
        this.row = row;
        isOccupied = false;
        rectangle = new Rectangle(col + PADDING, row + PADDING, CELL_SIZE, CELL_SIZE);
        rectangle.draw();

    }

    public void setColorBlue() {
        rectangle.setColor(Color.BLUE);
        rectangle.fill();
    }

    public void setColorRed() {
        rectangle.setColor(Color.RED);
        rectangle.fill();
    }

    public Color getColor() {
        return rectangle.getColor();
    }

    public void fillCell() {
        rectangle.fill();
    }



}
