package com.cookingcombo.controller;

import com.cookingcombo.card.basiccards.Garlic;
import com.cookingcombo.model.CCModel;

import static com.cookingcombo.model.CCModel.adam;
import static com.cookingcombo.model.CCModel.bob;

public class Control
{
  CCModel model = null;
  TurnState turnState = TurnState.NOTURN;
  PlayerState cookPlayer = PlayerState.NOPLAYER;
    
  //===========================================================================
  
  //---------------------------------------------------------------------------  
  Control(CCModel _model)
  {
    model = _model;
  }
  
  public void testGame()
  {
    // add some cards to each players deck
    // add some cards to each players hand
    // add some cards to each players pot
    // evaluate the points
  }
  
  public void makeTestDeck()
  {
    int testSize = 20;
    int bobHandSize = 2;
    int adamHandSize = 4;
    
    // Set deck
    for(int i=0; i < testSize; i++)
    {
      model.addCard(new Garlic(), adam);
      model.addCard(new Garlic(), bob);      
    }
    
    // Set hands
    model.drawCards(adamHandSize, adam);
    model.drawCards(bobHandSize, bob);
    
    // Set Pot
    model.putInPot(new Garlic(), adam);
    model.putInPot(new Garlic(), adam);
    model.putInPot(new Garlic(), adam);
    model.putInPot(new Garlic(), adam);
    
    model.putInPot(new Garlic(), bob);
    model.putInPot(new Garlic(), bob);
    
    // Set Discard Pile
    model.addToDiscard(new Garlic(), adam);
    model.addToDiscard(new Garlic(), adam);
    
    model.addToDiscard(new Garlic(), bob);
  }
}










