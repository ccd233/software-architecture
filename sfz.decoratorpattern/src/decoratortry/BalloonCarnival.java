package decoratortry;

/**
 * @Author Shen Fangzhi
 * @Description: A concrete Recreational activity.
 * @Date: Created in 19:42 2020/11/5
 * @Modified By:
 **/
public class BalloonCarnival extends AbstractRecreationalActivity {

    String elements=new String();
    private int time;
    private int crowdSize;
    private String info;

    public BalloonCarnival(int time, int crowdSize, String info) {
        this.time = time;
        this.crowdSize = crowdSize;
        this.info = info;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取时间具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 活动时间
     *
     * @Date: 14:25 2020/11/19
     * @Modified By:
    **/
    @Override
    public int getTime() {
        return time;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取活动参与人数具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: int
     * @resume: 活动参与人数
     *
     * @Date: 14:26 2020/11/19
     * @Modified By:
    **/
    @Override
    public int getCrowdSize() {
        return crowdSize;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取活动介绍信息具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume: 活动介绍信息
     *
     * @Date: 14:26 2020/11/19
     * @Modified By:
    **/
    @Override
    public String getInfo() {
        return info;
    }

    /**
     * @Author: Shen Fangzhi
     * @Description: 获取活动具有的装饰元素具体实现
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: java.lang.String
     * @resume:活动具有的装饰元素
     *
     * @Date: 14:26 2020/11/19
     * @Modified By:
    **/
    @Override
    public String getElements() {
        return elements;
    }
}
