package cards;
public class Hand{

  private String playerName;
  private Card[] hand;

  public Hand(String playerName){
    this.playerName = playerName;
    this.hand = new Card[2];
  }

  public void setHand(Card card1, Card card2){
    this.hand[0] = card1;
    this.hand[1] = card2;
  }

  public Card[] getHand(){
    return this.hand;
  }

  public String getPlayerName(){
    return this.playerName;
  }

  public String printHand(){
    return this.hand[0].cardRank() + ", " + this.hand[1].cardRank();
  }

  public int sumHand(){
    return this.hand[0].getRank() + this.hand[1].getRank();
  }

}