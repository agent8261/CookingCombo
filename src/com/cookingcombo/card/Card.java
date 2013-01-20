package com.cookingcombo.card;

import com.cookingcombo.controller.PlayerState;
import com.cookingcombo.model.ImageManager;

public abstract class Card
{
  private static int globalId = 1;
  private static final ImageManager imgMngr = new ImageManager();
    
  public PlayerState owner = PlayerState.NOPLAYER;
  public PlayerState controller = PlayerState.NOPLAYER;
  
  public int drawBonus = 0;
  public int pointBonus = 0;
  
  private int cardId = 0;

  //===========================================================================
  //===========================================================================
  
  // --------------------------------------------------------------------------
  // Set the drawBonus and the PointBonus
  public abstract void setBonus();
  
  // --------------------------------------------------------------------------
  // Called when card is being played (before it is in the pot)
  public abstract void isBeingPlayed();

  //===========================================================================
  //===========================================================================
  
  public static ImageManager getImgMngr()
  {
    return imgMngr;
  }
  
  //===========================================================================
  //===========================================================================
  
  // --------------------------------------------------------------------------
  // Ctor
  public Card() 
  { 
    cardId = globalId++; setBonus();  
  }
  
  // --------------------------------------------------------------------------
  // Ctor
  public Card(PlayerState _owner)
  {
    owner = _owner;
    controller = _owner;
    setBonus();
  }  

  // --------------------------------------------------------------------------
  public int getUnqId()
  { return cardId; }
  
  
}
