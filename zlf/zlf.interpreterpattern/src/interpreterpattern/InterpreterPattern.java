package interpreterpattern;

import tools.PrintTool;

import java.util.Scanner;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 19:38 2020/11/23
 * @Modified By:
 **/
public class InterpreterPattern {
    //expression to evaluate discount
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

    //check if a tourist enjoys discount by DiscountExpression()
    public static boolean checkDiscount(Tourist tourist){
        Expression ck=DiscountExpression();
        return ck.interpret(tourist.getInformation());
    }

    //output interface
    public static void work(){
        String Name = null;
        int Age=-1;
        String Occupation=null;
        while(Age<=0||Name==null||Occupation==null){
            Scanner input = new Scanner(System.in);
            PrintTool.print("Tourist Name:");
            Name = input.nextLine();
            if(Name.isEmpty()){
                PrintTool.print("Invalid input");
                continue;
            }
            PrintTool.print("Tourist Age:");
            String AgeInt=input.nextLine();
            try {
                Age = Integer.parseInt(AgeInt);
            } catch (NumberFormatException e) {
                PrintTool.print("Please Input Number");
                continue;
            }
            Age=Integer.parseInt(AgeInt);
            PrintTool.print("Tourist Occupation:");
            Occupation=input.nextLine();
            if(Occupation.isEmpty()){
                PrintTool.print("Invalid input");
                continue;
            }
        }
        Tourist Visitor=new Tourist(Name,Age,Occupation);
        boolean IsDiscount = checkDiscount(Visitor);
        if(IsDiscount) PrintTool.print(Visitor.GetName()+" enjoys discount.\n");
        else PrintTool.print(Visitor.GetName()+" does not enjoy discount.\n");
    }
}
