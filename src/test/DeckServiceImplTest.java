package test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import model.Card;
import model.Deck;
import model.Suit;
import model.Value;
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
        Card card = new Card(Suit.HEART, Value.ACE);
        shuffledDeck.getRemainingCards().add(card);
        Card card1 = new Card(Suit.DIAMOND, Value.SIX);
        shuffledDeck.getRemainingCards().add(card1);
        Card card2 = new Card(Suit.CLUB, Value.KING);
        shuffledDeck.getRemainingCards().add(card2);
        
        Deck initialDeck = new Deck(shuffledDeck);
        this.deckService.shuffle(shuffledDeck);
        assertEquals(initialDeck.getRemainingCards().size(), shuffledDeck.getRemainingCards().size());
        assertEquals(initialDeck.getDiscardedCards().size(), shuffledDeck.getDiscardedCards().size());
        assertThat(card, anyOf(equalTo(shuffledDeck.getRemainingCards().get(0)), 
        		equalTo(shuffledDeck.getRemainingCards().get(1)), equalTo(shuffledDeck.getRemainingCards().get(2))));
        assertThat(card1, anyOf(equalTo(shuffledDeck.getRemainingCards().get(0)), 
        		equalTo(shuffledDeck.getRemainingCards().get(1)), equalTo(shuffledDeck.getRemainingCards().get(2))));
        assertThat(card2, anyOf(equalTo(shuffledDeck.getRemainingCards().get(0)), 
        		equalTo(shuffledDeck.getRemainingCards().get(1)), equalTo(shuffledDeck.getRemainingCards().get(2))));
        		
    }
}
