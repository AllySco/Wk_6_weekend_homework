import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest{

  Card card1;

  @Before
    public void before(){
      card1 = new Card(2, SuitType.SPADES);
    }

    @Test
    public void cardHasRank(){
      assertEquals( 1,card1.getRank() );
    }

    @Test
    public void cardHasSuit(){
      assertEquals( SuitType.SPADES, card1.getSuit() );
    }

    @Test
    public void hasDescription(){
      assertEquals( "Two of SPADES",card1.description() );
    }

}