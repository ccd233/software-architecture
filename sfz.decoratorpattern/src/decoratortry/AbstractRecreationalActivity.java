package decoratortry;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author Shen Fangzhi
 * @Description: This class can represent any Recreational activity.You can realize it in its subclass.
 * @Date: Created in 19:29 2020/11/5
 * @Modified By:
 **/
public abstract class AbstractRecreationalActivity {

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取时间的抽象类
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: int
     * @resume: 表示该活动举办时间
     * @Date: 14:20 2020/11/19
     * @Modified By:
     **/
    public abstract int getTime();

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取活动参与人数的抽象类
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: int
     * @resume: 表示该活动的大概允许参与人数
     * @Date: 14:20 2020/11/19
     * @Modified By:
     **/
    public abstract int getCrowdSize();

    /**
     * @Author: Shen Fangzhi
     * @Description:获取该活动的介绍信息的抽象类
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: java.lang.String
     * @resume:该活动的具体信息
     * @Date: 14:22 2020/11/19
     * @Modified By:
     **/
    public abstract String getInfo();

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取该活动具有的elements的抽象类
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: java.lang.String
     * @resume: 表示活动具有的elements
     * @Date: 14:23 2020/11/19
     * @Modified By:
     **/
    public abstract String getElements();

    /**
     * @Author: Shen Fangzhi
     * @Description: 展示该活动的所有相关信息，包括其具有的元素
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 14:24 2020/11/19
     * @Modified By:
     **/
    public void show() {
        PrintTool.print("The time of this activity is " + getTime() + '\n' +

                "The approximate crowd size of this activity is " + getCrowdSize() + '\n' +

                "The basic info of this activity is " + getInfo() + '\n' +

                "This activity has these elements:" + getElements() + '\n');


    }
}
