package io.github.algodiv.cards_engine.engine.core;

import io.github.algodiv.cards_engine.commons.cards.Card;
import io.github.algodiv.cards_engine.commons.cards.CustomDeck;
import io.github.algodiv.cards_engine.commons.cards.Deck;
import io.github.algodiv.cards_engine.commons.tools.GameState;

import java.util.ArrayList;

// This is the gameState class that will actually be used.
// If any part of a function should not exist in user space then it will be implemented here so that the user has no knowing of it.
public class CoreGameState extends GameState {
    ArrayList<CustomDeck> decks = new ArrayList<>();

    @Override
    public int addNewDeck() {
        CustomDeck newDeck = new CustomDeck(Deck.Preset.FULL_DECK);
        decks.add(newDeck);
        return decks.indexOf(newDeck);
    }

    @Override
    public void shuffleDeck(int deckID) {
        decks.get(deckID).shuffle();
    }

    @Override
    public void putOnTop(int deckID, byte card) {
    }

    @Override
    public void putOnBottom(int deckID, byte card) {
    }

    @Override
    public byte draw(int deckID) {
        Card card = decks.get(deckID).draw();
        return card.toBytes()[0];
    }
}
