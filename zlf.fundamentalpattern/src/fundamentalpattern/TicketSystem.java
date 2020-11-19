package fundamentalpattern;

import interpreterpattern.*;

public class TicketSystem {
    TicketSystem(){

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
     * @return: Interpreter.Expression
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public static Expression DiscountExpression(){
        String[] DiscountSet1={"Student","Teacher","Soldier"};
        TerminalExpression DiscountExp1= new TerminalExpression(DiscountSet1);
        String[] DiscountSet2=new String[61];
        for(int i=70;i<=130;i++){
            DiscountSet2[i-70]=Integer.toString(i);
        }
        TerminalExpression DiscountExp2= new TerminalExpression(DiscountSet2);
        OrExpression DiscountExp=new OrExpression(DiscountExp1,DiscountExp2);
        return DiscountExp;
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: tourist
     * resume: 
     *
     * @Return Value
     * @return: boolean
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public static boolean checkDiscount(Tourist tourist){
        Expression ck=DiscountExpression();
        return ck.interpret(tourist.getInformation());
    }
    
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: isDiscount
     * resume: 
     *
     * @Return Value
     * @return: int
     * @resume: 
     *
     * @Date:  2020/11/17
     * @Modified By: 
    **/
    
    public static int ticketPrice(boolean isDiscount){
        if(isDiscount){
            return 35;
        } else{
            return 50;
        }
    }
}
