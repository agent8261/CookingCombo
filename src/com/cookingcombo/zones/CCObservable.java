package com.cookingcombo.zones;

import com.cookingcombo.model.CCModel;
import com.cookingcombo.view.CCViewer;

public abstract class CCObservable 
{
  public CCViewer viewer = null;
  public CCModel model = null;
  
  public void attach(CCViewer view, CCModel _model)
  {
    viewer = view;
    model = _model;
  }  
}
