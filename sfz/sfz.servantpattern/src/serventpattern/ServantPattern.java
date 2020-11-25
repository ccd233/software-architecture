package serventpattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is used to test the servant pattern as customers.
 * @Date: Created in 17:33 2020/11/25
 * @Modified By:
 **/
public class ServantPattern {
    /**
     * @Author: Shen Fangzhi
     * @Description: 雇工模式封装为静态方法
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 17:36 2020/11/25
     * @Modified By:
     **/
    public static void servant() {
        PrintTool.print("Servant Pattern" + "\n" +
                "Scenario Introduction:This is used for the customers who intend to buy sushi in a ocean theme restaurant." + "\n" +
                "Customers can submit specified kind of sushi order." + "\n" +
                "The cook will use different orders as a parameter." + "\n" +
                "Then the cook will use different service to complete sushi" + "\n");

        Cook chiefCook = new Cook();

        //order1:
        chiefCook.cooking(new SalmonSushi());
        //order2
        chiefCook.cooking(new TunaSushi());
    }

}
