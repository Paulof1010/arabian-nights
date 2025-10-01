package io.codeforall.bootcamp.paulof.arabiannights;

import java.util.Random;

public class MagicLamp {

    //Attributes
    public static int maxNumOfGenies;
    public static int currentNumOfGenies;
    public int numOfRecharges;

    //Constructor
    public MagicLamp() {

    }

    //Methods
    // Get a random num of genies when lamp rubbed
    public Genie rubLamp() {
        randomizeNumOfGenies();
        currentNumOfGenies = maxNumOfGenies;
        System.out.println("\n*Paulo, this lamp contains " + currentNumOfGenies + " genies!*");
        System.out.println("*Paulo rubs the lamp and a genie is being summoned...*");

        if (currentNumOfGenies % 2 == 0) {
            System.out.println("\n*You've gotten a Friendly Genie, the best one possible!*");
            return new FriendlyGenie();
        }
        if (currentNumOfGenies % 2 == 1) {
            System.out.println("\n*You've gotten a Grumpy Genie, watch out with this one!*");
            return new GrumpyGenie();
        }
        else System.out.println("\n*This lamp doesn't have any more genies! It will summon a Demon...*");
        return new RecyclableDemon();

    }

    public int randomizeNumOfGenies() {
        Random rand = new Random();
        maxNumOfGenies = rand.nextInt(5) + 1;
        return maxNumOfGenies;
    }

    // Lamp capacity
    public int getMaxNumOfGenies() {
        return maxNumOfGenies;
    }

    // Remaining genies
    public int getCurrentNumOfGenies() {
        return currentNumOfGenies;
    }

    public int getNumOfRecharges() {
        return numOfRecharges;
    }

    public void setMaxNumOfRecharges(int numOfRecharges) {
        this.numOfRecharges = numOfRecharges;
    }


}
