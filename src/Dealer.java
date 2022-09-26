public class Dealer
{
    private CardPile deck;
    private Card hiddenCard;
    private Card revealedCard;
    private CardPile myHand;

    public Dealer()
    {
        resetDeck();
        myHand = new CardPile();
    }

    /**
     * gets the "face up" card that the dealer initially dealt to itself.
     * @return the Card that the dealer has face up.
     */
    public CardPile getMyRevealedCard()
    {
        return null;
    }

    /**
     * gets all the cards dealt to the dealer, including any from "hitting."
     * @return the pile of cards held by the dealer in its hand.
     */
    public CardPile getMyHand()
    {
        return null;
    }

    /**
     * deal a hidden card and a revealed card to oneself from the deck, and put them both in myHand.
     */
    public void dealInitialCardsToSelf()
    {
        ;
    }

    /**
     * get a card from the top of the deck.
     * @return the card that was at the top of the deck.
     */
    public Card dealCard()
    {
        return null;
    }

    /**
     * deal a card from the deck to myHand, and indicate what card that was.
     */
    public void doHit()
    {
        ;
    }

    /**
     * replace current deck with a newly shuffled one, full of cards.
     */
    public void resetDeck()
    {
        ;
    }

    /**
     * return how many cards are currently in the deck.
     * @return num cards.
     */
    public int getNumCardsInDeck()
    {
        return -1;
    }
}
