package compositeentitypattern;

import java.util.List;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:53 2020/11/23
 * @Modified By:
 **/
public class CompositeEntity {
    Tourist Father=null;
    Tourist Mother=null;
    List<Tourist> Child=null;
    String GroupName="null";

    /***
     * @Author: Zhou Lifan
     * @Description: Constructor
     *
     * @Param Type
     * param: _Father
     * resume:
    param: _Mother
     * resume:
    param: _Child
     * resume:
    param: _GroupName
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date:  2020/11/24
     * @Modified By:
    **/

    public CompositeEntity(Tourist _Father,Tourist _Mother,List<Tourist> _Child,String _GroupName){
        Father=_Father;
        Mother=_Mother;
        Child=_Child;
        GroupName=_GroupName;
    }

    /**
     * @Author: Zhou Lifan
     * @Description:
     *
     * @Param Type
     * param:
     * resume:
     *
     * @Return Value
     * @return: compositeentitypattern.GroupTicket
     * @resume:
     *
     * @Date:  2020/11/24
     * @Modified By:
    **/

    //Composite Entity Scene : GroupTicket
    //Underwater World Carnival welcomes family tourists
    //:) family enjoys discount
    public GroupTicket BuyGroupTicket(){
        List<Tourist> GroupMember=Child;
        GroupMember.add(Father);
        GroupMember.add(Mother);
        GroupTicket groupTicket=new GroupTicket(GroupName,GroupMember);
        for(int i=0;i<Child.size();i++){
            Child.get(i).SetTicket(groupTicket);
        }
        Father.SetTicket(groupTicket);
        Mother.SetTicket(groupTicket);
        return groupTicket;
    }
}
