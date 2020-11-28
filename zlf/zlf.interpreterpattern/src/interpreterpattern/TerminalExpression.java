package interpreterpattern;

import java.util.ArrayList;

public class TerminalExpression implements Expression{
    ArrayList<String> terminalSets =new ArrayList<String>();
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: _terminalSets
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public TerminalExpression(String[] _terminalSets){
        for(int i=0;i<_terminalSets.length;i++){
            terminalSets.add(_terminalSets[i]);
        }
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: info
     * resume: 
     *
     * @Return Value
     * @return: boolean
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/

    //interpret method
    public boolean interpret(String info){
        for(int i=0;i<terminalSets.size();i++) {
            if (info.contains(terminalSets.get(i))) {
                return true;
            }
        }
        return false;
    }
}
