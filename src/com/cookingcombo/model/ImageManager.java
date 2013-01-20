package com.cookingcombo.model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.TreeMap;

import javax.imageio.ImageIO;

public class ImageManager
{
  private TreeMap<String, BufferedImage> images = new TreeMap<String, BufferedImage>();
  private final String imageDir = "\\images\\";
  
  public void loadImage(String imgName, String fileName)
  {
    try
    {
      BufferedImage buffImg = ImageIO.read(new File(imageDir + fileName));
      if(buffImg == null)
      {  throw new IOException("Null buffImg");  }
      
      images.put(imgName, buffImg);
    }
    catch( IOException e )
    { e.printStackTrace();  }
  }
}
