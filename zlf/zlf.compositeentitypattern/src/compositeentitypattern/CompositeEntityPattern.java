package compositeentitypattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 17:47 2020/11/24
 * @Modified By:
 **/
public class CompositeEntityPattern {
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: args
     * resume:
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/24
     * @Modified By: 
    **/

    //Interface
    public static void work(){
        String FatherName = null;
        String MotherName = null;
        int ChildNum=0;
        List<String> ChildName = new ArrayList<String>();
        String GroupName=null;
        while(FatherName==null||MotherName==null||ChildName.size()==0){
            Scanner input = new Scanner(System.in);
            PrintTool.print("Father Name:");
            FatherName = input.nextLine();
            PrintTool.print("Mother Name:");
            MotherName = input.nextLine();
            PrintTool.print("Child Num:");
            String NumString = input.nextLine();
            try {
                ChildNum = Integer.parseInt(NumString);
            } catch (NumberFormatException e) {
                PrintTool.print("Please Input Number");
                continue;
            }
            for(int i=0;i<ChildNum;i++){
                PrintTool.print("Child Name:");
                String ChildNameTemp = input.nextLine();
                ChildName.add(ChildNameTemp);
            }
            PrintTool.print("Group Name:");
            GroupName = input.nextLine();
            if(FatherName==null||MotherName==null||ChildName.size()==0){
                PrintTool.print("Invalid Input.Please check again.\n");
            }
        }

        Tourist Father=new Tourist(FatherName);
        Tourist Mother=new Tourist(MotherName);
        List<Tourist> Child=new ArrayList<Tourist>();
        for(int i=0;i<ChildNum;i++){
            Tourist child=new Tourist(ChildName.get(i));
            Child.add(child);
        }

        if(Father==null||Mother==null||Child==null){
            PrintTool.print("The tourist group is not qualified.\nPlease check your input group.\n");
            return;
        }
        CompositeEntity FamilyTourist=new CompositeEntity(Father,Mother,Child, GroupName);
        GroupTicket GT=FamilyTourist.BuyGroupTicket();
        PrintTool.print("\nTicket Information:");
        PrintTool.print(GT.GroupTicketInf());
    }
}
