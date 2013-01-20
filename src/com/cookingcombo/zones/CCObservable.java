package com.cookingcombo.zones;

import javax.swing.JButton;

import com.cookingcombo.card.Card;
import com.cookingcombo.model.CCModel;
import com.cookingcombo.view.CCViewer;

public abstract class CCObservable 
{
  public CCViewer viewer = null;
  public CCModel model = null;
  
  public void attach(CCViewer _viewer, CCModel _model)
  {
    assert(_viewer != null);
    assert(_model != null);
    viewer = _viewer;
    model = _model;
  }
  
  public void addButtonToView(Card card)
  {
    assert(viewer != null);
    assert(card != null);
    JButton button = card.getButton();
    assert(button != null);
    viewer.addButton(button);
  }
  
  public void removeButtonFromView(Card card)
  {
    assert(viewer != null);
    assert(card != null);
    JButton button = card.getButton();
    assert(button != null);    
    viewer.removeButton(button);    
  }  
}
