package com.cookingcombo.errors;

public class EmptyDeck extends Exception_CC
{
  private static final long serialVersionUID = 3650869606512621425L;
  private static final String errMsg = "Empty Deck";
  public EmptyDeck()
  { super(errMsg);  }
}
