package com.cookingcombo.card;

import java.util.Map;

public interface Cookable
{
  int evaluatePointValue(Map<Trait, Integer> potTraits);
  
  // returns unmodifiableMap
  Map<Trait, Integer> getTraits();
  
  Map<Trait, Integer> getConflicts();
}
