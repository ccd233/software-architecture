package fluentinterfacepattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: a fluent interface pattern example
 * @Date: Created in 16:44 2020/11/25
 * @Modified By:
 **/
public class FluentInterfacePattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 展示通过流式接口流畅地制作一个蟹黄堡
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 17:16 2020/11/25
     * @Modified By:
    **/
    public static void fluentInterface() {
        PrintTool.print("SpongeBob starts making a krabby patty layer by layer fluently");
        KrabbyPattyMaker krabbyPattyMaker = new KrabbyPattyMaker(10);
        //fluent interface
        //every method return the object so that programmer can call method fluently
        krabbyPattyMaker
                .addBun("*")
                .addVegetable("&")
                .addSauce("=")
                .addPatty("#")
                .addCheese("-")
                .addPatty("#")
                .addSauce("+")
                .addVegetable("^")
                .addBun("*")
                .showKrabbyPayyt();

        PrintTool.print("it's really a huge krabby patty");
    }
}
