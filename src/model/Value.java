package model;

/**
 * The Enum Suit. Created Aug 2, 2020
 *
 * @author David Tran
 */
public enum Value {
    /** The a. */
    ACE(1, 11),
    /** The two. */
    TWO(2),
    /** The three. */
    THREE(3),
    /** The four. */
    FOUR(4),
    /** The five. */
    FIVE(5),
    /** The six. */
    SIX(6),
    /** The seven. */
    SEVEN(7),
    /** The eight. */
    EIGHT(8),
    /** The nine. */
    NINE(9),
    /** The ten. */
    TEN(10),
    /** The j. */
    JACK(11),
    /** The q. */
    QUEEN(12),
    /** The k. */
    KING(13);

    /** The first value. */
    private final Integer firstValue;
    /** The second value. */
    private final Integer secondValue;

    /**
     * Instantiates a new value.
     *
     * @param firstValue the first value
     */
    private Value(Integer firstValue) {
        this.firstValue = firstValue;
        this.secondValue = null;
    }

    /**
     * Instantiates a new value.
     *
     * @param firstValue  the first value
     * @param secondValue the second value
     */
    private Value(Integer firstValue, Integer secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    /**
     * Gets the first value.
     *
     * @return the first value
     */
    public Integer getFirstValue() {
        return this.firstValue;
    }

    /**
     * Gets the second value.
     *
     * @return the second value
     */
    public Integer getSecondValue() {
        return this.secondValue;
    }
}
