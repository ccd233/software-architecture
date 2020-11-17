package decoratortry;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description: This class can represent any Recreational activity.You can realize it in its subclass.
 * @Date: Created in 19:29 2020/11/5
 * @Modified By:
 **/
public abstract class RecreationalActivity {

    public abstract int getTime();

    public abstract int getCrowdSize();

    public abstract String getInfo();

    public abstract String getElements();

    public void show() {
        System.out.println("The time of this activity is " + getTime());

        System.out.println("The approximate crowd size of this activity is " + getCrowdSize());

        System.out.println("The basic info of this activity is " + getInfo());

        System.out.println("This activity has these elements:" + getElements());

        System.out.println();
    }
}
