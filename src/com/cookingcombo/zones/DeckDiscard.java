package com.cookingcombo.zones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.cookingcombo.card.Card;
import com.cookingcombo.errors.EmptyDeck;

// First is top, last is bottom
public class DeckDiscard extends CCObservable
{
  private LinkedList<Card> deck = new LinkedList<Card>();
  private LinkedList<Card> discard = new LinkedList<Card>();
  
  // --------------------------------------------------------------------------
  public void addCardToDeck(Card card)
  {  deck.add(card);  }
  
  // --------------------------------------------------------------------------
  // Shuffle Deck
  void shuffleDeck()
  {
    Collections.shuffle(deck);
  }

  // --------------------------------------------------------------------------  
  // Shuffle the Discard pile into the Deck
  void shuffleDiscardIntoDeck()
  {
    for(Card card: discard)
    {  deck.add(card);  }
    discard.clear();
    shuffleDeck();
  }
  
  //--------------------------------------------------------------------------
  // Draw a single card from the deck
  public Card drawCard() throws EmptyDeck
  {
    if(deck.size() == 0)
    { throw new EmptyDeck();  }
    Card card = deck.removeFirst();
    return card;
  }
  
  //--------------------------------------------------------------------------
  // Draw several cards from the deck
  public List<Card> drawCards(int numCards)
  {
    List<Card> pile = new ArrayList<Card>();
    
    for(int i=0; i < numCards; i++)
    { 
      try
      { pile.add(drawCard()); }
      catch( EmptyDeck e )
      { return null;  }
    }    
    return pile;
  }
  
  //--------------------------------------------------------------------------
  // add a single card to the discard pile
  public void discardCard(Card card)
  {
    discard.add(card);
  }
  
  //--------------------------------------------------------------------------
  // discards a pile of cards
  public void discardCards(List<Card> cards)
  {
    for(Card card: cards)
    { discardCard(card);  }
  }
  
  //--------------------------------------------------------------------------
  public int getDeckSize()
  { return deck.size(); }
}
