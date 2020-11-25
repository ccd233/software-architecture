package flyweightpattern;
import java.util.HashMap;

/**
 * @Author Song Jungang
 * @Description:the factory create divingdress
 * @Date: Created in 18:55 2020/11/18
 * @Modified By:
 **/
public class DivingdressFactory {
    private HashMap pool = new HashMap();
    private static DivingdressFactory singleton = new DivingdressFactory();
    /**
     * @Author: Song Jungang
     * @Description: 只需一个factory实例
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
    private DivingdressFactory(){
        }
    /**
     * @Author: Song Jungang
     * @Description: 外界获取实例
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: DivingdressFactory
     * @resume:工厂实例
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public static DivingdressFactory getInstance(){
        return singleton;
    }
    /**
     * @Author: Song Jungang
     * @Description: 获取潜水服的实例
     *
     * @Param Type
     * param: sex_type
     * resume:性别与尺码
     *
     * @Return Value
     * @return: Divingdress
     * @resume:潜水服实例
     *
     * @Date: 14:04 2020/11/19
     * @Modified By:
     **/
    public Divingdress getDivingdress(String sex_type){
        Divingdress dg = (Divingdress)pool.get(sex_type);
        if(dg == null){
            dg = new Divingdress(sex_type);
            pool.put(sex_type,dg);
        }
        return dg;
    }
}
