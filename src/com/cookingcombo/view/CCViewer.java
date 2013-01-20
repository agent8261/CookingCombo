package com.cookingcombo.view;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.cookingcombo.card.basiccards.Garlic;

public abstract class CCViewer extends JPanel
{
  private static final long serialVersionUID = 3018607206609158151L;
  
  public abstract void addButton(JButton button);
  public abstract void removeButton(JButton button);
  
  public void panelAddButton(JButton button)
  {
    this.add(button);
    this.validate();
  }

  public void panelRemoveButton(JButton button)
  {
    this.remove(button);
    this.validate();    
  }
  
  // adds 7 demo Card Buttons
  public void doUiDemo()
  {
    int numCards = 1;
    
    for(int i=0; i < numCards; i++)
    {
      Garlic garlic = new Garlic();
      panelAddButton(garlic.getButton());
    }
  }  
}
