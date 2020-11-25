package converterpattern;

/**
 * @Author Wang Wenzheng
 * @Description: 电子菜单板上的菜品信息
 * @Date: Created in 19:33 2020/11/25
 * @Modified By:
 **/
public class OnBoardDishInfo {
    private final String dishName;
    private final String dishPrize;
    private final String dishIntro;

    /**
     * @Author: Wang Wenzheng
     * @Description: 电子菜单板菜品信息的构造函数
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
    public OnBoardDishInfo(String dishName, String dishPrize, String dishIntro) {
        this.dishName = dishName;
        this.dishPrize = dishPrize;
        this.dishIntro = dishIntro;
    }

    public String getDishName() {
        return dishName;
    }

    public String getDishPrize() {
        return dishPrize;
    }

    public String getDishIntro() {
        return dishIntro;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 按照格式打印菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume:
     *
     * @Date: 19:46 2020/11/25
     * @Modified By:
    **/
    @Override
    public String toString() {
        StringBuilder str=new StringBuilder("");
        int length=30;
        int pointNum=length-this.dishName.length()-this.dishPrize.length();
        str.append(this.dishName);

        for(int i=0;i<pointNum;i++){
            str.append(".");
        }
        str.append(this.dishPrize);
        str.append("\n\t").append(this.dishIntro);
        return str.toString();
    }
}
