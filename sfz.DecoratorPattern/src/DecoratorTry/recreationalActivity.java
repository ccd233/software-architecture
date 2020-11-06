package DecoratorTry;

/**
 * @Author Shen Fangzhi
 * @Description: This class can represent any Recreational activity.You can realize it in its subclass.
 * @Date: Created in 19:29 2020/11/5
 * @Modified By:
 **/
public abstract class recreationalActivity {

    public abstract int getTime();

    public abstract int getCrowdSize();

    public abstract String getInfo();

    public void show() {
        System.out.println("The time of this activity is " + getTime());
        System.out.println("The approximate crowd size of this activity is " + getCrowdSize());
        System.out.println("The basic info of this activity is " + getInfo());
    }
}
