package cards;

import java.util.*;

public class Deck{

  private ArrayList<Card> deck;

  public Deck(){
    this.deck = new ArrayList<Card>();
  }

  public ArrayList<Card> getDeck(){
    return this.deck;
  }

  public void buildDeck(){
    for (int i=1; i<14; i++) {
      for(Suit suit : Suit.values()){
        deck.add(new Card(i, suit));
      }
    }
    shuffleDeck();
  }

  public void shuffleDeck(){
    Collections.shuffle(deck);
  }
}