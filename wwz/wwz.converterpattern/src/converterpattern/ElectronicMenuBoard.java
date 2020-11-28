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
    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 18:25 2020/11/28
     * @Modified By:
    **/
    public ElectronicMenuBoard(){
        dishes=new ArrayList<>();
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 向dishes列表中添加菜单信息
     *
     * @Param Type
     * param: info
     * resume: 菜单信息
     *
     * @Return Value
     * @return: converterpattern.ElectronicMenuBoard
     * @resume: 返回对象本身，实现流式接口
     *
     * @Date: 18:26 2020/11/28
     * @Modified By:
    **/
    public ElectronicMenuBoard addDish(OnBoardDishInfo info){
        dishes.add(info);
        return this;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取dishes列表
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.util.List<converterpattern.OnBoardDishInfo>
     * @resume: dishes列表
     *
     * @Date: 18:26 2020/11/28
     * @Modified By:
    **/
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
