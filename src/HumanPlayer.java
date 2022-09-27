import java.util.InputMismatchException;
import java.util.Scanner;

public class HumanPlayer
{
    private String name;
    private CardPile hand;
    private double balance;
    private Scanner keyReader;

    public HumanPlayer()
    {
        hand = new CardPile();
        balance = 100;
        keyReader = new Scanner(System.in);
        System.out.print("What is your name? ");
        name = keyReader.nextLine();
    }

    /**
     * overloaded constructor allowing to create a HumanPlayer with a given staring bankroll
     * @param startBalance - the amount of money the player starts with.
     */
    public HumanPlayer(double startBalance)
    {
        this();
        balance = startBalance;
    }
    // Note: I'm not writing javadoc comments for the simple accessors because... duh.

    public String getName()
    {
        return "";
    }

    public CardPile getHand()
    {
        return null;
    }

    public double getBalance()
    {
        return -1;
    }

    /**
     * requests the size of the bet for the user to make. User's balance decreases by this amount, as they are "putting
     * the money into the pot."
     * @return bet - a positive double.
     */
    public double getBet()
    {
        boolean badAnswer = true;
        double bet = 0;
        while(badAnswer)
        {
            System.out.println("How much do you wish to bet? ");
            try // we're about to attempt to get a number from the user, which may cause an exception....
            {
                bet = keyReader.nextDouble();
                String dummy = keyReader.nextLine(); // clear the newline character in the input buffer after our number.
            }
            catch (InputMismatchException imExcp) // if the user's input wasn't a double...
            {
                System.out.println("That was not a number. Please try again.");
                continue;
            }

            // TODO: put your own code here to check whether the user gave a valid number. If so, change badAnswer to false.
            //   otherwise, tell the user what was wrong with his/her choice.
        }
        balance -= bet;
        return bet;
    }

    /**
     * receive the given card and put it in this human player's hand.
     * @param c - the card to receive.
     * Precondition: c is not null.
     */
    public void takeCard(Card c)
    {
        ;
    }

    /**
     * remove all cards from the player's hand, in preparation for another round of the game.
     */
    public void clearHand()
    {
        ;
    }

    /**
     * ask the user whether he/she wants to hit or stay.
     * @return 1 for hit or 0 for stay.
     */
    public int askForHitOrStay()
    {
        return 0;
    }

    /**
     * increase our balance by the given money.
     * @param cashWon - amount of money to add to the balance.
     */
    public void collectWinnings(double cashWon)
    {
        ;
    }
}
