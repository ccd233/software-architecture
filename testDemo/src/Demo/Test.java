package Demo;

import java.util.Scanner;
import filterPattern.demo.demo;
import fountain.ui.Square;
import fountain.ui.UI;
import mementoPattern.demo.Client;
import visitorPattern.demo.Demo;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 8:02 下午 2020/11/17
 * @Modified By:
 **/
public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("Please enter a command(0 exit，1 filterPattern，2 mementoPattern，"
                    + "3 statePattern，4 visitorPattern)");
            String str=scan.next();
            if(str.equals("0")) {
                System.out.println("close");
                break;
            }
            else if(str.equals("1")) {
                demo demo = new demo();
                demo.filterPattern_demo();
            }
            else if(str.equals("2")) {
                Client demo = new Client();
                demo.memento_pattern();
            }
            else if(str.equals("3")) {
                Square square = new Square();
                UI ui = new UI(square);
                ui.init();
            }
            else if(str.equals("4")) {
                Demo demo = new Demo();
                demo.visitorPattern();
            }


        }
    }
}
