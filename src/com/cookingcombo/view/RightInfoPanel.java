package com.cookingcombo.view;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import com.cookingcombo.controller.PlayerState;
import com.cookingcombo.model.MealCourse;

public class RightInfoPanel extends CCViewer
{
  private static final long serialVersionUID = -8423376039107472242L;
  
  BoxLayout layout = null;
  JLabel label = new JLabel("Info");
  
  JLabel adamsDeckSizeTxt = new JLabel("Your Deck's Size:");
  JLabel adamsDeckSizeVal = new JLabel("0");
  
  JLabel bobsDeckSizeTxt = new JLabel("Opponent's Deck's Size:");
  JLabel bobsDeckSizeVal = new JLabel("0");
  
  JLabel adamsPointsTxt = new JLabel("Your Points:");
  JLabel adamsPointsVal = new JLabel("0");
  
  JLabel bobsPointsTxt = new JLabel("Opponent's Points:");
  JLabel bobsPointsVal = new JLabel("0");
  
  JLabel currentCourseTxt = new JLabel("Current Course:");
  JLabel currentCourseVal =  new JLabel("Appetizers");
  
  public RightInfoPanel()
  {
//    setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
//    setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
    
    layout = new BoxLayout(this, BoxLayout.Y_AXIS);
    this.setLayout(layout);
    
    Border raisedbevel = BorderFactory.createRaisedBevelBorder();
    Border loweredbevel = BorderFactory.createLoweredBevelBorder();    
    Border compound = BorderFactory.createCompoundBorder(raisedbevel, loweredbevel);
    setBorder(compound);    
    
    this.add(label);
    this.add(adamsDeckSizeTxt);
    this.add(adamsDeckSizeVal);
    
    this.add(bobsDeckSizeTxt);
    this.add(bobsDeckSizeVal);
    
    this.add(adamsPointsTxt);
    this.add(adamsPointsVal);
    
    this.add(bobsPointsTxt);
    this.add(bobsPointsVal);
    
    this.add(currentCourseTxt);
    this.add(currentCourseVal);
  }
  
  //---------------------------------------------------------------------------
  public void updateCourse(MealCourse currentCourse)
  {
    currentCourseVal.setText(currentCourse.toText());
  }
  //---------------------------------------------------------------------------
  public void updateDeckSize(PlayerState player, Integer newAmount)
  {
    if(player == PlayerState.ADAM)
    { adamsDeckSizeVal.setText(newAmount.toString()); }
    else
    { bobsDeckSizeVal.setText(newAmount.toString()); }
  }
  
  //---------------------------------------------------------------------------
  public void updatePoints(PlayerState player, Integer newAmount)
  {
    if(player == PlayerState.ADAM)
    { adamsPointsVal.setText(newAmount.toString()); }
    else
    { bobsPointsVal.setText(newAmount.toString()); }
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
