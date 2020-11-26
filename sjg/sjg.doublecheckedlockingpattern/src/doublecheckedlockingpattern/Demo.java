package doublecheckedlockingpattern;
/**
 * @Author Song Jungang
 * @Description:测试两实例是否相同
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Demo {
    public static void demo() throws Exception {
        Maps m1= Maps.getinstance();
        Maps m2= Maps.getinstance();
        PrintTool.print("map1"+m1+"\n"+"map2"+m2+"\n");
        PrintTool.print("Whether the two maps are the same："+(m1==m2));
    }
}
