package fundamentalpattern;
import javax.swing.*;
import java.util.List;

public class FamilyTourist {
    private Tourist Father;
    private Tourist Mother;
    private List<Tourist> Children;
    private int MemberNumber;
    private String FamilyName;
    private boolean HaveTicket;
    private Ticket GroupTicket;
    FamilyTourist() {

    }
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _Father
     * resume: 
    param: _Mother
     * resume: 
    param: _Children
     * resume: 
    param: _FamilyName
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    FamilyTourist(Tourist _Father,Tourist _Mother,List<Tourist> _Children,String _FamilyName){
        Father=_Father;
        Mother=_Mother;
        Children=_Children;
        FamilyName=_FamilyName;
        MemberNumber=2+Children.size();
        HaveTicket=false;
        GroupTicket=null;
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: totalPrice
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public void payForTicket(int totalPrice){
        System.out.println("Family Tourist Pay "+Integer.toString(totalPrice));
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: 
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public void buyTicket(){
        if(HaveTicket==true){
            System.out.println("You Already Have A Ticket");
        } else {
            ServerCenter ServerCenterCopy=ServerCenter.getInstance();
            TicketAgent ticketAgent=ServerCenterCopy.assignTicketAgent();
            if(ticketAgent==null){
                System.out.println("No Agent Available");
                return;
            }
            //Calculate the price
            ticketAgent.chargeTicket(MemberNumber*TicketSystem.ticketPrice(true));
            payForTicket(MemberNumber*TicketSystem.ticketPrice(true));
            GroupTicket=ticketAgent.getTicketFromCenter(FamilyName,true);
            //activate personal ticket
            Father.setTicket(GroupTicket);
            Mother.setTicket(GroupTicket);
            for(Tourist child:Children){
                child.setTicket(GroupTicket);
            }
            HaveTicket=true;
        }
    }
}
