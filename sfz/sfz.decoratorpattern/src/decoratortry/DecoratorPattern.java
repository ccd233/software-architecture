package decoratortry;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description:To test decorator design model.
 * @Date: Created in 19:11 2020/11/5
 * @Modified By:
 **/
public class DecoratorPattern {
    /**
     * @Author: Shen Fangzhi
     * @Description: 装饰器模式封装为静态方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:19 2020/11/19
     * @Modified By:
    **/
    public static void decorator() {
        PrintTool.print("Decorator Pattern" + "\n" +
                "Scenario Introduction:This is a balloon carnival." + "\n" +
                "The element of this carnival can be changed,superposed or add." + "\n" +
                "With this decorator pattern,the user can create as many elements as he likes" + "\n" +
                "By using the different element class,it's really convenient to alter,superposed or add the theme." + "\n");

        String info = "This is a great activity in which you could play with numerous balloons.Enjoy yourselves!";
        AbstractRecreationalActivity a1 = new BalloonCarnival(20, 100, info);
        AbstractRecreationalActivity a2 = new Cloud(a1);
        AbstractRecreationalActivity a3 = new Forest(a2);
        AbstractRecreationalActivity a4 = new Forest(a3);
        a1.show();
        a2.show();
        a3.show();
        a4.show();
    }
}
