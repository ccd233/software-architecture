package commandpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 订单制作命令类
 * @Date: Created in 21:39 2020/11/5
 * @Modified By:
 **/
public class CookOrder implements iOrder {
    private Dish dish;

    /**
     * @Author: Wang Wenzheng
     * @Description: 构造函数
     *
     * @Param Type
     * param: dish
     * resume: 菜品名
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date: 18:24 2020/11/28
     * @Modified By:
    **/
    public CookOrder(Dish dish){
        this.dish=dish;
    }
    /**
     * @Author: Wang Wenzheng
     * @Description: 制作该订单所包含的食品，调用该视频的制作方法
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 21:25 2020/11/17
     * @Modified By:
    **/
    @Override
    public void execute() {
        dish.cookDish();
    }
}
