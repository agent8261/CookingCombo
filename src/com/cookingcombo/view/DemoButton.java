package com.cookingcombo.view;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class DemoButton extends JButton
{
  private static final long serialVersionUID = 3797073020677376456L;
  static public BufferedImage buffImg = null;
  
  static
  {
    try
    { buffImg = ImageIO.read(new File(".\\images\\" + "garlicFrame.png")); }
    catch( IOException e )
    { e.printStackTrace();  }    
  }
  
  public DemoButton()
  {
    int width = 103;
    int height = 145;
    
    Image image = buffImg.getScaledInstance(width, height, Image.SCALE_DEFAULT);
    setIcon(new ImageIcon(image));
    setBorder(BorderFactory.createEmptyBorder());
    setContentAreaFilled(false);
  }
}
