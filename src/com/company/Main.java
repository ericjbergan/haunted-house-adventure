package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Boolean> inventory
                = new HashMap<String, Boolean>();

        Scanner sc = new Scanner(System.in);

        inventory.put("key", false);

        System.out.println("\nWelcome to Haunted House Adventure. Hopefully you will come through the experience all " +
                "\nin one piece and without too many extra gray hairs. When prompted, type in your instruction, " +
                "\nfor example: \033[3mlook door\033[0m or \033[3mgo north\033[0m. Click any key to step into the " +
                "enclosed porch.");
        String getStarted = sc.nextLine();
        Rooms.frontPorch(inventory);
    }
}
