package model;

import java.util.Vector;

public class Square {

  private Integer number;

  private Attribute specialAttribute;

    public Board squareTable;
    /**
   * 
   * @element-type Unit
   */
  public Vector  unitList;
    /**
   * 
   * @element-type Square
   */
  public Vector <Square>  adjacency;

  public Square() {
  }

}