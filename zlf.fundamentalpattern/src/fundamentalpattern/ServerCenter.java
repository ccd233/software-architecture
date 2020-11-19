package fundamentalpattern;
import java.util.Date;

//Singleton Pattern
public class ServerCenter<singleInstance> {
    private static ServerCenter singleInstance=new ServerCenter();
    private ServerCenter(){
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
     * @return: Foudamental.ServerCenter
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public static ServerCenter getInstance(){
        return singleInstance;
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
    
    public Ticket returnTicket(String visitorName,boolean isGroupTicket){
        Date date=new Date();
        Ticket ticket=new Ticket(visitorName,date.toString(),isGroupTicket);
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
     * @return: Foudamental.TicketAgent
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public TicketAgent assignTicketAgent(){
        AgentDao TKAgent=AgentDao.getInstance();
        for(TicketAgent agent : TKAgent.getAllAgents()){
            if(agent.isAvailable()) return agent;
        }
        return null;
    }
}
