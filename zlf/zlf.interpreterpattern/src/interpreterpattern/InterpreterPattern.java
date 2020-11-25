package interpreterpattern;

import java.util.Scanner;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 19:38 2020/11/23
 * @Modified By:
 **/
public class InterpreterPattern {
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

    public static void work(){
        String Name = null;
        int Age=-1;
        String Occupation=null;
        while(Age<=0||Name==null||Occupation==null){
            Scanner input = new Scanner(System.in);
            System.out.println("Tourist Name:");
            Name = input.nextLine();
            System.out.println("Tourist Age:");
            Age=Integer.parseInt(input.nextLine());
            System.out.println("Tourist Occupation:");
            Occupation=input.nextLine();
            if(Age<=0||Name==null||Occupation==null){
                System.out.println("Invalid Input.Please check again.\n");
            }
        }
        Tourist Visitor=new Tourist(Name,Age,Occupation);
        boolean IsDiscount = checkDiscount(Visitor);
        if(IsDiscount) System.out.println(Visitor.GetName()+" enjoys discount.\n");
        else System.out.println(Visitor.GetName()+" does not enjoy discount.\n");
    }
}
