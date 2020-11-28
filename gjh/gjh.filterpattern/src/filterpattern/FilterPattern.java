package filterpattern;

import filterpattern.criteria.*;
import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import tools.PrintTool;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:39 下午 2020/11/27
 * @Modified By:
 **/
public class FilterPattern {

	/**
	 * 基本的演示类，运行后输入数字代表命令
	 * @return
	 */
	public String filterPattern_demo() {
		List<Person> persons = new ArrayList<Person>();
		persons.add(new Person("A",16, "VISITOR"));
		persons.add(new Person("B",28, "STAFF"));
		persons.add(new Person("C",19, "STAFF"));
		persons.add(new Person("F",12, "VISITOR"));
		
		Criteria children = new CriteriaChildren();
		Criteria adult = new CriteriaAdult();
		Criteria visitors = new CriteriaVisitor();
		Criteria staff = new CriteriaStaff();
		Criteria childrenVisitors = new AndCriteria(children,visitors);
		Criteria adultStaff = new AndCriteria(adult,staff);
		Criteria adultOrStaff = new OrCriteria(adult,staff);
		//List<String> input = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
	    while(true) {
	    	PrintTool.print("Please enter a command(0 exit，1 new a character，2 Print all children，"
	    			+ "3 Print all adult，4 Print all Visitors，\n"
	    			+ "5 Print all Staff，6 Print children visitors, "
	    			+ "7Print adult staff，8 print adult of staff):");
	        String str=scan.next();
	        //input.add(str);
	        if(str.equals("0")) {
	        	PrintTool.print("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	PrintTool.print("Please enter a name：");
	        	String name = scan.next();
	        	PrintTool.print("Please enter the age：");
	        	String age_string = scan.next();
				int age=0;
				try {
					age=Integer.parseInt(age_string);
				} catch (NumberFormatException e) {
					PrintTool.print("求求你输数字吧");
					continue;
				}
	        	PrintTool.print("Please enter the status(VISITOR or STAFF)：");
	        	String type = scan.next();
	        	persons.add(new Person(name, age, type));
	        	//PrintTool.print(name);
	        	//PrintTool.print(age);
	        }
	        else if(str.equals("2")) {
	        	PrintTool.print("children: ");
	    		printPersons(children.meetCriteria(persons));
	        }
	        else if(str.equals("3")){
	        	PrintTool.print("adult: ");
	    		printPersons(adult.meetCriteria(persons));
	        }
	        else if(str.equals("4")){
	        	PrintTool.print("visitors: ");
	    		printPersons(visitors.meetCriteria(persons));
	        }
	        else if(str.equals("5")){
	        	PrintTool.print("staff: ");
	    		printPersons(staff.meetCriteria(persons));
	        }
	        else if(str.equals("6")){
	        	PrintTool.print("childrenVisitors: ");
	    		printPersons(childrenVisitors.meetCriteria(persons));
	        }
	        else if(str.equals("7")){
	        	PrintTool.print("adultStaff: ");
	    		printPersons(adultStaff.meetCriteria(persons));
	        }
	        else if(str.equals("8")){
	        	PrintTool.print("adultOrStaff: ");
	    		printPersons(adultOrStaff.meetCriteria(persons));
	        }
	        else {
				PrintTool.print("Input Error:");
			}
	    }
		return null;
	}

	/**
	 * 打印人员信息的函数
	 * @param persons
	 */
	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			PrintTool.print("Person : [ Name : " + person.getName()
            +", Age : " + person.getAge() 
            +", Type : " + person.getType()
            +" ]");
		}
	}

	/**
	 * 接口函数
	 */
	public static void work() {
		FilterPattern demo = new FilterPattern();
		demo.filterPattern_demo();
	}
}
