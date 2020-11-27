package templatemethodpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 一个舞蹈节目类，是Show类的子类
 * @Date: Created in 0:56 2020/11/28
 * @Modified By:
 **/
public class Dance extends Show{

    /**
     * @Author: Wang Wenzheng
     * @Description: 舞蹈节目的准备,重写父类函数
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
        PrintTool.print("We will dance");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 舞蹈节目的表演过程，继承父类函数
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
        PrintTool.print("the dance is showing!");
    }
}

