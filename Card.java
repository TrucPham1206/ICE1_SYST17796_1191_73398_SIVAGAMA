    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

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
    public  static int randomSuit(){
        int value = (int)(Math.random()*4) ;
        return value;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner (System.in);
        boolean same = false;
    
        Card[] magicHand = new Card[7];
        CardBase c = new CardBase();
        for (int i=0; i<magicHand.length; i++)
        {
            c = new CardBase();
            //c.setValue(insert call to random number generator here)
            c.setValue(c.randomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(CardBase.SUITS[randomSuit()]);
             System.out.println(c.getSuit());
             System.out.println(c.getValue());
        
        
        }
        //insert code to ask the user for Card value and suit, create their card
       

        
        System.out.print("What is the value of the card ");    
        int userValue = input.nextInt();
        System.out.println("");
        
        System.out.print("What is the Suit of the card ");    
        String userSuit = input.next();
        
        CardBase u = new CardBase();
        
        u.setValue(userValue);
        u.setSuit(userSuit);
        
        // and search magicHand here
        for(int i=0; i<magicHand.length; i++){
            if (c.getSuit().equals(u.getSuit()) && c.getValue() == u.getValue()){
                same = true;       
            }
            else{
                same = false;
            }
            
        }
        
          
        //Then report the result here
        if (same == true){
            System.out.println("Congrats your card is in the magic hand");
            
        }
        else{
            System.out.println("Sorry your card is not in the magic hand");          
        }
    
   CardBase luckyCard = new CardBase   
        luckyCard.setValue(12);
        luckyCard.setSuit("heart)
    }
    
}
