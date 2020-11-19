package fundamentalpattern;

import interpreterpattern.*;
public class Ticket {
    private String VisitorName;
    private String VisitDate;
    private int Price;
    private boolean isGroupTicket;
    public Ticket(){

    }
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _VisitorName
     * resume: 
    param: _VisitDate
     * resume: 
    param: _isGroupTicket
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public Ticket(String _VisitorName,String _VisitDate,boolean _isGroupTicket) {
        VisitorName = _VisitorName;
        VisitDate = _VisitDate;
        isGroupTicket=_isGroupTicket;
    }
}
