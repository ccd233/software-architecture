package multitonpattern;

import java.util.ArrayList;
import java.util.List;
import tools.PrintTool;

/**
 * @Author Song Jungang
 * @Description:the multipleton class
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Parkingspot {
    private static Parkingspot spot1 = new Parkingspot();
    private static Parkingspot spot2 = new Parkingspot();
    private static Parkingspot spot3 = new Parkingspot();
    private static List<Parkingspot> parkinglot = new ArrayList<Parkingspot>();
    private static List<String> parkingpotname = new ArrayList<String>();
    private static int max = 3;
    private static int count = 0;
    static{
        parkinglot.add(spot1);
        parkinglot.add(spot2);
        parkinglot.add(spot3);
        }
    static{
        parkingpotname.add("spot1");
        parkingpotname.add("spot2");
        parkingpotname.add("spot3");
    }
    /**
     * @Author: Song Jungang
     * @Description: 避免外部创建实例
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    private Parkingspot(){}
    /**
     * @Author: Song Jungang
     * @Description: 获取多例类中的实例
     *
     * @Param Type
     * param: index
     * resume:停车位位置
     *
     * @Return Value
     * @return: Parkingspot
     * @resume:停车位实例
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public static Parkingspot getInstance(int index){
        count = index;
    return parkinglot.get(index);
}
    public static void display(){
        PrintTool.print(parkingpotname.get(count));
    }
}
