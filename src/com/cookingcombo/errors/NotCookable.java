package com.cookingcombo.errors;

public class NotCookable extends Exception_CC
{
  private static final long serialVersionUID = -7791453494110431026L;
  private static final String errMsg = "Not Cookable";
  public NotCookable()
  { super(errMsg);  }
}
