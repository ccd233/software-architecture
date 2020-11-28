package flyweightpattern;
/**
 * @Author Song Jungang
 * @Description:display the type of divingdress
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class FlyweightPattern {
    /**
     * @Author: Song Jungang
     * @Description: 打印出所需潜水服型号，将模式封装为接口供Main调用
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
    public static void displaying() {
    DivingdressFactory factory = DivingdressFactory.getInstance();
    Divingdress a1 = factory.getDivingdress("man_M");
    Divingdress a2 = factory.getDivingdress("man_L");
    Divingdress a3 = factory.getDivingdress("man_4Xl");
    Divingdress a4 = factory.getDivingdress("man_M");
    Divingdress a5 = factory.getDivingdress("man_L");
    Divingdress a6 = factory.getDivingdress("woman_L");
    Divingdress a7 = factory.getDivingdress("woman_L");
    a1.display();
    a2.display();
    a3.display();
    a4.display();
    a5.display();
    a6.display();
    a7.display();
    }
}
