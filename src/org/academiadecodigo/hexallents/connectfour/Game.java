package org.academiadecodigo.hexallents.connectfour;

import org.academiadecodigo.hexallents.connectfour.player.Player1;
import org.academiadecodigo.hexallents.connectfour.player.Player2;

/**
 * Created by codecadet on 24/02/2018.
 */
public class Game {

    private Player1 player1;
    private Player2 player2;
    private Grid grid;
    private Cursor cursor;
    private InputHandler keyboard;

    public Game() {
        player1 = new Player1();
        player2 = new Player2();
    }

    public void startGame() {
        grid = new Grid(7, 7);

        grid.createGrid();

        cursor = new Cursor(grid);

        keyboard = new InputHandler(cursor);





    }


}
