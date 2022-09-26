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

    public HumanPlayer(double startBalance)
    {
        this();
        balance = startBalance;
    }

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

    public double getBet()
    {
        return 1;
    }

    public void takeCard(Card c)
    {
        ;
    }

    public void clearHand()
    {
        ;
    }

    public int askForHitOrStay()
    {
        return 0;
    }

    public void collectWinnings(double cashWon)
    {
        ;
    }
}
