package mediatorpattern;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:06 2020/11/23
 * @Modified By:
 **/
public class Tourist {
    private String Name;
    private int Age;
    private boolean Sex;
    private String Occupation;
    private Ticket PersonalTicket=null;
    public Tourist() {
        Name = "null";
        Age = -1;
        Sex = true;
        Occupation = "null";
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
     * @Date:  2020/11/23
     * @Modified By: 
    **/
    
    public Tourist(String _name, int _age, String _occupation){
        Name=_name;
        Age=_age;
        Occupation=_occupation;
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

    //Name Getter
    public String GetName(){
        return Name;
    }
}
