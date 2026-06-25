package classes;
import java.util.ArrayList;

public class Player {
    private ArrayList<Deck> hand = new ArrayList<Deck>();
    private int handSum;
    private boolean winner = false;

    public ArrayList<Deck> getHand(){
        return this.hand;
    }
    public void addToHand(Deck card){
        this.hand.add(card);
    }
    public int getHandSum(){
        return this.handSum;
    }
    public void setHandSum(){
        this.handSum = 0;
        for (Deck card : hand){
            this.handSum += card.getCardValue();
        }
    }
    public boolean isWinner(){
        return this.winner;
    }
    public void setWinner(boolean won){
        this.winner = won;
    }
}