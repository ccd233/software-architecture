package fundamentalpattern;

public class Tourist {
    private String Name;
    private int Age;
    private boolean Sex;
    private String Occupation;
    private Ticket PersonalTicket;
    private boolean HaveTicket;
    public Tourist(){
        Name="null";
        Age=-1;
        Sex=true;
        Occupation="null";
        HaveTicket=false;
        PersonalTicket=null;
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _name
     * resume: 
    param: _age
     * resume: 
    param: _sex
     * resume: 
    param: _occupation
     * resume: 
    param: _personal_ticket
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public Tourist(String _name,int _age,boolean _sex,String _occupation,Ticket _personal_ticket){
        Name=_name;
        Age=_age;
        Sex=_sex;
        Occupation=_occupation;
        PersonalTicket=_personal_ticket;
        //Judge Ticket
        if(PersonalTicket!=null){
            HaveTicket=true;
        }else{
            HaveTicket=false;
        }
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
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public String getInformation(){
        return Integer.toString(Age)+","+Occupation;
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
    
    public void payForTicket(int Price){
        System.out.println("Tourist Pay "+Integer.toString(Price));
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _ticket
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public void setTicket(Ticket _ticket){
        PersonalTicket=_ticket;
        HaveTicket=true;
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
            boolean isDiscount=TicketSystem.checkDiscount(this);
            ticketAgent.chargeTicket(TicketSystem.ticketPrice(isDiscount));
            payForTicket(TicketSystem.ticketPrice(isDiscount));
            PersonalTicket=ticketAgent.getTicketFromCenter(Name,false);
            HaveTicket=true;
        }
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
    
    public void showTicket(){

    }
}
