package com.ft.ce.tools;

public abstract class AGame {
    public IGameState gameState = new GameState();

    public abstract void init();
    public abstract void run();
}
