package gamelooppattern;

import tools.PrintTool;

import java.util.Scanner;

public class GameLoopPattern {
    //output interface
    public static void work(){
        PrintTool.print("Ball Dropping Game");
        PrintTool.print("The Ball is dropping from 100 meters high");
        PrintTool.print("push h button when you think the ball is off ground less than 10 meters.");
        PrintTool.print("Input 'start' to start the game");
        PrintTool.print("Input 'again' to try the game again");
        PrintTool.print("Input 'quit' to quit the game");
        GameLogic multi_thread=new GameLogic(100);
        Scanner reader=new Scanner(System.in);
        while(true){
            String Input=reader.nextLine();
            if(Input.equals("start")){
                if(!multi_thread.isLoop()){
                    multi_thread=new GameLogic(100);
                }
                multi_thread.start();
            } else if(Input.equals("quit")){
                break;
            } else if(Input.equals("h")){
                if(!multi_thread.isLoop()){
                    PrintTool.print("You've Miss it,please try again.");
                    continue;
                }
                double h = multi_thread.height();
                if(h < 10) {
                    PrintTool.print("Congratulation");
                } else{
                    PrintTool.print("Miss");
                    PrintTool.print("Stop at height:"+Double.toString(h));
                }
                multi_thread.end();
            } else if(Input.equals("again")){
                multi_thread=new GameLogic(100);
                multi_thread.start();
            } else {
                PrintTool.print("Invalid command,please try again.");
            }
        }
    }
}
