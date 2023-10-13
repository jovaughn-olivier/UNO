
package edu.wit.scds.ds.list.app;

import java.util.Scanner ;

/**
 * 
 * 
 * @author Jovaughn Olivier
 * @version 1.0.0 2022-11-16 Initial implementation
 *
 */
public class UNOApp
    {

    /**
     * 
     * 
     * @param args
     */
    public static void main( String[] args )
        {
        Scanner input = new Scanner(System.in);
        System.out.print("How many players? ");
        
        int numberOfPlayers = input.nextInt();
        while ( numberOfPlayers < 3 || numberOfPlayers > 4) {
        System.out.print("\n*We need 3 -4 players. Enter Number of players again* "); 
            numberOfPlayers = input.nextInt();
        }
        
        int[] players = new int[numberOfPlayers];
      
        
        System.out.print("\nDealing "+numberOfPlayers+" decks...");

        int direction = 1;
        
        //if( card)
        
        }

    }
   // end class UNOApp