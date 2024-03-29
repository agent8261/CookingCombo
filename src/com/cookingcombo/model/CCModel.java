package com.cookingcombo.model;

import java.awt.BorderLayout;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import com.cookingcombo.card.Card;
import com.cookingcombo.controller.Control;
import com.cookingcombo.controller.PlayerState;
import com.cookingcombo.errors.NotCookable;
import com.cookingcombo.view.HandPanel;
import com.cookingcombo.view.LeftInfoPanel;
import com.cookingcombo.view.PotPanel;
import com.cookingcombo.view.RightInfoPanel;
import com.cookingcombo.view.TurnPanel;
import com.cookingcombo.zones.DeckDiscard;
import com.cookingcombo.zones.Hand;
import com.cookingcombo.zones.HiddenZone;
import com.cookingcombo.zones.Pot;

public class CCModel extends JPanel
{
  private static final long serialVersionUID = -4111287978520392975L;
  public static final PlayerState adam = PlayerState.ADAM;
  public static final PlayerState bob = PlayerState.BOB;
  
  //---------------------------------------------------------------------------
  // View Members
  private BorderLayout layout = new BorderLayout();
  
  private TurnPanel turnPanel = new TurnPanel();
  private LeftInfoPanel leftInfoPanel = new LeftInfoPanel();
  private RightInfoPanel rightInfoPanel = new RightInfoPanel();
  
  private BoxLayout mainPotlayout = null;
  private JPanel mainPotPanel = new JPanel();
  private PotPanel adamsPotPanel = new PotPanel();
  private PotPanel bobPotPanel = new PotPanel();
  
  private HandPanel handPanel = new HandPanel();  

  //---------------------------------------------------------------------------
  // Model Members
  private DeckDiscard adamsDeck = new DeckDiscard();
  private DeckDiscard bobsDeck = new DeckDiscard();
  
  private Hand adamsHand = new Hand();
  private Hand bobsHand = new Hand();

  private HiddenZone adamsHidden = new HiddenZone();
  private HiddenZone bobsHidden = new HiddenZone();
  
  //---------------------------------------------------------------------------
  // Game Statistics
  private Pot adamsPot = new Pot();
  private Pot bobsPot = new Pot();

  private int adamsDeckSize = 0;
  private int bobsDeckSize = 0;
  
  private int currentCouse = 1;
  private int adamsPoints = 0;
  private int bobsPoints = 0;
  
  //---------------------------------------------------------------------------
  // Control members  
  private Control control = null;

  //===========================================================================
  //===========================================================================
  
  //---------------------------------------------------------------------------
  public CCModel()
  {
    // View Properties
    super();
    setLayout(layout);
    
    mainPotlayout = new BoxLayout(mainPotPanel, BoxLayout.Y_AXIS);
    mainPotPanel.setLayout(mainPotlayout);
    mainPotPanel.add(bobPotPanel);
    mainPotPanel.add(adamsPotPanel);
    
    this.add(leftInfoPanel, BorderLayout.LINE_START);
    this.add(rightInfoPanel, BorderLayout.LINE_END);
    this.add(mainPotPanel, BorderLayout.CENTER);
    this.add(turnPanel, BorderLayout.PAGE_START);
    this.add(handPanel, BorderLayout.PAGE_END);
    
    doUiDemo();
    
    /*
    // Link Model and View
    adamsHand.attach(handPanel, this);
    adamsPot.attach(adamsPotPanel, this);
    bobsPot.attach(bobPotPanel, this);
    
    control = new Control(this);
    control.makeTestDeck();
    */
  }
  
  private void doUiDemo()
  {
    adamsPotPanel.doUiDemo();
    bobPotPanel.doUiDemo();
    handPanel.doUiDemo();    
  }

  //---------------------------------------------------------------------------
  public void addCard(Card card, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      adamsDeck.addCardToDeck(card);
      rightInfoPanel.updateDeckSize(player, adamsDeck.getDeckSize());
    }
    else
    {
      bobsDeck.addCardToDeck(card);
      rightInfoPanel.updateDeckSize(player, bobsDeck.getDeckSize());    
    }
  }
  
  //---------------------------------------------------------------------------
  public void drawCards(int numCards, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      List<Card> pile = adamsDeck.drawCards(numCards);
      adamsHand.addCards(pile);
      rightInfoPanel.updateDeckSize(player, adamsDeck.getDeckSize());      
    }
    else
    {
      List<Card> pile = bobsDeck.drawCards(numCards);
      bobsHand.addCards(pile);
      rightInfoPanel.updateDeckSize(player, bobsDeck.getDeckSize());      
    }
  }
  
  //---------------------------------------------------------------------------
  public void putInPot(Card card, PlayerState player)
  {    
    try
    {
      if(player == PlayerState.ADAM)
      {
        adamsPot.addItem(card);
      }
      else
      {
        bobsPot.addItem(card);
      }
    }
    catch( NotCookable e )
    { }    
  }
  
  //---------------------------------------------------------------------------
  public void addToDiscard(Card card, PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {
      adamsDeck.discardCard(card);
    }
    else
    {
      bobsDeck.discardCard(card);
    }    
  }
  
  //---------------------------------------------------------------------------  
  public void updateDeckSize(PlayerState player, int newAmount)
  {
    if(player == PlayerState.ADAM)
    { adamsDeckSize = newAmount;  }
    else
    { bobsDeckSize = newAmount; }
    rightInfoPanel.updateDeckSize(player, newAmount);
    
  }
  
  //---------------------------------------------------------------------------
  public void updatePoints(PlayerState player, int newAmount)
  {
    if(player == PlayerState.ADAM)
    { adamsPoints = newAmount;  }
    else
    { bobsPoints = newAmount; }
    rightInfoPanel.updatePoints(player, newAmount);
  }
  
  public void doPlayer(PlayerState player)
  {
    if(player == PlayerState.ADAM)
    {}
    else
    {}
  }  
}
