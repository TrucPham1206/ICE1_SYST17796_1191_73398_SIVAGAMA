/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

/****
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card.s
 * To be used as starting code for ICE 1
 * @author Sivagami
 */
public class Card {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        CardBase[] magicHand=new CardBase[7];
        
        for(int i=0;i<magicHand.length;i++)
        {
            CardBase c = new CardBase(CardBase.SUITS[CardBase.generateRandomNumber(0,3)],CardBase.generateRandomNumber(1,7));
            magicHand[i]=c;
            System.out.println((c.toString()));
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the card's number");
        int usersNumberChoice= Integer.parseInt(scanner.next());
        System.out.println("Enter the card's suites( Hearts,Spades,Clubs or Diamonds)");
        String usersuitChoice= scanner.next();
        CardBase userCard =new CardBase(usersuitChoice,usersNumberChoice);
        System.out.println((Arrays.asList(magicHand).contains(userCard))?"You win":"You lose");
    }
    //changes are done 
}
     
