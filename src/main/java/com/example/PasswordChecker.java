package com.example;

public class PasswordChecker {

    public static void main(String[] args) {

        String name = " 128349 0533 ";

        Account account = new Account(name);

        account.checkNameToEmboss();
    }
}