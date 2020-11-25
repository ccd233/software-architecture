package compositeentitypattern;

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
    
    public static void work(){
        String FatherName = null;
        String MotherName = null;
        int ChildNum=0;
        List<String> ChildName = new ArrayList<String>();
        String GroupName=null;
        while(FatherName==null||MotherName==null||ChildName.size()==0){
            Scanner input = new Scanner(System.in);
            System.out.println("Father Name:");
            FatherName = input.nextLine();
            System.out.println("Mother Name:");
            MotherName = input.nextLine();
            System.out.println("Child Num:");
            ChildNum=Integer.parseInt(input.nextLine());
            for(int i=0;i<ChildNum;i++){
                System.out.println("Child Name:");
                String ChildNameTemp = input.nextLine();
                ChildName.add(ChildNameTemp);
            }
            System.out.println("Group Name:");
            GroupName = input.nextLine();
            if(FatherName==null||MotherName==null||ChildName.size()==0){
                System.out.println("Invalid Input.Please check again.\n");
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
            System.out.println("The tourist group is not qualified.\nPlease check your input group.\n");
            return;
        }
        CompositeEntity FamilyTourist=new CompositeEntity(Father,Mother,Child, GroupName);
        GroupTicket GT=FamilyTourist.BuyGroupTicket();
        System.out.println("\nTicket Information:");
        System.out.println(GT.GroupTicketInf());
    }
}
