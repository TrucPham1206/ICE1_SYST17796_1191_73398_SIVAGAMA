/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;

import java.util.Objects;
import java.util.Random;

/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * add your name as a modifier.
 * @author Sivagami
 */
public class CardBase
{
    private String suit; // Hearts,Spades,Clubs,Diamond
    private int value; //1-13
    public static final String[] SUITS={"Hearts","Spades","Clubs","Diamonds"};

    public CardBase(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return "CardBase{" +
                "suit='" + suit + '\'' +
                ", value=" + value +
                '}';
    }

    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

// insert 2 random number methods for generating value and suits


    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CardBase cardBase = (CardBase) o;
        return value == cardBase.value &&
        Objects.equals(suit, cardBase.suit);
    }

    @Override
        public int hashCode()
        {
        return Objects.hash(suit, value);
        }
        
        public class CardTrick
        {

        public static int generateRandomNaumber(int min, int max)
        {
        return new Random().nextInt((max-min)+1)+min;
        }
}
        
}