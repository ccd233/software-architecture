package adapterpattern;

import tools.PrintTool;

import java.util.UUID;

/**
 * @Author Nie Yixin
 * @Description: 适配器
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
     * @Description: 使用适配器，普通用户使用快速通道进行排队
     *
     * @Param Type
     *
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:
     * @Modified By:
    **/
    @Override
    public void quickQueue(){
        PrintTool.print("queueing in fast channel..");
    }
}
