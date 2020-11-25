package serventpattern;

import tools.PrintTool;

/**
 * @Author Shen Fangzhi
 * @Description: This is used to make salmon sushi.
 * @Date: Created in 17:10 2020/11/25
 * @Modified By:
 **/
public class SalmonSushi implements Sushi {
    /**
     * @Author: Shen Fangzhi
     * @Description: 代表做三文鱼寿司的服务，需要3秒完成一次
     * @Param Type
     * param:
     * resume:
     * @Return Value
     * @return: void
     * @resume:
     * @Date: 17:18 2020/11/25
     * @Modified By:
     **/
    @Override
    public void makeSushi() {
        PrintTool.print("Making salmon sushi...Take 3 seconds");
        int times = 3;
        for (int i = 0; i < times; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("..");
        }
        PrintTool.print("Salmon sushi finished.Enjoy it!");
    }
}
