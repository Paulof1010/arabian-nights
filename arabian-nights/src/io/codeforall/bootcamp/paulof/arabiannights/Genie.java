package io.codeforall.bootcamp.paulof.arabiannights;

import java.util.Random;

public class Genie {

    // Attributes
    public int maxNumOfWishes;
    public int currentNumOfWishes;

    public

    // Constructor
    Genie() {
        randomizeNumOfWishes();
        currentNumOfWishes = maxNumOfWishes;
        System.out.println("\nHello, Paulo! Please, state your wishes! " +
                "I'll grant you any " + maxNumOfWishes + ".");
        System.out.println("Current: " + currentNumOfWishes);
    }

    // Methods
    public int spendWish(MagicLamp lamp) {
        if (currentNumOfWishes > 0) {
            System.out.println("Available wishes: " + currentNumOfWishes);
            System.out.println("\nPaulo: - Here's my wish!");
            currentNumOfWishes--;
        } else if (currentNumOfWishes == 0) {
            System.out.println("\nGenie: - Paulo, you ran out of wishes! Rub the lamp again!");
            lamp.rubLamp();
        }
        return currentNumOfWishes;
    }


    public int randomizeNumOfWishes() {
        Random rand = new Random();
        this.maxNumOfWishes = rand.nextInt(5) + 2;
        return maxNumOfWishes;
    }
}
