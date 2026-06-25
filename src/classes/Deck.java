package classes;

public enum Deck {
    ACE("Ace", 1, 1),
    TWO("Two", 2, 2),
    THREE("Three", 3,3),
    FOUR("Four", 4, 4),
    FIVE("Five", 5, 5),
    SIX("Six", 6, 6),
    SEVEN("Seven", 7, 7),
    EIGHT("Eight", 8, 8),
    NINE("Nine", 9, 9),
    TEN("Ten", 10, 10),
    JACK("Jack", 11, 10),
    QUEEN("Queen", 12, 10),
    KING("King", 13, 10);

    private String cardName;
    private int cardIndex;
    private int cardValue;

    public String getCardName(){
        return this.cardName;
    }
    private void setCardName(String name){
        this.cardName = name;
    }
    public int getCardIndex(){
        return this.cardIndex;
    }
    private void setCardIndex(int value){
        this.cardIndex = value;
    }
    public int getCardValue(){
        return this.cardValue;
    }
    private void setCardValue(int value){
        this.cardValue = value;
    }

    Deck(String cardName, int cardIndex, int cardValue){
        this.setCardName(cardName);
        this.setCardIndex(cardIndex);
        this.setCardValue(cardValue);
    }
}
