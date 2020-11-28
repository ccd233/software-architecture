package mediatorpattern;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:29 2020/11/23
 * @Modified By:
 **/
public class MediatorPattern {
    /***
     * @Author: Zhou Lifan
     * @Description: 
     *
     * @Param Type
     * param: tourist
     * resume: 
    param: entertainmentFacilities
     * resume: 
     *
     * @Return Value
     * @return: void
     * @resume: 
     *
     * @Date:  2020/11/23
     * @Modified By: 
    **/

    //tourist buys ticket by ticket agent
    public void BuyTicket(Tourist tourist,EntertainmentFacilities entertainmentFacilities){
        TicketAgent EFTicketAgent=new TicketAgent(tourist,entertainmentFacilities);
        Ticket EFTicket=EFTicketAgent.GetTicket();
        PrintTool.print(EFTicket.TicketInf());
    }

    //output interface
    public static void work(){
        EntertainmentFacilities EF1=new EntertainmentFacilities("Aquarium",35);
        EntertainmentFacilities EF2=new EntertainmentFacilities("Exploring Undersea",50);
        EntertainmentFacilities EF3=new EntertainmentFacilities("Ocean roller coaster",40);
        List<EntertainmentFacilities> EntertainmentList=new ArrayList<EntertainmentFacilities>();
        EntertainmentList.add(EF1);
        EntertainmentList.add(EF2);
        EntertainmentList.add(EF3);
        PrintTool.print("Entertainment Facilities List:");
        PrintTool.print(EF1.FacilityInformation());
        PrintTool.print(EF2.FacilityInformation());
        PrintTool.print(EF3.FacilityInformation());

        String Name = null;
        int Age=-1;
        String Occupation=null;
        Scanner input = new Scanner(System.in);
        while(Age<=0||Name==null||Occupation==null){
            PrintTool.print("Tourist Name:");
            Name = input.nextLine();
            PrintTool.print("Tourist Age:");
            String AgeInt=input.nextLine();
            try {
                Age = Integer.parseInt(AgeInt);
            } catch (NumberFormatException e) {
                PrintTool.print("Please Input Number");
                continue;
            }
            PrintTool.print("Tourist Occupation:");
            Occupation=input.nextLine();
            if(Age<=0||Name==null||Occupation==null){
                PrintTool.print("Invalid Input.Please check again.\n");
            }
        }
        Tourist Visitor=new Tourist(Name,Age,Occupation);
        EntertainmentFacilities EF=null;
        while(EF==null){
            PrintTool.print("Visiting Facility Name:");
            String FacilityName=input.nextLine();
            for(int i=0;i<EntertainmentList.size();i++){
                if(EntertainmentList.get(i).FacilityName().equals(FacilityName)){
                    EF=EntertainmentList.get(i);
                }
            }
            if(EF==null){
                PrintTool.print("The input name is invalid,please check again.\n");
            }
        }

        TicketAgent EFTicketAgent=new TicketAgent(Visitor,EF);
        Ticket EFTicket=EFTicketAgent.GetTicket();
        PrintTool.print("Got Ticket!\n");
        PrintTool.print(EFTicket.TicketInf());
    }
}
