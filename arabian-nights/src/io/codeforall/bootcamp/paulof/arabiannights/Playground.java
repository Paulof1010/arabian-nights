package io.codeforall.bootcamp.paulof.arabiannights;

public class Playground {

    public static void main(String[] args) {

        MagicLamp magic1 = new MagicLamp();
        MagicLamp magic2 = new MagicLamp();

        Genie genie1 = magic1.rubLamp();


        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));
        System.out.println(genie1.spendWish(magic1));

    }
}
