package multitonpattern;

/**
 * @Author Song Jungang
 * @Description:display parking spot name
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class MultitonPattern {
    /**
     * @Author: Song Jungang
     * @Description: 打印出停车位名字
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public static void display() {
        Parkingspot a = Parkingspot.getInstance(0);
        a.display();
        Parkingspot b = Parkingspot.getInstance(1);
        b.display();
        Parkingspot c = Parkingspot.getInstance(2);
        c.display();
    }
}
