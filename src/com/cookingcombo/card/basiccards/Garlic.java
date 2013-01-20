package com.cookingcombo.card.basiccards;

import java.awt.event.ActionEvent;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JButton;

import com.cookingcombo.card.Ingredient;
import com.cookingcombo.card.Trait;

public class Garlic extends Ingredient
{
  private static String imageFile = "garlicFrame.png";
  private static String imageName = "Garlic";
  
  private static Map<Trait, Integer> traits = null;
  private static Map<Trait, Integer> conflicts = null;
  
  private static final int GarlicPointBonus = 1;
  private static final int GarlicDrawBonus = 2;
  
  static
  {  
    // Traits: Spice, Garlic
    traits = new TreeMap<Trait, Integer>();
    traits.put(Trait.GARLIC, 1);
    traits.put(Trait.SPICE, 1);
    
    // Conflicts: Dessert, Fruits
    conflicts = new TreeMap<Trait, Integer>();
    conflicts.put(Trait.DESSERT, 1);
    conflicts.put(Trait.FRUIT, 1);    
    getImgMngr().loadImage(imageName, imageFile);
  }
  
  public void setBonus()
  {  pointBonus = GarlicPointBonus; drawBonus = GarlicDrawBonus; }

  // --------------------------------------------------------------------------
  // Bad with Fruits and Desserts
  @Override
  public int evaluatePointValue(Map<Trait, Integer> potTraits)
  {
    if(isBadWithPot(potTraits))
    { return 0;  }
    return pointBonus;
  }

  // --------------------------------------------------------------------------
  // Returns and unmodifiable map of traits
  @Override
  public Map<Trait, Integer> getTraits()
  {
    return Collections.unmodifiableMap(traits);
  }

  // --------------------------------------------------------------------------
  // Returns and unmodifiable map of conflicting traits
  @Override
  public Map<Trait, Integer> getConflicts()
  {
    return Collections.unmodifiableMap(conflicts);
  }

  @Override
  public void isBeingPlayed()
  {
  }

  @Override
  public JButton getButton()
  {    
    return makeButton(imageName);
  }
  // --------------------------------------------------------------------------
  
  @Override
  public void actionPerformed(ActionEvent e)
  {
    
  }

}
