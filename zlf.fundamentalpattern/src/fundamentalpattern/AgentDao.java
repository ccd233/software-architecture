package fundamentalpattern;

import java.util.ArrayList;
import java.util.List;

public class AgentDao {
    private static AgentDao singleInstance = new AgentDao();
    private List<TicketAgent> TicketAgentList;

    private AgentDao() {
        TicketAgentList = new ArrayList<TicketAgent>();
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
     * @return: Foudamental.AgentDao
     * @resume:
     *
     * @Date:  2020/11/17
     * @Modified By:
    **/

    public static AgentDao getInstance() {
        return singleInstance;
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
     * @return: java.util.List<Foudamental.TicketAgent>
     * @resume:
     *
     * @Date:  2020/11/17
     * @Modified By:
    **/

    public List<TicketAgent> getAllAgents() {
        return TicketAgentList;
    }

    /***
     * @Author: Zhou Lifan
     * @Description:
     *
     * @Param Type
     * param: rollNo
     * resume:
     *
     * @Return Value
     * @return: Foudamental.TicketAgent
     * @resume:
     *
     * @Date:  2020/11/17
     * @Modified By:
    **/

    public TicketAgent getAgent(int rollNo) {
        return TicketAgentList.get(rollNo);
    }

    /***
     * @Author: Zhou Lifan
     * @Description:
     *
     * @Param Type
     * param: AgentName
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:  2020/11/17
     * @Modified By:
    **/

    public void addAgent(String AgentName) {
        TicketAgent NewAgent = new TicketAgent(AgentName);
        TicketAgentList.add(NewAgent);
    }
}
