package bridgepattern;
/**
 * @Author Song Jungang
 * @Description:抽象化角色
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public abstract class Size {
    protected Drink drink;
    /**
     * @Author: Song Jungang
     * @Description: 引用Drink接口
     *
     * @Param Type
     * param: drink
     * resume:饮料种类
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public void setDrink(Drink drink){
        this.drink = drink;
    }
    /**
     * @Author: Song Jungang
     * @Description: 点单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public abstract void ordering();
}
