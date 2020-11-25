package converterpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 被投放在电子菜单板上的菜单
 * @Date: Created in 17:36 2020/11/25
 * @Modified By:
 **/
public class ElectronicMenuBoard {

    private List<OnBoardDishInfo> dishes;
    public ElectronicMenuBoard(){
        dishes=new ArrayList<>();
    }

    public ElectronicMenuBoard addDish(OnBoardDishInfo info){
        dishes.add(info);
        return this;
    }

    public List<OnBoardDishInfo> getDishes(){
        return dishes;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 由于转换器模式是一种用于在两个对象之间传输数据的模式，不便于直观展示，所以通过字符串的大小写转换以及数据类型转换体现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 19:40 2020/11/25
     * @Modified By:
     **/
    public void showDishes(){
        PrintTool.print("here is the menu on board");
        for(OnBoardDishInfo dish :dishes){
            System.out.println(dish);
        }
    }
}
