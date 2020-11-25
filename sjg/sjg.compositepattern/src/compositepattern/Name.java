package compositepattern;
import tools.PrintTool;
/**
 * @Author Song Jungang
 * @Description:leaf
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/

public class Name extends Souvenir{
    private String name = " ";
    /**
     * @Author: Song Jungang
     * @Description: 构造函数
     *
     * @Param Type
     * param: name
     * resume:纪念品名字，相当于leaf
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public Name(String name) {
        this.name = name;
    }
    /**
     * @Author: Song Jungang
     * @Description: 打印出纪念品的层次结构
     *
     * @Param Type
     * param: blank
     * resume:多个空格，用来分级
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/

    @Override
    public void display(String blank) {
        PrintTool.print(blank+ "#" + name);
    }
    /**
     * @Author: Song Jungang
     * @Description: 添加纪念品
     *
     * @Param Type
     * param: souvenir
     * resume:纪念品名字
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    @Override
    public void addSouvenir(Souvenir souvenir) {

    }
}
