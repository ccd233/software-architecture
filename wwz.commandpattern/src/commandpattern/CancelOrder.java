package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 订单取消命令类
 * @Date: Created in 21:42 2020/11/5
 * @Modified By:
 **/
public class CancelOrder implements iOrder {
    private Dish dish;
    public CancelOrder(Dish dish){
        this.dish=dish;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 执行后回调用命令中所包含的食品的取消制作方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:23 2020/11/17
     * @Modified By:
    **/
    @Override
    public void execute() {
        dish.cancelDish();
    }
}
