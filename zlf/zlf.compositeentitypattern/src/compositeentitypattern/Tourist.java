package compositeentitypattern;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 17:26 2020/11/24
 * @Modified By:
 **/
public class Tourist {
    private String Name;
    private int Age;
    private boolean Sex;
    private String Occupation;
    private Ticket PersonalTicket;
    public Tourist(){
        Name="null";
        Age=-1;
        Sex=true;
        Occupation="null";
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
     *
     * @Return Value
     * @return:
     * @resume:
     *
     * @Date:  2020/11/24
     * @Modified By:
    **/

    public Tourist(String _name,int _age,boolean _sex,String _occupation){
        Name=_name;
        Age=_age;
        Sex=_sex;
        Occupation=_occupation;
    }

    public Tourist(String _name){
        Name=_name;
        Age=-1;
        Sex=true;
        Occupation="null";
    }

    /***
     * @Author: Zhou Lifan
     * @Description:
     *
     * @Param Type
     * param: ticket
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume:
     *
     * @Date:  2020/11/24
     * @Modified By:
    **/

    //Ticket Setter
    void SetTicket(Ticket ticket){
        if(ticket==null){
            System.out.println("Input ticket is null,please check the input and try again.\n");
            return;
        }
        PersonalTicket=ticket;
    }

    //Name Getter
    public String GetName(){
        return Name;
    }
}
