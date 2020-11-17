package DecoratorTry;

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
        recreationalActivity a1 = new balloonCarnival(20, 100, info);
        recreationalActivity a2 = new cloud(a1);
        recreationalActivity a3 = new forest(a2);
        a1.show();
        a2.show();
        a3.show();
    }
}
