package com.example;

public class Account
{
    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        if (name.isEmpty()) {
            System.out.println("Имя Фамилия отсутствует.");
            return false;
        }
        else if ( name.length() <  3 ) {
            System.out.println("Имя Фамилия меньше 3");
            return false;
        }
        else if ( name.length() >  19 ) {
            System.out.println("Имя Фамилия больше  19");
            return false;
        }

        int counter = 0;


        for (int i = 0; i < name.length(); i++)
        {
            if (name.toCharArray()[i] == ' ')
            {
                counter++;
            }
        }
        if (counter > 1)
        {
            System.out.println("Имя Фамилия больше одного пробела");
            return false;
        }

        if (counter == 0)
        {
            System.out.println("Неподходящий Имя Фамилия.");
            return false;
        }

        if (name.toCharArray()[0] == ' ' || name.toCharArray()[name.length() - 1] == ' ')
        {
            System.out.println("ПРобел стоит в начале или конце");
            return false;
        }

        System.out.println("Подходящий Имя Фамилия.");
        return true;
    }


}