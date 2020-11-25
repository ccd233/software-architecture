package daopattern;

import java.util.List;
import java.util.Scanner;

/**
 * @Author ZhouLifan
 * @Description:
 * @Date: Created in 20:46 2020/11/23
 * @Modified By:
 **/
public class DaoPattern {
    private TouristDao TouristStatistics=new TouristDao();
    public void TouristVisiting(Tourist Visitor){
        if(Visitor==null){
            System.out.println("The input is null.\nplease check your input and try again.\n");
            return;
        }
        System.out.println("Vistor:"+Visitor.GetName()+" comes.");
        TouristStatistics.AddObject(Visitor);
    }
    public static void work(){
        Scanner input = new Scanner(System.in);
        while(true) {
            System.out.println("1.add 2.delete 3.print");
            String command=null;
            command=input.nextLine();
            if(command.equals("add")) {
                String Name = null;
                int Age = -1;
                String Occupation = null;
                while (Age <= 0 || Name == null || Occupation == null) {
                    System.out.println("Tourist Name:");
                    Name = input.nextLine();
                    System.out.println("Tourist Age:");
                    Age = Integer.parseInt(input.nextLine());
                    System.out.println("Tourist Occupation:");
                    Occupation = input.nextLine();
                    if (Age <= 0 || Name == null || Occupation == null) {
                        System.out.println("Invalid Input.Please check again.\n");
                    }
                }
                Tourist Visitor = new Tourist(Name, Age, Occupation);
                TouristDao TouristInf = TouristDao.GetInstance();
                TouristInf.AddObject(Visitor);
            } else if(command.equals("delete")){
                System.out.println("Tourist Name:");
                String Name = null;
                Name = input.nextLine();
                TouristDao TouristInf = TouristDao.GetInstance();
                List<Integer> SearchList=TouristInf.SearchByName(Name);
                for(int index:SearchList){
                    TouristInf.DeleteObject(index);
                }
            } else if(command.equals("print")){
                TouristDao TouristInf = TouristDao.GetInstance();
                List<Tourist> TotalList=TouristInf.GetAllObject();
                for(Tourist tourist:TotalList){
                    System.out.println(tourist.GetName()+"\n");
                }
            } else{
                System.out.println("Invalid Command\n");
            }
        }
    }
}
