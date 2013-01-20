package com.cookingcombo.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TurnPanel extends CCViewer
{
  JLabel label = new JLabel("panel");
  
  public TurnPanel()
  {
    this.add(label);
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();    
    Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
    setBorder(compound);    
  }
  //---------------------------------------------------------------------------
  // add a button to the panel
  @Override
  public void addButton(JButton button)
  {
    panelAddButton(button);
  }
  
  //---------------------------------------------------------------------------
  // Remove a button from the panel
  @Override
  public void removeButton(JButton button)
  { 
    panelRemoveButton(button);
  }  
}
