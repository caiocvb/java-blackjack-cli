package classes;
import java.util.Random;
import java.util.Scanner;

public class Match {
    public final int handLimite = 21;
    public Player player, opponent;
    private boolean ended = false;
    Scanner option = new Scanner(System.in);

    public Match(Player p1, Player p2){
        this.player = p1;
        this.opponent = p2;
    }

    public final void start(){
        for (int i = 0; i < 2; i++){
            sortCards();
        }
        player.setHandSum();
        opponent.setHandSum();
    }

    public boolean isEnded(){
        return this.ended;
    }

    public final void checkLimit(){
        if (player.getHandSum() == 21 || opponent.getHandSum() == 21) {
            this.ended = true;
        } else if (player.getHandSum() > 21 || opponent.getHandSum() > 21) {
            this.ended = true;
        }
    }

    public final void decision(){
        System.out.println("You may choose now to Hit (get another card) or Stand (stop). What's your choice?");
        try {
            String choice = option.nextLine();
            if (choice.equals("Hit")) {
                this.hit();
            } else if (choice.equals("Stand")){
                this.stand();
                this.ended = true;
            } else {
                System.out.println("That's not an option.");
            }
        } catch (Exception e) {
            System.out.println("Invalid option. Try again.");
        }
    }

    public final void hit(){
        System.out.println("You chose Hit. Let's draw more cards.");
        sortCards();
        System.out.printf("\nYour new cards is: %s.\n", player.getHand().get(player.getHand().size()-1).getCardName());
        System.out.printf("\nThe sum of your cards is now %d.\n", player.getHandSum());
    }

    public final void stand(){
        System.out.println("You chose Stand. Let's check who won.");
    }

    private final void sortCards(){
        Random RCG = new Random();
        int newCard1 = RCG.nextInt(1,13);
        int newCard2 = RCG.nextInt(1,13);

        for (Deck card : Deck.values()){
            if (card.getCardIndex() == newCard1){
                player.addToHand(card);
                
            }
            if (card.getCardIndex() == newCard2){
                opponent.addToHand(card);
            }
        }
        player.setHandSum();
        opponent.setHandSum();
    }

    public void setResults(){
        testBlackjack();
        testOverflow();
        testScore();
    }

    private void testBlackjack(){
        if (player.getHandSum() == 21) {
            System.out.println("You got a Blackjack!");
            player.setWinner(true);
        } else if (opponent.getHandSum() == 21) {
            System.out.println("Your opponent got a Blackjack!");
            opponent.setWinner(true);
        }
    }

    private void testOverflow(){
        if (player.getHandSum() > 21) {
            System.out.println("You surpassed the 21 points limit.");
            opponent.setWinner(true);
        } else if (opponent.getHandSum() > 21) {
            System.out.println("Your opponent surpassed the 21 points limit.");
            player.setWinner(true);
        }
    }

    private void testScore(){
        if (player.getHandSum() < 21 && player.getHandSum() > opponent.getHandSum()) {
            player.setWinner(true);
            System.out.printf("You made %d points and your opponet made %d.\n", player.getHandSum(), opponent.getHandSum());
        } else if (opponent.getHandSum() < 21 && opponent.getHandSum() > player.getHandSum()) {
            opponent.setWinner(true);
            System.out.printf("Your opponent made %d points and you  made %d.\n", opponent.getHandSum(), player.getHandSum());
        }
    }

    public void endgame(){
        if (player.isWinner()) {
            System.out.println("YOU WON! Congratulations!");
        } else if (opponent.isWinner()) {
            System.out.println("You lost! I'm sorry.");
        } else {
            System.out.println("It's a draw! Nice try.");
        }
        option.close();
    }
}
