package daopattern;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:26 2020/11/23
 * @Modified By:
 **/
public class Tourist {
    private String Name;
    private int Age;
    private boolean Sex;
    private String Occupation;
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

    public Tourist(String _name,int _age,String _occupation){
        Name=_name;
        Age=_age;
        Occupation=_occupation;
    }

    //Name Getter
    public String GetName(){
        return Name;
    }
}
