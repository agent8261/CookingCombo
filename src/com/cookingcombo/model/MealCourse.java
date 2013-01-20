package com.cookingcombo.model;

public enum MealCourse
{
  APPETIZERS("Appetizers"),
  MAIN_DISH("Main Dish"),
  DESSERT("Dessert");
  
  //---------------------------------------------------------------------------
  private final String text;
  
  //---------------------------------------------------------------------------
  MealCourse(String _text)
  { text = _text; }
  
  public String toText()
  { return text;  }
}
