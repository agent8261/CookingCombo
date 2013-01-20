package com.cookingcombo.view;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class RootPanel extends JPanel
{
  private BorderLayout layout = new BorderLayout();
  
  private TurnPanel turnPanel = new TurnPanel();
  private LeftInfoPanel leftInfoPanel = new LeftInfoPanel();
  private RightInfoPanel rightInfoPanel = new RightInfoPanel();
  private PotPanel potPanel = new PotPanel();  
  private HandPanel handPanel = new HandPanel();
  
  public RootPanel()
  {
    super();
    setLayout(layout);
    
    this.add(leftInfoPanel, BorderLayout.LINE_START);
    this.add(rightInfoPanel, BorderLayout.LINE_END);
    this.add(potPanel, BorderLayout.CENTER);
    this.add(turnPanel, BorderLayout.PAGE_START);
    this.add(handPanel, BorderLayout.PAGE_END);
    
  }
}
