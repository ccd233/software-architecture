package balkingpattern;

import java.util.Scanner;
import tools.PrintTool;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 7:49 下午 2020/11/25
 * @Modified By:
 **/
public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PrintTool.print("");
        System.out.println("Please enter a filename");
        String filename=scan.next();
        Data data = new Data(filename, false, " ");

        while(true){
            System.out.println("Please enter a command(0 exit，1 start)");
            String str=scan.next();
            //input.add(str);
            if(str.equals("0")) {
                System.out.println("close");
                break;
            }
            else if(str.equals("1")){
                System.out.println("Please enter operating times:");
                String times_string=scan.next();
                int times=Integer.parseInt(times_string);
                new changeThread("CHANGE", data,times).start();
                new saveThread("SAVE", data).start();
            }
            else {
                System.out.println("Input Error:");
            }
        }

    }
}
