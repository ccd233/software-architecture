package com.java.nyx.prototypepattern;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 11:05 2020/11/13
 * @Modified By:
 **/
public class Application {
    public static void main(String[] args) {
        List<Fish> fishes = new ArrayList<>();
        while (true) {
            System.out.println("please choose a kind of fish to create: s(shark),w(whale),t(turtle),e(exit)");
            Scanner fishNameInput = new Scanner(System.in);
            String fishName = fishNameInput.next();
            if (fishName.equals("s")) {
                System.out.println("please type in the shark color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                System.out.println("please type in the shark type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                System.out.println("please type in the shark weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                int weight = weightInput.nextInt();
                System.out.println("please type in the shark year:");
                Scanner yearInput = new Scanner(System.in);
                int year = yearInput.nextInt();
                FishDirector director = new FishDirector();
                Shark shark = director.createShark(color, type, weight, year);
                fishes.add(shark);
                while (true) {
                    System.out.println("Do you want to clone it?(y/n)");
                    Scanner choiceInput = new Scanner(System.in);
                    String choice = choiceInput.next();
                    if (choice.equals("y")) {
                        Shark anotherShark = director.cloneShark(shark);
                        fishes.add(anotherShark);
                    } else if (choice.equals("n")) {
                        break;
                    }
                }
            } else if (fishName.equals("w")) {
                System.out.println("please type in the whale color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                System.out.println("please type in the whale type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                System.out.println("please type in the whale weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                int weight = weightInput.nextInt();
                System.out.println("please type in the whale years:");
                Scanner yearInput = new Scanner(System.in);
                int year = yearInput.nextInt();
                FishDirector director = new FishDirector();
                Whale whale = director.createWhale(color, type, weight, year);
                fishes.add(whale);
                while (true) {
                    System.out.println("Do you want to clone it?(y/n)");
                    Scanner choiceInput = new Scanner(System.in);
                    String choice = choiceInput.next();
                    if (choice.equals("y")) {
                        Whale anotherWhale = director.cloneWhale(whale);
                        fishes.add(anotherWhale);
                    } else if (choice.equals("n")) {
                        break;
                    }
                }
            } else if (fishName.equals("t")) {
                System.out.println("please type in the turtle color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                System.out.println("please type in the turtle type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                System.out.println("please type in the turtle weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                int weight = weightInput.nextInt();
                System.out.println("please type in the turtle years:");
                Scanner yearInput = new Scanner(System.in);
                int year = yearInput.nextInt();
                FishDirector director = new FishDirector();
                Turtle turtle = director.createTurtle(color, type, weight, year);
                fishes.add(turtle);
                while (true) {
                    System.out.println("Do you want to clone it?(y/n)");
                    Scanner choiceInput = new Scanner(System.in);
                    String choice = choiceInput.next();
                    if (choice.equals("y")) {
                        Turtle anotherTurtle = director.cloneTurtle(turtle);
                        fishes.add(anotherTurtle);
                    } else if (choice.equals("n")) {
                        break;
                    }
                }
            } else if (fishName.equals("e")) {
                System.out.println("Here are some fish: ");
                for (Fish fish : fishes) {
                    System.out.println("color: "+fish.getColor());
                    System.out.println("type: "+fish.getType());
                    System.out.println("weight: "+fish.getWeight());
                    System.out.println("years: "+fish.getYear());
                }
                break;
            }
            else {
                System.out.println("Wrong command!");
            }
        }
    }
}
