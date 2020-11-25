package converterpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Wang Wenzheng
 * @Description: 蟹老板自己电脑上的菜单文件
 * @Date: Created in 17:37 2020/11/25
 * @Modified By:
 **/
public class LocalMenuFile {
    private List<LocalDishInfo> dishes;
    LocalMenuFile(){
        dishes=new ArrayList<>();
    }
    public LocalMenuFile addDish(LocalDishInfo info){
        dishes.add(info);
        return this;
    }
    public List<LocalDishInfo> getDishes(){
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
        PrintTool.print("here is the menu in Captain Eugene‘s PC");
        for(LocalDishInfo dish :dishes){
            System.out.println(dish);
        }
    }
}
