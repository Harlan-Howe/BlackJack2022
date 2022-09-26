public class Referee
{
    private HumanPlayer myPlayer;
    private Dealer myDealer;
    private boolean keepPlaying;
    private double currentBet;

    public Referee()
    {
        myPlayer = new HumanPlayer();
        myDealer = new Dealer();
        keepPlaying = true;
    }

    /**
     * Main loop to run the game; sets up the game and repeatedly playsRound().
     */
    public void play()
    {
        ; // enter code here.
    }

    /**
     * plays one "hand" of the game:
     * • gets a bet from the human player
     * • gets two cards from dealer to give to human player; has dealer deal two to itself.
     * • asks the human player to hit or stay; if hit, gets another card from the dealer to give to player.
     * • repeats previous step until user chooses to stay or goes bust.
     * • if player is not bust, tells computer to do its automatic hit/stay algorithm.
     * • reveals both players' hands.
     * • determines winner, and potentially pays human player.
     */
    public void playRound()
    {
        ;
    }

    /**
     * gets two cards from the dealer to give to the human player; tells the dealer to deal two to itself.
     */
    public void dealCards()
    {
        ;
    }

    /**
     * prints out both the human player's hand and the revealed portion of the computer's hand.
     */
    public void printRevealedHands()
    {
        ;
    }

    /**
     * asks the user whether to hit or stay. If hit, get another card from the dealer.
     * @return: whether the user chose to stay.
     */
    public boolean handlePlayerAction()
    {
        return true;
    }

    /**
     * Determines the point value of this hand.
     * @param pile - the hand to score
     * @return the numerical value of this hand.
     */
    public int getValueOfHand(CardPile pile)
    {
        // HINT: to start with, assume all Aces are 1. Later, come back and deal with the 1 vs. 11 issue.

        // HINT #2: when you are ready to deal with the 1 vs. 11 issue, be sure to read the purple box in the
        // instructions!
        return -1;
    }

    /**
     * Reveals the dealer's full hand, and makes the dealer continue to hit until its hand is 17 points or more.
     */
    public void handleDealerHitOrStay()
    {
        ;
    }

    /**
     * Looks at the point scores for the human player and the dealer and decides who won. If the human player won, gives
     * the human the winnings. Notifies the human what happens!
     * Precondition: the human chose to Stay.
     */
    public void determineWinner()
    {
        ;
    }
}
