package cards;

public class Card {

  private SuitType suit;
  private Rank rank;

  public Card(SuitType suit , Rank rank) {
    this.suit = suit;
    this.rank = rank;
  }

  public MetalType getSuit(){
    return this.suit;
  }

  public GemType getRank() {
    return this.rank;
  }

  public String cardRank(){
      String[] details = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

      return details[this.rank -1] + " of " + this.suit.toString();

}