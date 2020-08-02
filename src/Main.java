import model.Deck;
import service.DeckService;
import service.DeckServiceImpl;

/**
 * The Class Main. Created Aug 2, 2020
 *
 * @author David Tran
 */
public class Main {
    /**
     * The main method.
     *
     * @param args the arguments
     */
    public static void main(String[] args) {
        Deck deck = new Deck();
        DeckService deckService = new DeckServiceImpl();
        // Adds the 52 cards to deck.
        deckService.initialize(deck);
        // Deals one card.
        deckService.dealOneCard(deck);
        // Shuffles.
        deckService.shuffle(deck);
    }
}
