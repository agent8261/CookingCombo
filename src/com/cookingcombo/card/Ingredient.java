package com.cookingcombo.card;

import java.util.Map;

public abstract class Ingredient extends Card implements Cookable
{

  // --------------------------------------------------------------------------
  // Return true if the pot has any traits that are in conflict
  public boolean isBadWithPot(Map<Trait, Integer> potTraits)
  {
    Map<Trait, Integer> traits = getConflicts();
    for(Map.Entry<Trait, Integer> entry: traits.entrySet())
    {
      Trait trait = entry.getKey();
      Integer count = potTraits.get(trait);
      if(count != null)
      {  return true;  }
    }
    return false;
  }
}
