package templatemethodpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 一个歌唱节目，是Show类的子类
 * @Date: Created in 0:54 2020/11/28
 * @Modified By:
 **/

import tools.PrintTool;

public class SingASong extends Show{

    /**
     * @Author: Wang Wenzheng
     * @Description: 歌唱节目的准备,重写父类函数
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
        PrintTool.print("We will sing a song");
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 歌唱节目的表演过程，继承父类函数
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
        PrintTool.print("the song is showing!");
    }
}
