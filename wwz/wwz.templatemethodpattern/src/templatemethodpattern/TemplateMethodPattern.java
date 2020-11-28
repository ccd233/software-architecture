package templatemethodpattern;

import tools.PrintTool;

/**
 * @Author Wang Wenzheng
 * @Description: 模板方法的封装接口类
 * @Date: Created in 0:58 2020/11/28
 * @Modified By:
 **/
public class TemplateMethodPattern {
    /**
     * @Author: Wang Wenzheng
     * @Description: 将模板方法封装到接口中，供Main调用
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 1:01 2020/11/28
     * @Modified By:
    **/
    public static void templateMethod(){
        PrintTool.print("here are some good shows in the carnival, and they are going to start!");

        PrintTool.print("comedy is going to show");
        Show comedy=new Comedy();
        comedy.playShow();

        PrintTool.print("dance is going to show");
        Show dance=new Dance();
        dance.playShow();

        PrintTool.print("song is going to show");
        Show song=new SingASong();
        song.playShow();

    }
}
