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
     * @Date: 18:28 2020/11/28
     * @Modified By:
    **/
    LocalMenuFile(){
        dishes=new ArrayList<>();
    }
    /**
     * @Author: Wang Wenzheng
     * @Description: 向dishes列表中添加菜单信息
     *
     * @Param Type
     * param: info
     * resume:
     *
     * @Return Value
     * @return: converterpattern.LocalMenuFile
     * @resume: 返回对象本身，实现流式接口
     *
     * @Date: 18:28 2020/11/28
     * @Modified By:
    **/
    public LocalMenuFile addDish(LocalDishInfo info){
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
     * @return: java.util.List<converterpattern.LocalDishInfo>
     * @resume: dishes列表
     *
     * @Date: 18:30 2020/11/28
     * @Modified By:
    **/
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
