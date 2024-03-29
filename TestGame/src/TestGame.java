// When the module is compiled, the output will be found in the games folder.
// To compile the test game use build/artifacts.

// Added dependency of the core project.
// Any tools to be used by a game should be found in com.ft.ce.tools in the core project.
// If there is an update to one of the files in the core project it will update here as well.
import io.github.algodiv.cards_engine.commons.tools.AGame;

public class TestGame extends AGame {
    int drawPile;

    @Override
    public void init() {
        drawPile = gameState.addNewDeck();
        gameState.shuffleDeck(drawPile);
    }

    @Override
    public void run() {
        System.out.println(gameState.draw(drawPile));
    }
}
