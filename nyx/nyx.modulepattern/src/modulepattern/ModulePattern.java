package modulepattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: two ways of get into the park
 * @Date: Created in 21:52 2020/11/25
 * @Modified By:
 **/
public class ModulePattern {
    public static void modulePattern() {
        PrintTool.print("The visitor buy ticket online:");
        GetTicket visitor = new OnlineTicket();
        visitor.enterPark();
        PrintTool.print("The visitor buy ticket in cash:");
        visitor = new PaperTicket();
        visitor.enterPark();
    }
}
