package fundamentalpattern;

import java.util.ArrayList;
import java.util.List;

public class FundamentalPattern {
    public static void main(String[] args) {
        AgentDao agentSet=AgentDao.getInstance();
        agentSet.addAgent("ccd1");
        agentSet.addAgent("ccd2");
        agentSet.addAgent("ccd3");
        Tourist a=new Tourist("zlf1",20,true,"Student",null);
        Tourist b=new Tourist("zlf2",20,true,"CS",null);
        Tourist c=new Tourist("zlf3",20,true,"CS1",null);
        Tourist d=new Tourist("zlf4",20,true,"CS2",null);
        Tourist e=new Tourist("zlf5",20,true,"CS3",null);
        List<Tourist> child=new ArrayList<Tourist>();
        child.add(c);
        child.add(d);
        child.add(e);
        FamilyTourist ft=new FamilyTourist(a,b,child,"family1");
        ft.buyTicket();
        a.buyTicket();
    }
}
