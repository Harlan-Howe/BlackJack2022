public class BlackJackRunner
{
    public static void main(String[] args)
    {
        System.out.println("----------------------------  Temporary Test code....");
        testDealerAndHuman();

        System.out.println("----------------------------  The game starts here.");
        Referee ref = new Referee();
        ref.play();
    }

    public static void testDealerAndHuman()
    {
        System.out.println("Testing Dealer...");
        // add code here to test the dealer is working correctly.

        System.out.println("Testing Human....");
        // add code here to test the human is working correctly.

    }
}