package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description:To test decorator design model.
 * @Date: Created in 19:11 2020/11/5
 * @Modified By:
 **/
public class DecoratorPattern {
    public static void decorator() {
        System.out.println("Decorator Pattern" + "\n" +
                "Scenario Introduction:This is a balloon carnival." + "\n" +
                "The theme of this carnival can be changed or superposed." + "\n" +
                "With this decorator pattern,the user can create as many themes as he likes" + "\n" +
                "By using the different theme class,it's really convenient to alter or superposed the theme." + "\n");

        String info = "This is a great activity in which you could play with numerous balloons.Enjoy yourselves!";
        RecreationalActivity a1 = new BalloonCarnival(20, 100, info);
        RecreationalActivity a2 = new Cloud(a1);
        RecreationalActivity a3 = new Forest(a2);
        RecreationalActivity a4 = new Forest(a3);
        a1.show();
        a2.show();
        a3.show();
        a4.show();
    }
}
