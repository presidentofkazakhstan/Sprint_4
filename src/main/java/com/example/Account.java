package com.example;

public class Account {
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (!name.isEmpty() && name.length() >= 3 && name.length() <= 19) {
            if(name.split(" ").length == 2)
            {
                if(!name.startsWith(" ") && !name.endsWith(" "))
                {
                    System.out.println("Correct name");
                    return true;
                }
            }
        }
        System.out.println("Incorrect name");
        return false;
    }
}