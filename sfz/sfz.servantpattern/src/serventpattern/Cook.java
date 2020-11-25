package serventpattern;

import tools.PrintTool;
/**
 * @Author Shen Fangzhi
 * @Description: This represents the cooks.They make particular kind of sushi according to the oders.
 * @Date: Created in 17:20 2020/11/25
 * @Modified By:
 **/
public class Cook {

    public Cook() {
        PrintTool.print("The chief is working now.");
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: cook厨师就是这个雇工模式里的“雇工”；作为厨师，他将制作不同寿司的服务集于一身
     * @Param Type
     * param: sushiOrder
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 17:28 2020/11/25
     * @Modified By:
     **/
    public void cooking(Sushi sushiOrder) {
        sushiOrder.makeSushi();
    }
}
