public class BlackJackRunner
{
    public static void main(String[] args)
    {
        System.out.println("----------------------------  Temporary Test code....");
        testDealerAndHuman(); // comment this out for the final project.

        System.out.println("----------------------------  The game starts here.");
        Referee ref = new Referee();
        ref.play();
    }

    /**
     * Run any tests you have on example Dealer or Humans
     */
    public static void testDealerAndHuman()
    {

        CardPile exampleDeck = CardPile.makeDeck(CardPile.ACE_LOW); // in case you find it handy....

        System.out.println("Testing Dealer...");
        // add code here to test the dealer is working correctly.

        System.out.println("Testing Human....");
        // add code here to test the human is working correctly.

    }
}