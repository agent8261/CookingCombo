package com.cookingcombo.view;

import javax.swing.JButton;
import javax.swing.JPanel;

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
}
