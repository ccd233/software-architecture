package converterpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 转换器模式的接口类
 * @Date: Created in 20:36 2020/11/25
 * @Modified By:
 **/
public class ConverterPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 转换器模式的封装接口
     *
     * @Param Type
     * param: 
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date: 21:48 2020/11/25
     * @Modified By: 
    **/
    public static void converter() {
        PrintTool.print("Captain Eugene adds some dishes into the file on his PC first");
        LocalMenuFile local = new LocalMenuFile();
        local.addDish(new LocalDishInfo("krappy patty", 20.0f, "very delicious!"))
                .addDish(new LocalDishInfo("cocacola", 10.0f, "feels really cool!"))
                .addDish(new LocalDishInfo("chips", 15.0f, "so crisp!"));
        local.showDishes();

        PrintTool.print("and he upload the menu file to the electronic menu board, " +
                "of course the information has been converted");
        ElectronicMenuBoard elect=Converter.localInfoToBoardInfo(local);
        elect.showDishes();

        PrintTool.print("Oops,Plankton hacks the board and adds a dish tasting bad");
        elect.addDish(new OnBoardDishInfo("CHUM BUCKET PASTE","$5.0","I'M PLANKTON"));
        elect.showDishes();

        PrintTool.print("Captain Eugene download the file on board and wanna modify it");
        LocalMenuFile newLocal=Converter.boardInfoToLocalInfo(elect);
        newLocal.showDishes();
    }
}
