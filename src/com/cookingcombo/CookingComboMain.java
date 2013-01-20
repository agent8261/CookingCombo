package com.cookingcombo;

import javax.swing.JFrame;

import com.cookingcombo.view.MenuBarView;
import com.cookingcombo.view.RootPanel;

public class CookingComboMain
{
  static public class CookingComboRunner implements Runnable
  {
    private static final String coreFrameTitleTxt = "Cooking Combo";
    
    @Override
    public void run()
    {
      JFrame coreFrame = new JFrame(coreFrameTitleTxt);
      coreFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      RootPanel rootPanel = new RootPanel();
      MenuBarView menuBarView = new MenuBarView();
      
      coreFrame.setJMenuBar(menuBarView);
      coreFrame.add(rootPanel);
      coreFrame.pack();
      coreFrame.setVisible(true);      
    }
  }
  public static void main(String[] args)
  {
    CookingComboRunner run = new CookingComboRunner();
    javax.swing.SwingUtilities.invokeLater(run);
  }

}
