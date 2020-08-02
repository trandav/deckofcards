package model;

import java.util.ArrayList;
import java.util.List;

/**
 * The Class Deck. Created Aug 2, 2020
 *
 * @author David Tran
 */
public class Deck {
    /** The discarded cards. */
    private List<Card> discardedCards;
    /** The remaining cards. */
    private List<Card> remainingCards;

    /**
     * Instantiates a new deck.
     */
    public Deck() {
        this.remainingCards = new ArrayList<>();
        this.discardedCards = new ArrayList<>();
    }

    /**
     * Instantiates a new deck.
     *
     * @param deck the deck
     */
    public Deck(Deck deck) {
        this.remainingCards = new ArrayList<>();
        this.remainingCards.addAll(deck.getRemainingCards());
        this.discardedCards = new ArrayList<>();
        this.discardedCards.addAll(deck.getDiscardedCards());
    }

    /**
     * Gets the remaining cards.
     *
     * @return the remainingCards
     */
    public List<Card> getRemainingCards() {
        return this.remainingCards;
    }

    /**
     * Sets the remaining cards.
     *
     * @param remainingCards the remainingCards to set
     */
    public void setRemainingCards(List<Card> remainingCards) {
        this.remainingCards = remainingCards;
    }

    /**
     * Gets the discarded cards.
     *
     * @return the discardedCards
     */
    public List<Card> getDiscardedCards() {
        return this.discardedCards;
    }

    /**
     * Sets the discarded cards.
     *
     * @param discardedCards the discardedCards to set
     */
    public void setDiscardedCards(List<Card> discardedCards) {
        this.discardedCards = discardedCards;
    }

    /**
     * Hash code.
     *
     * @return the int
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.discardedCards == null) ? 0 : this.discardedCards.hashCode());
        result = prime * result + ((this.remainingCards == null) ? 0 : this.remainingCards.hashCode());
        return result;
    }

    /**
     * Equals.
     *
     * @param  obj the obj
     * @return     true, if successful
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Deck other = (Deck) obj;
        if (this.discardedCards == null) {
            if (other.discardedCards != null) {
                return false;
            }
        } else if (!this.discardedCards.equals(other.discardedCards)) {
            return false;
        }
        if (this.remainingCards == null) {
            if (other.remainingCards != null) {
                return false;
            }
        } else if (!this.remainingCards.equals(other.remainingCards)) {
            return false;
        }
        return true;
    }

    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
        return "Deck [remainingCards=" + this.remainingCards + ", discardedCards=" + this.discardedCards + "]";
    }
}
