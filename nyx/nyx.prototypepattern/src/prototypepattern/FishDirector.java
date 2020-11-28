package prototypepattern;

import tools.PrintTool;

/**
 * @Author Nie Yixin
 * @Description: A director to help create and clone fish
 * @Date: Created in 10:30 2020/11/13
 * @Modified By:
 **/
public class FishDirector {

    /***
     * @Author: Nie Yixin
     * @Description: 创建一个鲨鱼
     *
     * @Param Type
     * String,String,int,int
     *
     * @Return Value
     * @return: prototypepattern.Shark object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Shark createShark(String color,String type,int weight,int year) {
        Shark shark = new Shark();
        shark.setColor(color);
        shark.setType(type);
        shark.setWeight(weight);
        shark.setYear(year);

        PrintTool.print("A shark has been created");
        return shark;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 克隆一个鲨鱼
     *
     * @Param Type
     * Shark object
     *
     * @Return Value
     * @return: prototypepattern.Shark object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Shark cloneShark(Shark shark) {
        Shark cloneShark = (Shark) shark.clone();
        PrintTool.print("A prototypepattern.Shark has been cloned");
        return cloneShark;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建一条鲸鱼
     *
     * @Param Type
     * String,String,int,int
     *
     * @Return Value
     * @return: Whale object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Whale createWhale(String color,String type,int weight,int year) {
        Whale whale = new Whale();
        whale.setColor(color);
        whale.setType(type);
        whale.setWeight(weight);
        whale.setYear(year);
        PrintTool.print("A whale has been created");
        return whale;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 克隆一条鲸鱼
     *
     * @Param Type
     * Whale object
     *
     * @Return Value
     * @return: Whale object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Whale cloneWhale(Whale whale) {
        Whale cloneWhale = (Whale) whale.clone();
        PrintTool.print("A prototypepattern.Whale has been cloned");
        return cloneWhale;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 创建一只海龟
     *
     * @Param Type
     * String,String,int,int
     *
     * @Return Value
     * @return: Turtle object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Turtle createTurtle(String color,String type,int weight,int year) {
        Turtle turtle = new Turtle();
        turtle.setColor(color);
        turtle.setType(type);
        turtle.setWeight(weight);
        turtle.setYear(year);
        PrintTool.print("A turtle has been created");
        return turtle;
    }
    /***
     * @Author: Nie Yixin
     * @Description: 克隆一只海龟
     *
     * @Param Type
     * Turtle object
     *
     * @Return Value
     * @return: Turtle object
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    public Turtle cloneTurtle(Turtle turtle) {
        Turtle cloneTurtle = (Turtle) turtle.clone();
        PrintTool.print("A turtle has been cloned");
        return cloneTurtle;
    }

}
