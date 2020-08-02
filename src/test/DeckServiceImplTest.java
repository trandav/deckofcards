package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import model.Card;
import model.Deck;
import service.DeckService;
import service.DeckServiceImpl;

/**
 * The Class DeckServiceImplTest. Created Aug 2, 2020
 *
 * @author David Tran
 */
@RunWith(JUnit4.class)
public class DeckServiceImplTest {
    /** The deck service. */
    private DeckService deckService = new DeckServiceImpl();

    /**
     * Test deck initialization.
     */
    @Test
    public void testDeckInitialization() {
        Deck deck = new Deck();
        this.deckService.initialize(deck);
        assertEquals(52, deck.getRemainingCards().size());
    }

    /**
     * Test deal one card.
     */
    @Test
    public void testDealOneCard() {
        Deck deck = new Deck();
        this.deckService.initialize(deck);
        this.deckService.dealOneCard(deck);
        assertEquals(51, deck.getRemainingCards().size());
        assertEquals(1, deck.getDiscardedCards().size());
        this.deckService.dealOneCard(deck);
        assertEquals(50, deck.getRemainingCards().size());
        assertEquals(2, deck.getDiscardedCards().size());
    }

    /**
     * Test empty deck.
     */
    @Test
    public void testEmptyDeck() {
        Deck deck = new Deck();
        Card card = this.deckService.dealOneCard(deck);
        assertNull(card);
    }

    /**
     * Test shuffle.
     */
    @Test
    public void testShuffle() {
        Deck shuffledDeck = new Deck();
        this.deckService.initialize(shuffledDeck);
        Deck initialDeck = new Deck(shuffledDeck);
        this.deckService.shuffle(shuffledDeck);
        assertEquals(initialDeck.getRemainingCards().size(), shuffledDeck.getRemainingCards().size());
        assertEquals(initialDeck.getDiscardedCards().size(), shuffledDeck.getDiscardedCards().size());
    }
}
