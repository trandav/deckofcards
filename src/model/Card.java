package model;

/**
 * The Class Card. Created Aug 2, 2020
 *
 * @author David Tran
 */
public class Card {
    /** The suit. */
    private Suit suit;
    /** The value. */
    private Value value;

    /**
     * Instantiates a new card.
     */
    public Card() {
    }

    /**
     * Instantiates a new card.
     *
     * @param suit  the suit
     * @param value the value
     */
    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    /**
     * Gets the suit.
     *
     * @return the suit
     */
    public Suit getSuit() {
        return this.suit;
    }

    /**
     * Sets the suit.
     *
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * Gets the value.
     *
     * @return the value
     */
    public Value getValue() {
        return this.value;
    }

    /**
     * Sets the value.
     *
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
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
        result = prime * result + ((this.suit == null) ? 0 : this.suit.hashCode());
        result = prime * result + ((this.value == null) ? 0 : this.value.hashCode());
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
        Card other = (Card) obj;
        if (this.suit != other.suit) {
            return false;
        }
        if (this.value != other.value) {
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
        return "Card [suit=" + this.suit + ", value=" + this.value + "]";
    }
}
