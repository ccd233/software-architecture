package bridgepattern;
/**
 * @Author Song Jungang
 * @Description:具体实现化角色Orangejuice
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class Orangejuice implements Drink{

    @Override
    /**
     * @Author: Song Jungang
     * @Description: 具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: String
     * @resume:饮料的名字
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public String getdrink() {
        return "orangejuice";
    }
}
