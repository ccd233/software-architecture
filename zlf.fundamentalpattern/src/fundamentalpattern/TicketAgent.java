package fundamentalpattern;

public class TicketAgent {
    private String Name;
    private boolean IsAvailable;
    public TicketAgent(){

    }
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _Name
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public TicketAgent(String _Name){
        Name=_Name;
        IsAvailable=true;
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: Price
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public void chargeTicket(int Price){
        System.out.println("Agent charges "+Integer.toString(Price));
    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: visitorName
     * resume: 
    param: isGroupTicket
     * resume: 
     *
     * @Return Value
     * @return: Foudamental.Ticket
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    

    public Ticket getTicketFromCenter(String visitorName,boolean isGroupTicket){
        ServerCenter ServerCenterCopy=ServerCenter.getInstance();
        Ticket ticket=ServerCenterCopy.returnTicket(visitorName,isGroupTicket);
        return ticket;
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
     * @return: boolean
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public boolean isAvailable(){
        return IsAvailable;
    }
}
