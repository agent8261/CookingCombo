package com.cookingcombo.model;

import com.cookingcombo.card.Card;
import com.cookingcombo.controller.PlayerState;
import com.cookingcombo.errors.NotCookable;
import com.cookingcombo.zones.DeckDiscard;
import com.cookingcombo.zones.Hand;
import com.cookingcombo.zones.HiddenZone;
import com.cookingcombo.zones.Pot;

public class CCModel
{
  public static final PlayerState adam = PlayerState.ADAM;
  public static final PlayerState bob = PlayerState.BOB;
  
  private DeckDiscard adamsDeck = new DeckDiscard();
  private DeckDiscard bobsDeck = new DeckDiscard();
  
  private Hand adamsHand = new Hand();
  private Hand bobsHand = new Hand();

  private HiddenZone adamsHidden = new HiddenZone();
  private HiddenZone bobsHidden = new HiddenZone();
  
  private Pot adamsPot = new Pot();
  private Pot bobsPot = new Pot();
  
  private int adamsPoints = 0;
  private int bobsPoints = 0;
  
  //===========================================================================
  
  //---------------------------------------------------------------------------
  CCModel()
  {  }

  //---------------------------------------------------------------------------
  public void addCard(Card card, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      adamsDeck.addCardToDeck(card);
    }
    else
    {
      bobsDeck.addCardToDeck(card);
    }
  }
  
  public void drawCards(int numCards, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      adamsDeck.drawCards(numCards);
    }
    else
    {
      bobsDeck.drawCards(numCards);
    }
  }
  
  public void putInPot(Card card, PlayerState player)
  {    
    try
    {
      if(player == PlayerState.ADAM)
      {
        adamsPot.addItem(card);
      }
      else
      {
        bobsPot.addItem(card);
      }
    }
    catch( NotCookable e )
    { }    
  }
  
  public void addToDiscard(Card card, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      adamsDeck.discardCard(card);
    }
    else
    {
      bobsDeck.discardCard(card);
    }    
  }
}
