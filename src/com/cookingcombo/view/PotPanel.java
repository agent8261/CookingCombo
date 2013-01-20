package com.cookingcombo.view;

import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

public class PotPanel extends CCViewer
{
  private static final long serialVersionUID = 2103806284704926480L;
  private JLabel label = new JLabel("Pot panel");
  
  public PotPanel()
  {
//    setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//    setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
    
    this.add(label);
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
