package mementopattern;

import mementopattern.character.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tools.PrintTool;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/
public class MementoPattern {

	/**
	 * 基本的演示类，运行后输入数字代表命令
	 * @return
	 */
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
			PrintTool.print("Please enter a command(0 exit, 1 add lighting state, "
					+ "2 redo, 3 List all states)");
			String str=scan.next();
	        if(str.equals("0")) {
	        	PrintTool.print("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	PrintTool.print("Please enter the number of lighting type");
	        	String number = scan.next();
				if(numberCount.contains(number)){
					PrintTool.print("State is already stated");
				}
	        	originator.setState("State Lighting state " + number);
	            caretaker.createMemento();
	        }
	        else if(str.equals("2")) {
	        	PrintTool.print("Which state do you want to return to:");
	        	String stateNumberString = scan.next();
	        	if(numberCount.contains(stateNumberString)){
					int stateNumber=Integer.parseInt(stateNumberString);
					caretaker.restoreMemento(stateNumber - 1);
				}
	        	else{
					PrintTool.print("Input Error, State isn't found");
				}

	        }
	        else if(str.equals("3")) {
	        	originator.pringStates();
	        }
	        else{
				PrintTool.print("Input Error");
			}
		}
	}

	/**
	 * 接口函数
	 */
	public static void work() {
		MementoPattern demo = new MementoPattern();
		demo.memento_pattern();
	}

}
