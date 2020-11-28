package mediatorpattern;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 19:56 2020/11/23
 * @Modified By:
 **/
public class EntertainmentFacilities {
    private String Name;
    private int TicketPrice;

    public EntertainmentFacilities(){

    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _Name
     * resume: 
    param: _TicketPrice
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/
    
    public EntertainmentFacilities(String _Name,int _TicketPrice){
        Name=_Name;
        TicketPrice=_TicketPrice;
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
     * @return: Mediator.Ticket
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //return ticket by facility type
    public Ticket EntranceTicket(){
        Ticket TicketType=new Ticket(TicketPrice,this);
        return TicketType;
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
     * @return: java.lang.String
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //facility name getter
    public String FacilityName(){
        return Name;
    }

    //facility infomation serialization
    public String FacilityInformation(){
        return "Facility Name:"+Name+",Price:"+Integer.toString(TicketPrice);
    }
}
