import java.util.Vector;

public class People {

  private String name;

  private Integer number;

  private Integer maxPawn;

  private Integer pawnPlayed;

  private State state;

  private Integer gold;

  private Power power;

    public Player activePpl;
    public Player declinePpl;
    public Power power;
    public State state;
    public Draw deckPpl;
    public Draw availaible[];
    /**
   * 
   * @element-type PplUnit
   */
  public Vector  people;

  public void newOperation() {
  }

  public People() {
  }

}