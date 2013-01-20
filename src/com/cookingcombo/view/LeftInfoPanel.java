package com.cookingcombo.view;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class LeftInfoPanel extends CCViewer
{
  JLabel label = new JLabel("panel");
  
  public LeftInfoPanel()
  {
//    setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//    setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
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
