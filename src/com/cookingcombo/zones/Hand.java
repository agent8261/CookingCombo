package com.cookingcombo.zones;

import java.util.LinkedHashMap;
import java.util.List;

import com.cookingcombo.card.Card;

public class Hand extends CCObservable
{
  public LinkedHashMap<Integer,Card> hand = new LinkedHashMap<Integer,Card>();
  
  public void addCard(Card card)
  {
    assert(card != null);
    addButtonToView(card);
    hand.put(card.getUnqId(), card);
  }
  
  public void addCards(List<Card> cards)
  {
    for(Card card: cards)
    {
      addCard(card);
    }
  }
  
  public void removeCard(Card card)
  {
    Integer cardId = card.getUnqId();
    assert(cardId != null);
    hand.remove(cardId);
    // update the view
    removeButtonFromView(card);
  }
  
  public void removeCards()
  {
    
  }  
}
