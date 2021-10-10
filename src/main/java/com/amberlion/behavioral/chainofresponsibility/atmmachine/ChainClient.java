package com.amberlion.behavioral.chainofresponsibility.atmmachine;

import java.util.Scanner;

public class ChainClient {
    public static void main(String[] args) {
         /* Create a chain of dispensers */
        CashDispenser dispenser = new CashDispenser(100);
        dispenser.setNextDispenser(new CashDispenser(50));
        dispenser.setNextDispenser(new CashDispenser(20));
        dispenser.setNextDispenser(new CashDispenser(10));
        dispenser.setNextDispenser(new CashDispenser(5));
        dispenser.setNextDispenser(new CashDispenser(2));
        dispenser.setNextDispenser(new CashDispenser(1));

        /* Get the amount */
        int amount = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter amount to withdraw: ");
        amount = in.nextInt();

        /* dispense the amount */
        dispenser.dispense(amount);

        in.close();

    }
}
