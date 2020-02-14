
package SWE2_Project;

import java.util.Scanner;
public class Statistics {
    int win;
    int lose;
    int gameCount;
    Game A = new Game();
    Statistics () {
        this.win = 0;
        this.lose = 0;
        this.gameCount = 0;
    }

    public void gamesPlayed () {
        gameCount = A.gamePlayed();
        System.out.println(gameCount);

    }

    public void gamesWon () {
        win = A.playerWin();
        System.out.println(win);
    }

    public void gamesLose () {
        lose = A.playerLose();
        System.out.println(lose);
    }

    
}
