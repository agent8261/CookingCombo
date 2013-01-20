package com.cookingcombo;

import javax.swing.JFrame;

import com.cookingcombo.model.CCModel;
import com.cookingcombo.view.MenuBarView;

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
      CCModel model = new CCModel();
      MenuBarView menuBarView = new MenuBarView();
      
      coreFrame.setJMenuBar(menuBarView);
      coreFrame.add(model);
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
