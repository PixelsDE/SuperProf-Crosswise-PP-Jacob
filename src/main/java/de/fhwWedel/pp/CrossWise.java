/*
 * Copyright Notice for Crosswise-PP
 * Copyright (c) at Crosswise-Jacob 2022
 * File created on 7/27/22, 11:22 AM by Carina The Latest changes made by Carina on 7/27/22, 11:07 AM All contents of "CrossWise" are protected by copyright. The copyright law, unless expressly indicated otherwise, is
 * at Crosswise-Jacob. All rights reserved
 * Any type of duplication, distribution, rental, sale, award,
 * Public accessibility or other use
 * requires the express written consent of Crosswise-Jacob.
 */

package de.fhwWedel.pp;

import de.fhwWedel.pp.game.Game;
import de.fhwWedel.pp.game.PlayingField;
import de.fhwWedel.pp.player.Player;
import de.fhwWedel.pp.util.game.Team;

import java.util.ArrayList;
import java.util.List;

/**
 * Wrapper class is necessary as the main class for our program must not inherit
 * from {@link javafx.application.Application}
 *
 * @author mjo
 */
public class CrossWise {


    public static void main(String... args) {
        //TODO:     Crosswise.main(args);

        var player1 = new Player(1, Team.HORIZONTAL, true, "Player 1");
        var player2 = new Player(2, Team.VERTICAL, true, "Player 2");
        var game = new Game(new PlayingField(6), new ArrayList<>(List.of(player1, player2)));
        Game.setGame(game);
        game.start();

    }


}
