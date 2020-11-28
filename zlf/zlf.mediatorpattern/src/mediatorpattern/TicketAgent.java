package mediatorpattern;


/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 19:54 2020/11/23
 * @Modified By:
 **/
public class TicketAgent{
    Tourist Buyer;
    EntertainmentFacilities SpecificEntertainmentFacilities;
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _Buyer
     * resume: 
    param: _SpecificEntertainmentFacilities
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/
    
    TicketAgent(Tourist _Buyer,EntertainmentFacilities _SpecificEntertainmentFacilities){
        Buyer=_Buyer;
        SpecificEntertainmentFacilities=_SpecificEntertainmentFacilities;
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
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //get ticket by facility name and tourist information
    public Ticket GetTicket() {
        Ticket ticket=SpecificEntertainmentFacilities.EntranceTicket();
        ticket.SetOwnerName(Buyer.GetName());
        return ticket;
    }
}
