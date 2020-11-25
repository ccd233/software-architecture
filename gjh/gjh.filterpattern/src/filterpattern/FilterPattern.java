package filterpattern;

import filterpattern.criteria.*;
import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterPattern {

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
	    	System.out.println("Please enter a command(0 exit，1 new a character，2 Print all children，"
	    			+ "3 Print all adult，4 Print all Visitors，\n"
	    			+ "5 Print all Staff，6 Print children visitors, "
	    			+ "7Print adult staff，8 print adult of staff):");
	        String str=scan.next();
	        //input.add(str);
	        if(str.equals("0")) {
	        	System.out.println("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	System.out.println("Please enter a name：");
	        	String name = scan.next();
	        	System.out.println("Please enter the age：");
	        	String age_string = scan.next();
				int age=Integer.parseInt(age_string);
	        	System.out.println("Please enter the status(VISITOR or STAFF)：");
	        	String type = scan.next();
	        	persons.add(new Person(name, age, type));
	        	//System.out.println(name);
	        	//System.out.println(age);
	        }
	        else if(str.equals("2")) {
	        	System.out.println("children: ");
	    		printPersons(children.meetCriteria(persons));
	        }
	        else if(str.equals("3")){
	        	System.out.println("adult: ");
	    		printPersons(adult.meetCriteria(persons));
	        }
	        else if(str.equals("4")){
	        	System.out.println("visitors: ");
	    		printPersons(visitors.meetCriteria(persons));
	        }
	        else if(str.equals("5")){
	        	System.out.println("staff: ");
	    		printPersons(staff.meetCriteria(persons));
	        }
	        else if(str.equals("6")){
	        	System.out.println("childrenVisitors: ");
	    		printPersons(childrenVisitors.meetCriteria(persons));
	        }
	        else if(str.equals("7")){
	        	System.out.println("adultStaff: ");
	    		printPersons(adultStaff.meetCriteria(persons));
	        }
	        else if(str.equals("8")){
	        	System.out.println("adultOrStaff: ");
	    		printPersons(adultOrStaff.meetCriteria(persons));
	        }
	        else {
				System.out.println("Input Error:");
			}
	    }
		return null;
	}
	public static void printPersons(List<Person> persons) {
		for (Person person : persons) {
			System.out.println("Person : [ Name : " + person.getName() 
            +", Age : " + person.getAge() 
            +", Type : " + person.getType()
            +" ]");
		}
	}
	public static void work() {
		FilterPattern demo = new FilterPattern();
		demo.filterPattern_demo();
	}
}
