import static org.junit.Assert.*;
import org.junit.*;
import cards.*;


public class DeckTest{

  Card card1;
  Deck deck;

  @Before
  public void before(){
    this.card1 = new Card(2, SuitType.SPADES);
    this.deck = new Deck();
    this.deck.buildDeck();
  }

  @Test
  public void deckHas52Cards(){
    assertEquals( 52, this.deck.getDeck().size() );
  }