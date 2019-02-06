/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
package ICE1;

import java.util.Scanner;

/****
 * A class that fills a magic hand of 7 cards with random Card Objects and then
 * asks the user to pick a card and searches the array of cards for the match to
 * the user's card. To be used as starting code for ICE 1
 * 
 * @author Sivagami
 */
public class Card {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		boolean output = false;
		CardBase[] magicHand = new CardBase[7];
		CardBase c = new CardBase();

		Scanner userInt = new Scanner(System.in);
		Scanner userString = new Scanner(System.in);

		System.out.println("Please enter a card value: ");
		int userNum = userInt.nextInt();
		System.out.println("Please enter a card suit(0=Hearts, 1=Spades, 2=Clubs or 3=Diamonds)");
		int userSuit = userString.nextInt();
		int x;
		for (int i = 0; i < magicHand.length; i++) {
			x = c.giveSuit();
			c.setValue(c.giveValue());
			c.setSuit(CardBase.SUITS[x]);
			if (c.getValue() == userNum && x == userSuit) {
				output = true;

			}
		}

		if (output) {
			System.out.println(" You guessed one of the cards!");
		} else {
			System.out.println(" You didn't guess any of the cards");

		}

		// insert code to ask the user for Card value and suit, create their card
		// and search magicHand here
		// Then report the result here

	}

}
