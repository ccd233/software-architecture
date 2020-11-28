package daopattern;

import tools.PrintTool;

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
    //The scene that a tourist comes.
    public void TouristVisiting(Tourist Visitor){
        if(Visitor==null){
            PrintTool.print("The input is null.\nplease check your input and try again.\n");
            return;
        }
        PrintTool.print("Vistor:"+Visitor.GetName()+" comes.");
        TouristStatistics.AddObject(Visitor);
    }
    //interface
    public static void work(){
        Scanner input = new Scanner(System.in);
        while(true) {
            PrintTool.print("1.add 2.delete 3.print 4.quit");
            String command=null;
            command=input.nextLine();
            if(command.equals("add")) {
                String Name = null;
                int Age = -1;
                String Occupation = null;
                while (Age <= 0 || Name == null || Occupation == null) {
                    PrintTool.print("Tourist Name:");
                    Name = input.nextLine();
                    if(Name.isEmpty()){
                        PrintTool.print("Invalid input");
                        continue;
                    }
                    PrintTool.print("Tourist Age:");
                    String AgeString=input.nextLine();
                    try {
                        Age = Integer.parseInt(AgeString);
                    } catch (NumberFormatException e) {
                        PrintTool.print("Please Input Number");
                        continue;
                    }
                    PrintTool.print("Tourist Occupation:");
                    Occupation = input.nextLine();
                    if(Occupation.isEmpty()){
                        PrintTool.print("Invalid input");
                        continue;
                    }
                }
                Tourist Visitor = new Tourist(Name, Age, Occupation);
                TouristDao TouristInf = TouristDao.GetInstance();
                TouristInf.AddObject(Visitor);
            } else if(command.equals("delete")){
                PrintTool.print("Tourist Name:");
                String Name = null;
                Name = input.nextLine();
                TouristDao TouristInf = TouristDao.GetInstance();
                List<Integer> SearchList=TouristInf.SearchByName(Name);
                if(SearchList.isEmpty()){
                    PrintTool.print("Tourist not found.");
                    continue;
                }
                for(int index:SearchList){
                    TouristInf.DeleteObject(index);
                }
            } else if(command.equals("print")){
                TouristDao TouristInf = TouristDao.GetInstance();
                List<Tourist> TotalList=TouristInf.GetAllObject();
                for(Tourist tourist:TotalList){
                    PrintTool.print(tourist.GetName()+"\n");
                }
            } else if(command.equals("quit")){
                break;
            } else{
                PrintTool.print("Invalid Command\n");
            }
        }
    }
}
