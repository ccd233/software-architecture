package adapterpattern;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description:
 * @Date: Created in 14:06 2020/11/13
 * @Modified By:
 **/
public class Adapter extends RegularMember implements Target{
    public UUID id;
    public String name;
    public Adapter(RegularMember target) {
        super(target);
        if (target!=null){
            this.id = target.id;
            this.name = target.name;
        }
    }
    /**
     * @Author: Nie Yixin
     * @Description: By using adapter, the regular member can queue in fast channel
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    public void quickQueue(){
        System.out.println("queueing in fast channel..");
    }
}
