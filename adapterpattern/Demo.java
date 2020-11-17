package com.java.nyx.adapterpattern;

import java.util.Scanner;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 14:52 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void adapterPattern() {
        RegularMember regularMember = new RegularMember();
        System.out.println("Now we are sign up a regular member for you");
        regularMember.setId(UUID.randomUUID());
        System.out.println("Please enter your name:");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        regularMember.setName(name);
        System.out.println("Welcome to undersea world, "
                +regularMember.getName()
                +". Your id is "
                +regularMember.getId());
        while (true) {
            System.out.println("Now you are regular member, do you want to upgrade to senior member?(y/n)");
            Scanner choiceInput = new Scanner(System.in);
            String choice = choiceInput.next();
            if (choice.equals("y")) {
                Adapter adapter = new Adapter(regularMember);
                System.out.println("You have upgraded to senior member!");
                System.out.println("You can use the fast channel");
                adapter.quickQueue();
                break;
            } else if (choice.equals("n")) {
                System.out.println("You can only use the normal channel");
                regularMember.queue();
                break;
            } else {
                System.out.println("Wrong command!");
            }
        }
    }
}
