package service;

import model.Card;
import model.Deck;

/**
 * The Interface DeckService. Created Aug 2, 2020
 *
 * @author David Tran
 */
public interface DeckService {
    /**
     * Deal one card.
     *
     * @param  deck the deck
     * @return      the card
     */
    public Card dealOneCard(Deck deck);

    /**
     * Initialize.
     *
     * @param deck the deck
     */
    public void initialize(Deck deck);

    /**
     * Shuffle.
     *
     * @param deck the deck
     */
    public void shuffle(Deck deck);
}
