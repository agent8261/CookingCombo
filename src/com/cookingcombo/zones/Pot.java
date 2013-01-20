package com.cookingcombo.zones;

import java.util.HashMap;
import java.util.Map;

import com.cookingcombo.card.Card;
import com.cookingcombo.card.Cookable;
import com.cookingcombo.card.Trait;
import com.cookingcombo.errors.NotCookable;

public class Pot
{
  private HashMap<Trait, Integer> potTraits = new HashMap<Trait, Integer>();
  private HashMap<Integer, Card> potCards = new HashMap<Integer, Card>();
  
  int currentPointValue = 0;
  
  // --------------------------------------------------------------------------
  // Adds the Card to the pot and updates the Pot's Traits
  public void addItem(Card card) throws NotCookable
  {
    assert(card != null);
    if(!(card instanceof Cookable))
    {  throw new NotCookable(); }
    
    Integer cardid = card.getUnqId();
    assert(cardid != null);
    potCards.put(cardid, card);
    addTraitsOfItem((Cookable)card);
  }
  
  // --------------------------------------------------------------------------
  // Add the item to the pot, and updates the attribute list
  private void addTraitsOfItem(Cookable item)
  {
    Map<Trait, Integer> traitList = item.getTraits();
    
    for(Map.Entry<Trait, Integer> entry : traitList.entrySet())
    {
      Trait trait = entry.getKey();
      Integer count = potTraits.get(trait); 
      if(count == null) // set count to 0
      { count = new Integer(0); }
      else // other wise update it
      {  count += entry.getValue();  }
      potTraits.put(trait, count);
    }
  }
  
  // --------------------------------------------------------------------------
  // Removes item from the pot and updates the attribute list
  public void removeItem(Integer cardId)
  {
    Card card = potCards.get(cardId);
    if(card == null)
    {  return;  }
    removeTraitsOfItem((Cookable) card);
    potCards.remove(cardId);
  }
  
  // --------------------------------------------------------------------------
  private void removeTraitsOfItem(Cookable item)
  {
    Map<Trait, Integer> traitList = item.getTraits();
    
    for(Map.Entry<Trait, Integer> entry : traitList.entrySet())
    {
      Trait trait = entry.getKey();
      Integer count = potTraits.get(trait);
      count -= entry.getValue();
      
      if(count == 0) 
      { potTraits.remove(trait);  }
    }    
  }
  
  // --------------------------------------------------------------------------
  // return the number of item with the given attribute
  public int getAttributeCount(Trait trait)
  {
    Integer count = potTraits.get(trait);
    if(count == null)
    {  count = new Integer(0);  }
    return count;
  }
}
