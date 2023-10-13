/* @formatter:off
 *
 * Dave Rosenberg
 * Comp 2000 - Data Structures
 * Lab: List application - card game
 * Fall, 2022
 *
 * Usage restrictions:
 *
 * You may use this code for exploration, experimentation, and furthering your
 * learning for this course. You may not use this code for any other
 * assignments, in my course or elsewhere, without explicit permission, in
 * advance, from myself (and the instructor of any other course).
 *
 * Further, you may not post (including in a public repository such as on github)
 * nor otherwise share this code with anyone other than current students in my
 * sections of this course. Violation of these usage restrictions will be considered
 * a violation of the Wentworth Institute of Technology Academic Honesty Policy.
 *
 * Do not remove this notice.
 *
 * @formatter:on
 */

package edu.wit.scds.ds.list.app ;

/**
 * Representation of a player
 *
 * @author Caua Adomaitis
 *
 * @version 1.0.0 2022-11-15 Initial implementation
 */
public class Player
    {
    // TODO implement this
    
    // declaring player's hand and name
    private Hand hand ;
    private final String name ;
    
    
    
    /**
     * Creates a new Player
     * 
     * @param playerName is the Player's name
     */
    public Player ( String playerName )
        {
        
        this.hand = new Hand();
        this.name = playerName;
        
        } // end constructor
    
    /**
     * 
     * @return the player's hand
     */
    public Hand showHand ()
        {
        return this.hand ;
        
        } // end showHand
    
    /**
     * 
     * @return the player's name
     */
    public String getName ()
        {   
        return this.name ;
        
        } // end getName
    
    /**
     * 
     * @param cardToDraw is the top card of the drawpile
     */
    public void drawCard ( Card cardToDraw )
        {
        this.hand.add( cardToDraw ) ;
        
        }
    
    /**
     * 
     * 
     * @param cardToDiscard is the card selected by the player, from his hand
     * @return cardToDiscard, so it can be added to the discardPile
     */
    public Card discardCard ( Card cardToDiscard )
        {
        this.hand.remove( cardToDiscard ) ;
        return cardToDiscard ;
        
        }

    /**
     * (optional) test driver
     *
     * @param args
     *     -unused-
     */
    public static void main( final String[] args )
        {
        // OPTIONAL for testing and debugging

        }	// end main()

    }	// end class Player