package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;

public class CardTrick {

    public static int generateRandomNaumber(int min, int max){
        return new Random().nextInt((max-min)+1)+min;
    }
}