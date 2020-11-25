package mediatorpattern;

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
    
    public void BuyTicket(Tourist tourist,EntertainmentFacilities entertainmentFacilities){
        TicketAgent EFTicketAgent=new TicketAgent(tourist,entertainmentFacilities);
        Ticket EFTicket=EFTicketAgent.GetTicket();
        System.out.println(EFTicket.TicketInf());
    }

    public static void work(){
        EntertainmentFacilities EF1=new EntertainmentFacilities("Aquarium",35);
        EntertainmentFacilities EF2=new EntertainmentFacilities("Exploring Undersea",50);
        EntertainmentFacilities EF3=new EntertainmentFacilities("Ocean roller coaster",40);
        List<EntertainmentFacilities> EntertainmentList=new ArrayList<EntertainmentFacilities>();
        EntertainmentList.add(EF1);
        EntertainmentList.add(EF2);
        EntertainmentList.add(EF3);
        System.out.println("Entertainment Facilities List:");
        System.out.println(EF1.FacilityInformation());
        System.out.println(EF2.FacilityInformation());
        System.out.println(EF3.FacilityInformation());

        String Name = null;
        int Age=-1;
        String Occupation=null;
        Scanner input = new Scanner(System.in);
        while(Age<=0||Name==null||Occupation==null){
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
        EntertainmentFacilities EF=null;
        while(EF==null){
            System.out.println("Visiting Facility Name:");
            String FacilityName=input.nextLine();
            for(int i=0;i<EntertainmentList.size();i++){
                if(EntertainmentList.get(i).FacilityName().equals(FacilityName)){
                    EF=EntertainmentList.get(i);
                }
            }
            if(EF==null){
                System.out.println("The input name is invalid,please check again.\n");
            }
        }

        TicketAgent EFTicketAgent=new TicketAgent(Visitor,EF);
        Ticket EFTicket=EFTicketAgent.GetTicket();
        System.out.println("Got Ticket!\n");
        System.out.println(EFTicket.TicketInf());
    }
}
