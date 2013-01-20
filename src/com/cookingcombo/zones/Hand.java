package com.cookingcombo.zones;

import java.util.LinkedHashMap;
import java.util.List;

import javax.swing.JButton;

import com.cookingcombo.card.Card;

public class Hand extends CCObservable
{
  public LinkedHashMap<Integer,Card> hand = new LinkedHashMap<Integer,Card>();
  
  public void addCard(Card card)
  {
    assert(card != null);
    JButton button = card.getButton();
    assert(button != null);
    viewer.addButton(button);
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
    JButton button = card.getButton();
    assert(button != null);    
    viewer.removeButton(button);
  }
  
  public void removeCards()
  {
    
  }  
}
