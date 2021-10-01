package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Rooms {

    public static String promptUser() {
        Scanner sc = new Scanner(System.in);
        String userEntry = "";

        System.out.print("What would you like to do? ");

        userEntry = sc.nextLine();

        return userEntry;
    }

    public static void frontPorch(HashMap<String, Boolean> inv) {

        String userEntry;

        System.out.println("\nYou find yourself in a very drafty front porch. The windows are broken on either side " +
                "\nand the front door is very weathered. The door does appear to still be solid enough " +
                "\nto keep you out without a key, however. Beneath your feet is a doormat. It's in better shape " +
                "\nthan the windows, but not by much.");

        userEntry = promptUser();

        switch (userEntry) {
            case "look door":
                System.out.println("It's still there.");
                frontPorch(inv);
                break;
            case "open door",
                    "unlock door":
                if (inv.get("key")) {
                    entryWay(inv);
                } else {
                    System.out.println("Didn't I mention that it's weathered, and locked?");
                    frontPorch(inv);
                }
                break;
            case "look doormat":
                if (inv.get("key")) {
                    System.out.println("I think you looked there already.");
                    frontPorch(inv);
                } else {
                    System.out.println("It looks like it used to have some clever saying on it. " +
                            "Underneath you find a key, how original.");
                    inv.put("key", true);
                }
                frontPorch(inv);
                break;
            default:
                System.out.println("I'm not sure what you mean.");
                frontPorch(inv);
        }
    }

    private static void entryWay(HashMap<String, Boolean> inv) {
        System.out.println("You are in the entryway.");
    }
}
