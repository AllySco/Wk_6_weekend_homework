import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class HandTest{

  Hand player;
  Card card1;
  Card card2;

  @Before
  public void before(){
    this.player = new Hand("Ally");
    card1 = new Card(10, SuitType.CLUBS);
    card2 = new Card(2, SuitType.SPADES);
    player.setHand(card1, card2);
  }

  @Test 
  public void canPrintHand(){
    assertEquals("Ten of CLUBS, Two of SPADES", player.printHand());
  }

  @Test
  public void canSumHand(){
    assertEquals( 12,this.player.sumHand() );
  }
}