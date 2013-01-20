package com.cookingcombo.view;

import javax.swing.JButton;
import javax.swing.JLabel;

public class LeftInfoPanel extends CCViewer
{
  JLabel label = new JLabel("panel");
  
  public LeftInfoPanel()
  {
    this.add(label);
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
