package cse360assignment02;

public class AddingMachine {
  private int total;
  private String str = "0";
  
  /*Constructor*/
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  /* Get total*/
  public int getTotal () {
    return total;
  }
  /*return total added with value*/
  public void add (int value) {
	  total = total + value;
	  str += " + " + value;
  }
  /*return total with value subtracted*/
  public void subtract (int value) {
	  total = total - value;
	  str += " - " + value;
  }
  /*print toString*/
  public String toString () {
    return str;
  }
  /*clear*/
  public void clear() {
	  total = 0;
  }
}