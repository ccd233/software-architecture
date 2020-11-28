package compositeentitypattern;

import java.util.List;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 17:28 2020/11/24
 * @Modified By:
 **/
public class GroupTicket extends Ticket{
    private String GroupName=null;
    private List<Tourist> GroupMember=null;

    /***
     * @Author: Zhou Lifan
     * @Description:
     *
     * @Param Type
     * param: _GroupName
     * resume:
    param: _GroupMember
     * resume:
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date:  2020/11/24
     * @Modified By:
    **/

    GroupTicket(String _GroupName,List<Tourist> _GroupMember){
        GroupName=_GroupName;
        GroupMember=_GroupMember;
    }

    //Group Ticket Information
    //return Ticket information and Family Information
    public String GroupTicketInf(){
        String TicketInf= GroupName;
        TicketInf = TicketInf + "\nMemeber:";
        for(int i=0;i<GroupMember.size();i++) {
            TicketInf = TicketInf + GroupMember.get(i).GetName() + ";";
        }
        return TicketInf;
    }
}
