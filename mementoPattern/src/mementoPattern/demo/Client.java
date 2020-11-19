package mementoPattern.demo;

import mementoPattern.character.*;

import java.util.Scanner;

public class Client {
	
	public void memento_pattern() {
		Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);
        //改变状态
        originator.setState("Stage lighting state 0");
        //建立一个检查点
        caretaker.createMemento();
        originator.setState("Stage lighting state 1");
        caretaker.createMemento();
        originator.setState("Stage lighting state 2");
        caretaker.createMemento();
        originator.setState("Stage lighting state 3");
        caretaker.createMemento();
        originator.setState("Stage lighting state 4");
        caretaker.createMemento();
        //打印出所有的检查点
        originator.pringStates();
        
        Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a command(0 exit, 1 add lighting state, "
					+ "2 redo, 3 List all states, 4 ");
			String str=scan.next();
	        if(str.equals("0")) {
	        	System.out.println("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	System.out.println("Please enter the number of lighting type");
	        	String number = scan.next();
	        	originator.setState("State " + number);
	            caretaker.createMemento();
	        }
	        else if(str.equals("2")) {
	        	System.out.println("Which state do you want to return to:");
	        	int stateNumber = scan.nextInt();
	        	caretaker.restoreMemento(stateNumber - 1);
	        }
	        else if(str.equals("3")) {
	        	originator.pringStates();
	        }
		}
	}
	
	public static void main(String[] args) {
		Client demo = new Client();
		demo.memento_pattern();
	}

}
