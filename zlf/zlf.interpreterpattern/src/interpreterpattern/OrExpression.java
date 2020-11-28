package interpreterpattern;


public class OrExpression implements Expression{
    private Expression exp1;
    private Expression exp2;
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: e1
     * resume: 
    param: e2
     * resume: 
     *
     * @Return Value
     * @return: 
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public OrExpression(Expression e1,Expression e2){
        exp1=e1;
        exp2=e2;
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
        return exp1.interpret(info)|| exp2.interpret(info);
    }
}
