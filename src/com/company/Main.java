package com.company;

import com.company.Rooms;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<String, Boolean> inventory
                = new HashMap<String, Boolean>();

        inventory.put("key", false);

        Rooms.frontPorch(inventory);
    }
}
