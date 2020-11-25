package mementopattern;

import mementopattern.character.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MementoPattern {
	
	public void memento_pattern() {
		Originator originator = new Originator();
        Caretaker caretaker = new Caretaker(originator);
        //存放状态数字，防止输入错误
		List<String> numberCount=new ArrayList<String>();
        //改变状态
        originator.setState("Stage lighting state 0");
        numberCount.add("0");
        //建立一个检查点
        caretaker.createMemento();
        originator.setState("Stage lighting state 1");
		numberCount.add("1");
        caretaker.createMemento();
        originator.setState("Stage lighting state 2");
		numberCount.add("2");
        caretaker.createMemento();
        originator.setState("Stage lighting state 3");
		numberCount.add("3");
        caretaker.createMemento();
        originator.setState("Stage lighting state 4");
		numberCount.add("4");
        caretaker.createMemento();
        //打印出所有的检查点
        originator.pringStates();

        
        Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Please enter a command(0 exit, 1 add lighting state, "
					+ "2 redo, 3 List all states)");
			String str=scan.next();
	        if(str.equals("0")) {
	        	System.out.println("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	System.out.println("Please enter the number of lighting type");
	        	String number = scan.next();
				if(numberCount.contains(number)){
					System.out.println("State is already stated");
				}
	        	originator.setState("State Lighting state " + number);
	            caretaker.createMemento();
	        }
	        else if(str.equals("2")) {
	        	System.out.println("Which state do you want to return to:");
	        	String stateNumberString = scan.next();
	        	if(numberCount.contains(stateNumberString)){
					int stateNumber=Integer.parseInt(stateNumberString);
					caretaker.restoreMemento(stateNumber - 1);
				}
	        	else{
					System.out.println("Input Error, State isn't found");
				}

	        }
	        else if(str.equals("3")) {
	        	originator.pringStates();
	        }
	        else{
				System.out.println("Input Error");
			}
		}
	}
	
	public static void work() {
		MementoPattern demo = new MementoPattern();
		demo.memento_pattern();
	}

}
