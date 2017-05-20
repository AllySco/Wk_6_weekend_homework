package cards;

public class Card {

  private SuitType suit;
  private int rank;

  public Card(int rank, SuitType suit) {
    this.suit = suit;
    this.rank = rank;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public int getRank() {
    return this.rank;
  }

  public String cardRank(){
    String[] details = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};

    return details[this.rank -1] + " of " + this.suit.toString();
  }
}