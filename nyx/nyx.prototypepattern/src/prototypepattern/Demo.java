package prototypepattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author Nie Yixin
 * @Description: 通过输出交互，体现鱼类的克隆过程，最后会输出鱼的列表
 * @Date: Created in 14:48 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void prototypePattern() {
        List<Fish> fishes = new ArrayList<>();
        while (true) {
            PrintTool.print("please choose a kind of fish to create: s(shark),w(whale),t(turtle),e(exit)");
            Scanner fishNameInput = new Scanner(System.in);
            String fishName = fishNameInput.next();
            if (fishName.equals("s")) {
                PrintTool.print("please type in the shark color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                PrintTool.print("please type in the shark type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                PrintTool.print("please type in the shark weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                String weightString=weightInput.nextLine();
                int weight;
                try {
                    weight = Integer.parseInt(weightString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }

                PrintTool.print("please type in the shark year:");
                Scanner yearInput = new Scanner(System.in);
                String yearString=yearInput.nextLine();
                int year;
                try {
                    year = Integer.parseInt(yearString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }
                FishDirector director = new FishDirector();
                Shark shark = director.createShark(color, type, weight, year);
                fishes.add(shark);
                while (true) {
                    PrintTool.print("Do you want to clone it?(y/n)");
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
                PrintTool.print("please type in the whale color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                PrintTool.print("please type in the whale type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                PrintTool.print("please type in the whale weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                String weightString=weightInput.nextLine();
                int weight;
                try {
                    weight = Integer.parseInt(weightString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }

                PrintTool.print("please type in the whale year:");
                Scanner yearInput = new Scanner(System.in);
                String yearString=yearInput.nextLine();
                int year;
                try {
                    year = Integer.parseInt(yearString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }
                FishDirector director = new FishDirector();
                Whale whale = director.createWhale(color, type, weight, year);
                fishes.add(whale);
                while (true) {
                    PrintTool.print("Do you want to clone it?(y/n)");
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
                PrintTool.print("please type in the turtle color:");
                Scanner colorInput = new Scanner(System.in);
                String color = colorInput.next();
                PrintTool.print("please type in the turtle type:");
                Scanner typeInput = new Scanner(System.in);
                String type = typeInput.next();
                PrintTool.print("please type in the turtle weight(ponds):");
                Scanner weightInput = new Scanner(System.in);
                String weightString=weightInput.nextLine();
                int weight;
                try {
                    weight = Integer.parseInt(weightString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }

                PrintTool.print("please type in the turtle year:");
                Scanner yearInput = new Scanner(System.in);
                String yearString=yearInput.nextLine();
                int year;
                try {
                    year = Integer.parseInt(yearString);
                } catch (NumberFormatException e) {
                    PrintTool.print("Please Input Number");
                    continue;
                }
                FishDirector director = new FishDirector();
                Turtle turtle = director.createTurtle(color, type, weight, year);
                fishes.add(turtle);
                while (true) {
                    PrintTool.print("Do you want to clone it?(y/n)");
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
                PrintTool.print("Here are some fish: ");
                for (Fish fish : fishes) {
                    PrintTool.print("color: "+fish.getColor());
                    PrintTool.print("type: "+fish.getType());
                    PrintTool.print("weight: "+fish.getWeight());
                    PrintTool.print("years: "+fish.getYear());
                }
                break;
            }
            else {
                PrintTool.print("Wrong command!");
            }
        }
    }
}
