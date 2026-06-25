import classes.Match;
import classes.Player;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------------------------");
        System.out.println("Welcome to the CLI Blackjack Game");
        System.out.println("---------------------------------");
        System.out.println("You're playing against the machine, and each of you will receive two cards.");

        Player user = new Player();
        Player opponent = new Player();
        Match match = new Match(user, opponent);
        match.start();

        System.out.printf("\nYour cards are: %s and %s.", user.getHand().get(0).getCardName(), user.getHand().get(1).getCardName());
        System.out.printf("\nThe sum of your cards is %d.", user.getHandSum());
        
        while (!match.isEnded()){
            match.decision();
            match.checkLimit();
        }

        match.setResults();
        match.endgame();

        System.out.println("\nThe game has ended.");
    }
}
