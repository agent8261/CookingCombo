package com.cookingcombo.view;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.cookingcombo.controller.PlayerState;

public class RightInfoPanel extends CCViewer
{
  JLabel label = new JLabel("panel");
  
  public RightInfoPanel()
  {
    this.add(label);
  }
  
  public void updateDeckSize(PlayerState player, int newAmount)
  {
    if(player == PlayerState.ADAM)
    {}
    else
    {}
  }
  
  //---------------------------------------------------------------------------
  public void updatePoints(PlayerState player, int newAmount)
  {
    if(player == PlayerState.ADAM)
    {}
    else
    {}    
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
