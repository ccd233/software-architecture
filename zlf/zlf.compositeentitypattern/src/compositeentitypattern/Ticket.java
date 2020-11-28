package compositeentitypattern;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 17:27 2020/11/24
 * @Modified By:
 **/
public class Ticket {
    private int TicketPrice;
    private EntertainmentFacilities SpecificEntertainmentFacilities;
    private String OwnerName;

    Ticket(){

    }

    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _TicketPrice
     * resume: 
    param: _SpecificEntertainmentFacilities
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/24
     * @Modified By: 
    **/
    
    public Ticket(int _TicketPrice,EntertainmentFacilities _SpecificEntertainmentFacilities){
        TicketPrice=_TicketPrice;
        SpecificEntertainmentFacilities=_SpecificEntertainmentFacilities;
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: ownerName
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/24
     * @Modified By: 
    **/

    //owner Setter
    void SetOwnerName(String ownerName){
        OwnerName=ownerName;
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
     * @Date:  2020/11/24
     * @Modified By: 
    **/

    //Ticket Information Serialization
    String TicketInf(){
        String ticketInf="Owner Name:"+OwnerName+",Facility:"+SpecificEntertainmentFacilities.FacilityName()+",Price:"+Integer.toString(TicketPrice);
        return ticketInf;
    }
}
