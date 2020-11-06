package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description:To test decorator design model.
 * @Date: Created in 19:11 2020/11/5
 * @Modified By:
 **/
public class Main {
    public static void main(String[] args) {
        String info = "This is a great activity in which you could play with numerous balloons.Enjoy yourselves!";
        recreationalActivity a1 = new balloonCarnival(20, 100, info);
        recreationalActivity a2 = new cloud(a1);
        recreationalActivity a3 = new forest(a2);
        a1.show();
        a2.show();
        a3.show();
    }
}
