package monostatepattern;

import tools.PrintTool;

import java.util.Scanner;

public class MonostatePattern {
    //OUTPUT INTERFACE
    public static void work(){
        String command;
        MonoStateBoard board=new MonoStateBoard();
        Scanner input=new Scanner(System.in);
        PrintTool.print("This is a message board.");
        PrintTool.print("you can leave your message here.");
        PrintTool.print("Input 'message' to write message on board.");
        PrintTool.print("Input 'show' to read the message on board.");
        PrintTool.print("Input 'quit' to leave.");
        while(true){
            PrintTool.print("Your command:");
            command=input.nextLine();
            if(command==null){
                PrintTool.print("The command is not valid,please check.");
                continue;
            } else if(command.equals("message")){
                PrintTool.print("Input your message:");
                String message=input.nextLine();
                board.SetMessage(message);
            } else if(command.equals("show")){
                PrintTool.print("The message on board:"+board.GetMessage());
            } else if(command.equals("quit")){
                break;
            }
        }
    }
}
