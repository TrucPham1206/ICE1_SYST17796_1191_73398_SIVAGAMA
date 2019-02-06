/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Scanner;
/****
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.
 * To be used as starting code for ICE 1
 * @author Sivagami
 */
public class Card {

    /**
     * @param args the command line arguments
     */
    //insert 2 random number methods for value and suit
    public static void main(String[] args) 
    {{
    
        CardBase[] magicHand = new CardBase[7];
        CardBase myCard = new CardBase();
        CardBase luckyCard = new CardBase();
        Scanner k = new Scanner(System.in);
        Boolean cardFound = false;
        
        for (int i=0; i<magicHand.length; i++)
        {
           magicHand[i]=new CardBase();
           magicHand[i].setValue(CardBase.randomValue());
           magicHand[i].setSuit(CardBase.SUITS[CardBase.randomSuit()]);}
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        
        
        }
        
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
       /* System.out.print("Enter a card value (1 - A, 2 - 10, 11 - J, 12 - Q, 13 - K): ");
             myCard.setValue(k.nextInt());
               k.nextLine();
                System.out.print("Enter a card suit (0 - Hearts, 1 - Spades, 2 - Clubs, 3 - Diamonds): ");
                myCard.setSuit(CardBase.SUITS[k.nextInt()]);
                k.nextLine();*/
                luckyCard.setValue(1);
        luckyCard.setSuit(CardBase.SUITS[1]);
        
        System.out.println("Seven randonmy selected cards:");
        for (int i = 0; i < magicHand.length; i++) {
            System.out.println(magicHand[i].getValue() + " of " + magicHand[i].getSuit());
            if (luckyCard.getValue() == magicHand[i].getValue() && luckyCard.getSuit().equals(magicHand[i].getSuit())) {
                cardFound = true;
            }
        }
        
        if (cardFound) {
            System.out.println("The card  was found!");
        }
        else {
            System.out.println("bad luck,The card was not found !");
        }
    }
    
}
    
    
        
    
}
