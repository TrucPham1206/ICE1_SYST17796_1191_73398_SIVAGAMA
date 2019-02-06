/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//RUPINDER KAUR
//991513539
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
    public static void main(String[] args) 
    {
    
        CardBase[] magicHand = new CardBase[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            CardBase c = new CardBase(CardBase.SUITS[CardBase.generateRandomNo(0.3)],CardBase.generateRandomNo(1,7));
            //c.setValue(insert call to random number generator here)
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
        magicHand[i]=c;
        System.out.println((c.toString()));
        }
        Scanner keysIn =new Scanner(System.in);
        System.out.println("Enter the card's number");
        int usersNumberChoice= Integer.parseInt(scanner.next());
        System.out.println("Enterthe card's suites(Hearts,Spades,Clubs or Diamonds)");
        String userSuitChoice=scanner.next();
        CardBase userCard=new CardBase(userSuitChoice,usersNumberChoice);
        if(magicHand==true)
        {
            System.out.println("you win");
        }
        else{
            System.out.println("you lose");
            
        }
        //CHANGES HAVE BEEN DONE
        //insert code to ask the user for Card value and suit, create their card
        // and search magicHand here
        //Then report the result here
    
    
    }
    
}
