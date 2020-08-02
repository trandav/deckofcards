package service;

import java.util.ArrayList;
import java.util.List;

import model.Card;
import model.Deck;
import model.Suit;
import model.Value;

/**
 * The Class DeckServiceImpl. Created Aug 2, 2020
 *
 * @author David Tran
 */
public class DeckServiceImpl implements DeckService {
    /** The Constant DECK_VALUES. */
    private static final Value[] DECK_VALUES = { Value.ACE, Value.TWO, Value.THREE, Value.FOUR, Value.FIVE, Value.SIX,
            Value.SEVEN, Value.EIGHT, Value.NINE, Value.TEN, Value.JACK, Value.QUEEN, Value.KING };

    /**
     * Deal one card.
     *
     * @param  deck the deck
     * @return      the card
     */
    @Override
    public Card dealOneCard(Deck deck) {
        Card card = null;
        if (!deck.getRemainingCards().isEmpty()) {
            card = deck.getRemainingCards().remove(deck.getRemainingCards().size() - 1);
            deck.getDiscardedCards().add(card);
        }
        return card;
    }

    /**
     * Initialize.
     *
     * @param deck the deck
     */
    @Override
    public void initialize(Deck deck) {
        deck.getRemainingCards().clear();
        deck.getDiscardedCards().clear();
        for (Value element : DECK_VALUES) {
            deck.getRemainingCards().add(new Card(Suit.CLUB, element));
            deck.getRemainingCards().add(new Card(Suit.HEART, element));
            deck.getRemainingCards().add(new Card(Suit.SPADE, element));
            deck.getRemainingCards().add(new Card(Suit.DIAMOND, element));
        }
    }

    /**
     * Shuffle.
     *
     * @param deck the deck
     */
    @Override
    public void shuffle(Deck deck) {
        List<Card> randomized = new ArrayList<>();
        int maxSize = deck.getRemainingCards().size();
        for (int i = 0; i < maxSize; i++) {
            int seed = (int) (Math.random() * deck.getRemainingCards().size());
            randomized.add(deck.getRemainingCards().remove(seed));
        }
        deck.setRemainingCards(randomized);
    }
}
