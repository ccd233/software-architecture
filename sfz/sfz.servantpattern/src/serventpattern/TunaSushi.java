package serventpattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is used to make tuna sushi.
 * @Date: Created in 17:12 2020/11/25
 * @Modified By:
 **/
public class TunaSushi implements Sushi {
    /**
     * @Author: Shen Fangzhi
     * @Description:代表制作金枪鱼寿司的服务，完成一次需要5秒
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 17:19 2020/11/25
     * @Modified By:
     **/
    @Override
    public void makeSushi() {
        PrintTool.print("Making tuna sushi...Take 5 seconds");
        int times = 5;
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("..");
        }
        PrintTool.print("Tuna sushi finished.Enjoy it!");
    }
}
