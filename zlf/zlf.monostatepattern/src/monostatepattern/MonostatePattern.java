package monostatepattern;

import java.util.Scanner;

public class MonostatePattern {
    public static void work(){
        String command;
        MonoStateBoard board=new MonoStateBoard();
        Scanner input=new Scanner(System.in);
        System.out.println("This is a message board.");
        System.out.println("you can leave your message here.");
        System.out.println("Input 'message' to write message on board.");
        System.out.println("Input 'show' to read the message on board.");
        System.out.println("Input 'quit' to leave.");
        while(true){
            System.out.println("Your command:");
            command=input.nextLine();
            if(command==null){
                System.out.println("The command is not valid,please check.");
                continue;
            } else if(command.equals("message")){
                System.out.println("Input your message:");
                String message=input.nextLine();
                board.SetMessage(message);
            } else if(command.equals("show")){
                System.out.println("The message on board:"+board.GetMessage());
            } else if(command.equals("quit")){
                break;
            }
        }
    }
}
