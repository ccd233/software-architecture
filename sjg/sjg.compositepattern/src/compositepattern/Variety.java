package compositepattern;
import java.util.ArrayList;
import java.util.List;
import tools.PrintTool;

/**
 * @Author Song Jungang
 * @Description:Composite
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Variety extends Souvenir{
    private String variety_name = " ";
    /**
     * @Author: Song Jungang
     * @Description: 构造函数
     *
     * @Param Type
     * param: variety_name
     * resume:纪念品种类的名字
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public Variety(String variety_name) {
        this.variety_name = variety_name;
    }
    private List<Souvenir> souvenirs = new ArrayList<Souvenir>();
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
    public void display(String blank){
        PrintTool.print(blank+ "*" + variety_name);
        if(souvenirs != null){
            blank+="   ";
            for(Souvenir i:souvenirs){
                i.display(blank);
            }
        }
    }
    /**
     * @Author: Song Jungang
     * @Description: 添加纪念品具体实现
     *
     * @Param Type
     * param: souvenir
     * resume:纪念品种类
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    @Override
    public void addSouvenir(Souvenir souvenir){
        souvenirs.add(souvenir);
    }
}
