package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: Forest theme
 * @Date: Created in 19:56 2020/11/5
 * @Modified By:
 **/
public class Forest extends AbstractElement {
    public Forest(AbstractRecreationalActivity recreationalactivity) {
        super(recreationalactivity);
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 返回被装饰的活动时间即可
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume:获取时间
     *
     * @Date: 14:30 2020/11/19
     * @Modified By:
    **/
    @Override
    public int getTime() {
        return recreationalactivity.getTime();
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 返回被装饰的活动参与人数即可
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 活动参与人数
     *
     * @Date: 14:31 2020/11/19
     * @Modified By:
    **/
    @Override
    public int getCrowdSize() {
        return recreationalactivity.getCrowdSize();
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 返回被装饰的活动介绍信息即可
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 活动介绍信息
     *
     * @Date: 14:31 2020/11/19
     * @Modified By:
    **/
    @Override
    public String getInfo() {
        return recreationalactivity.getInfo();
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取被装饰的活动的元素信息，同时向其中加入forest元素，起到装饰的效果
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 装饰元素信息
     *
     * @Date: 14:32 2020/11/19
     * @Modified By:
    **/
    @Override
    public String getElements() {
        return recreationalactivity.getElements() + " forest";
    }
}
