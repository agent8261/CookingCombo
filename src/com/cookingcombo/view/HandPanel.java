package com.cookingcombo.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class HandPanel extends CCViewer
{
  private static final long serialVersionUID = 1108051313719639174L;
    
  JLabel label = new JLabel("Hand panel");
    
  public HandPanel()
  {
    this.add(label);
    //Compound borders
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();    
    Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
    setBorder(compound);
    
    int width = 512;
    int height = 155;    
    setPreferredSize(new Dimension(width, height));
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
