package gameloop;

import java.util.Scanner;

public class GameLoopTest {
    public static void work(){
        System.out.println("Ball Dropping Game");
        System.out.println("The Ball is dropping from 100 meters high");
        System.out.println("push h button when you think the ball is off ground less than 10 meters.");
        System.out.println("Input 'start' to start the game");
        System.out.println("Input 'again' to try the game again");
        System.out.println("Input 'quit' to quit the game");
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
                    System.out.println("You've Miss it,please try again.");
                    continue;
                }
                double h = multi_thread.height();
                if(h < 10) {
                    System.out.println("Congratulation");
                } else{
                    System.out.println("Miss");
                    System.out.println("Stop at height:"+Double.toString(h));
                }
                multi_thread.end();
            } else if(Input.equals("again")){
                multi_thread=new GameLogic(100);
                multi_thread.start();
            } else {
                System.out.println("Invalid command,please try again.");
            }
        }
    }
}
