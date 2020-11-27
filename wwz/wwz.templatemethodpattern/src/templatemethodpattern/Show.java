package templatemethodpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 海底世界嘉年华演出的每一个节目抽象类
 * @Date: Created in 0:35 2020/11/28
 * @Modified By:
 **/
public abstract class Show {
    /**
     * @Author: Wang Wenzheng
     * @Description: 每一个节目的准备
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:39 2020/11/28
     * @Modified By:
    **/
    public abstract void prepareShow();
    /**
     * @Author: Wang Wenzheng
     * @Description: 演出进行
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:43 2020/11/28
     * @Modified By:
    **/
    public abstract void makeShow();

    /**
     * @Author: Wang Wenzheng
     * @Description: 演出结束后的谢幕
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:44 2020/11/28
     * @Modified By:
    **/
    public void curtainCall(){
        PrintTool.print("thanks for your attention,and we make a curtain call now");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 进行演出，每个节目依次进行准备，表演和谢幕过程。
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 0:49 2020/11/28
     * @Modified By:
    **/
    public void playShow(){
        prepareShow();
        makeShow();
        curtainCall();
    }
}
