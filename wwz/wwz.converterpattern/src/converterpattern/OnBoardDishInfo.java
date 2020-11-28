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

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取菜品名
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 菜品名
     *
     * @Date: 18:32 2020/11/28
     * @Modified By:
    **/
    public String getDishName() {
        return dishName;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取菜品价格
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 菜品价格（以字符串形式保存，用于在菜单板上展示）
     *
     * @Date: 18:31 2020/11/28
     * @Modified By:
    **/
    public String getDishPrize() {
        return dishPrize;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 获取菜品介绍
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 菜品介绍
     *
     * @Date: 18:31 2020/11/28
     * @Modified By:
    **/
    public String getDishIntro() {
        return dishIntro;
    }

    /**
     * @Author: Wang Wenzheng
     * @Description: 重写toString方法，按照格式打印菜单
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 返回被打印时输出的字符串
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
