package com.ft.ce.core;

import com.ft.ce.tools.AGame;

public class Test {
    public static void main(String[] args) {
        AGame[] games = GameLoader.loadAllGames(System.getProperty("user.dir") + "/games");
        assert games != null;
        if(games.length > 0) {
            games[0].init();
            games[0].run();
        }
    }
}
