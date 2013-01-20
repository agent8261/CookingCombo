package com.cookingcombo.card;

import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import com.cookingcombo.controller.PlayerState;
import com.cookingcombo.model.ImageManager;
import com.cookingcombo.zones.CCObservable;

public abstract class Card implements ActionListener
{
  private static int globalId = 1;
  private static final ImageManager imgMngr = new ImageManager();
  private static final String imageDir = "\\images\\";
  
  public PlayerState owner = PlayerState.NOPLAYER;
  public PlayerState controller = PlayerState.NOPLAYER;
  
  public JButton cardButton = null;
  public CCObservable model = null;
  public int drawBonus = 0;
  public int pointBonus = 0;
  
  private int cardId = 0;

  //===========================================================================
  //===========================================================================
  
  // --------------------------------------------------------------------------
  // Set the drawBonus and the PointBonus
  public abstract void setBonus();
  
  // --------------------------------------------------------------------------
  // Called when card is being played (before it is in the pot)
  public abstract void isBeingPlayed();

  // --------------------------------------------------------------------------
  // Return a button representation of this card
  public abstract JButton getButton();
  
  //===========================================================================
  //===========================================================================
  
  public static ImageManager getImgMngr()
  {
    return imgMngr;
  }
  
  //===========================================================================
  //===========================================================================
  
  // --------------------------------------------------------------------------
  // Ctor
  public Card() 
  { 
    cardId = globalId++; setBonus();  
  }
  
  // --------------------------------------------------------------------------
  // Ctor
  public Card(PlayerState _owner)
  {
    owner = _owner;
    controller = _owner;
    setBonus();
  }  

  // --------------------------------------------------------------------------
  public int getUnqId()
  { return cardId; }

  // --------------------------------------------------------------------------
  public void setModel(CCObservable _model)
  {
    model = _model;
  }
  
  public JButton makeButton(String imgName)
  {
    int width = 103;
    int height = 145;
    
    if(cardButton == null)
    {
      Image image = getImgMngr().getImage(imgName).getScaledInstance(width, height, Image.SCALE_DEFAULT);
      cardButton = new JButton(new ImageIcon(image));
      cardButton.setBorder(BorderFactory.createEmptyBorder());
      cardButton.setContentAreaFilled(false);
      cardButton.addActionListener(this);
    }
    return cardButton;
  }
  
}
