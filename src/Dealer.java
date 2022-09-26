public class Dealer
{
    private CardPile deck;
    private Card hiddenCard;
    private CardPile revealedHand;

    public Dealer()
    {
        resetDeck();
        revealedHand = new CardPile();
    }

    public CardPile getMyRevealedHand()
    {
        return null;
    }

    public CardPile getMyFullHand()
    {
        return null;
    }

    public void dealInitialCardsToSelf()
    {
        ;
    }

    public Card dealCard()
    {
        return null;
    }

    public void resetDeck()
    {
        ;
    }

    public int getNumCardsInDeck()
    {
        return -1;
    }
}
