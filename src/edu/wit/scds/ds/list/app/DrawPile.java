
package edu.wit.scds.ds.list.app;

import java.util.ArrayList ;

/**
 * 
 * 
 * @author Caua Adomaitis
 * @version 1.0.0 2022-11-28 Initial implementation
 *
 */
public class DrawPile extends Pile
    {
    
    /**
     * @param list
     */
    public DrawPile( ArrayList<Card> list )
        {
        super( list ) ;

        } // end constructor
    
    
    /**
     * 
     * @return the top card of the pile
     */
    public Card getTopCard ()
        {
        return this.cards.get( this.cards.size() ) ;
        
        } // end getTopCard

    }
   // end class DrawPile