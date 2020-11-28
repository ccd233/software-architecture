package doublecheckedlockingpattern;

import tools.PrintTool;

/**
 * @Author Song Jungang
 * @Description:测试两实例是否相同
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class DoubleCheckedLockingPattern {
    /**
     * @Author: Song Jungang
     * @Description: 将模式封装为接口，供Main调用
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 18:19 2020/11/28
     * @Modified By:
    **/
    public static void doubleCheckedLocking() {
        Maps m1= Maps.getinstance();
        Maps m2= Maps.getinstance();
        PrintTool.print("map1"+m1+"\n"+"map2"+m2+"\n");
        PrintTool.print("Whether the two maps are the same："+(m1==m2));
    }
}
