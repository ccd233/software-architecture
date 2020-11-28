package adapterpattern;

import tools.PrintTool;

import java.util.Scanner;
import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: 普通用户和高级用户的队列通道区别，可通过适配器让普通用户升为高级用户
 * @Date: Created in 14:52 2020/11/17
 * @Modified By:
 **/
public class Demo {
    public void adapterPattern() {
        RegularMember regularMember = new RegularMember();
        PrintTool.print("Now we are sign up a regular member for you");
        regularMember.setId(UUID.randomUUID());
        PrintTool.print("Please enter your name:");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.next();
        regularMember.setName(name);
        PrintTool.print("Welcome to undersea world, "
                +regularMember.getName()
                +". Your id is "
                +regularMember.getId());
        while (true) {
            PrintTool.print("Now you are regular member, do you want to upgrade to senior member?(y/n)");
            Scanner choiceInput = new Scanner(System.in);
            String choice = choiceInput.next();
            if (choice.equals("y")) {
                Adapter adapter = new Adapter(regularMember);
                PrintTool.print("You have upgraded to senior member!");
                PrintTool.print("You can use the fast channel");
                adapter.quickQueue();
                break;
            } else if (choice.equals("n")) {
                PrintTool.print("You can only use the normal channel");
                regularMember.queue();
                break;
            } else {
                PrintTool.print("Wrong command!");
            }
        }
    }
}
