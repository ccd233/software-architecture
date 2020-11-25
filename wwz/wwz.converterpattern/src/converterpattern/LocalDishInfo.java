package converterpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 本地保存的每一个菜品信息
 * @Date: Created in 19:27 2020/11/25
 * @Modified By:
 **/
public class LocalDishInfo {
    private final String dishName;
    private final float dishPrize;
    private final String dishIntro;

    /**
     * @Author: Wang Wenzheng
     * @Description: 本地菜品信息的构造函数
     * @Param Type
     * param: dishName
     * resume:菜品名称
     * param: dishPrize
     * resume:菜品价格
     * param: dishIntro
     * resume:菜品介绍
     * @Return Value
     * @return:
     * @resume:
     * @Date: 19:31 2020/11/25
     * @Modified By:
     **/
    public LocalDishInfo(String dishName, float dishPrize, String dishIntro) {
        this.dishName = dishName;
        this.dishPrize = dishPrize;
        this.dishIntro = dishIntro;
    }

    public String getDishName() {
        return dishName;
    }

    public float getDishPrize() {
        return dishPrize;
    }

    public String getDishIntro() {
        return dishIntro;
    }

    @Override
    public String toString() {
        return "LocalDishInfo{" +
                "dishName='" + dishName + '\'' +
                ", dishPrize=" + dishPrize +
                ", dishIntro='" + dishIntro + '\'' +
                '}';
    }
}
