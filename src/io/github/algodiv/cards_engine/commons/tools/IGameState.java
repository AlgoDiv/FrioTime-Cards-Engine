package io.github.algodiv.cards_engine.commons.tools;

public interface IGameState {
    int addNewDeck();

    void shuffleDeck(int deckID);

    void putOnTop(int deckID, byte card);

    void putOnBottom(int deckID, byte card);

    byte draw(int deckID);
}
