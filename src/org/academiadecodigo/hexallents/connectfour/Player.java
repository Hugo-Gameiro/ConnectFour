package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.simplegraphics.graphics.Color;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Player {

    private Color playerColor;
    private Cursor cursor;

    public Player(Color playerColor) {
        this.playerColor = playerColor;

    }

    public Color getColor() {
        return playerColor;
    }
}
