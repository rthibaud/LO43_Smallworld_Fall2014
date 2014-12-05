package model;

import java.util.Vector;

public class People {

  private String name;

  private Integer number;

  private Integer maxPawn;

  private Integer pawnPlayed;

  private Integer gold;

    public Player activePpl;
    public Player declinePpl;
    public Power power;
    public State state;
    public Draw deckPpl;
    public Draw availaible[];

  public Vector <PplUnit>  people;

  public void newOperation() {
  }

  public People() {
  }

}