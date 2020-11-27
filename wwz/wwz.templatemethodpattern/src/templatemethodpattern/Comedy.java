package templatemethodpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 小品类，是Show类的一个子类
 * @Date: Created in 0:49 2020/11/28
 * @Modified By:
 **/
public class Comedy extends Show{

    /**
     * @Author: Wang Wenzheng
     * @Description: 小品的准备,重写父类函数
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:51 2020/11/28
     * @Modified By:
    **/
    @Override
    public void prepareShow() {
        PrintTool.print("We will make a comedy");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 小品的表演过程，继承父类函数
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:53 2020/11/28
     * @Modified By:
    **/
    @Override
    public void makeShow() {
        PrintTool.print("the comedy is showing!");
    }
}
