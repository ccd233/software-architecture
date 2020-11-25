package visitorpattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import tools.IfInt;
import visitorpattern.element.*;
import visitorpattern.visitor.*;
import tools.PrintTool;

public class VisitorPattern {
	
	public void visitorPattern() {
		List<Employee> employeeList = new ArrayList<Employee>();
		//经理1
		Employee employee1 = new Manager("迟经理", 8, 50000, 10);
		//经理2
		Employee employee2 = new Manager("周经理", 8, 15000, 15);
		//普通员工1
		Employee employee3 = new Worker("小聂", 8, 8000, 8);
		//普通员工2
		Employee employee4 = new Worker("小关", 8, 8500, 12);

		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			PrintTool.print("");
			System.out.println("Please enter a command(0 exit, 1 add a manager, "
					+ "2 add a worker, 3 Financial statements, 4 Human resourcesstatements)");
			String str=scan.next();
	        if(str.equals("0")) {
	        	System.out.println("close");
	            break;
	        }
	        else if(str.equals("1")) {
	        	System.out.println("Please enter a name：");
	        	String name = scan.next();
	        	System.out.println("Please enter the workingHours：");
	        	String workingHoursString = scan.next();
				//int workingHours=Integer.parseInt(workingHoursString);
	        	System.out.println("Please enter the salary：");
	        	String salaryString = scan.next();
				//int salary=Integer.parseInt(salaryString);
	        	System.out.println("Please enter the length of absence：");
	        	String absenceString = scan.next();
				//int absence=Integer.parseInt(absenceString);
				if(IfInt.isNumeric(workingHoursString)||IfInt.isNumeric(salaryString)||IfInt.isNumeric(absenceString)){
					int workingHours=Integer.parseInt(workingHoursString);
					int salary=Integer.parseInt(salaryString);
					int absence=Integer.parseInt(absenceString);
					Employee empl = new Manager(name, workingHours, salary, absence);
					employeeList.add(empl);
				}else {
					System.out.println("Please enter the correct info：");
				}

	        }
	        else if(str.equals("2")) {
				System.out.println("Please enter a name：");
				String name = scan.next();
				System.out.println("Please enter the workingHours：");
				String workingHoursString = scan.next();
				//int workingHours=Integer.parseInt(workingHoursString);
				System.out.println("Please enter the salary：");
				String salaryString = scan.next();
				//int salary=Integer.parseInt(salaryString);
				System.out.println("Please enter the length of absence：");
				String absenceString = scan.next();
				//int absence=Integer.parseInt(absenceString);
				if(IfInt.isNumeric(workingHoursString)||IfInt.isNumeric(salaryString)||IfInt.isNumeric(absenceString)){
					int workingHours=Integer.parseInt(workingHoursString);
					int salary=Integer.parseInt(salaryString);
					int absence=Integer.parseInt(absenceString);
					Employee empl = new Worker(name, workingHours, salary, absence);
					employeeList.add(empl);
				}else {
					System.out.println("Please enter the correct info：");
				}
	        }
	        else if(str.equals("3")){
	        	financeDepartment fadepartment = new financeDepartment();
	        	for(Employee employee : employeeList){
	    			employee.accept(fadepartment);
	    		}	
	        }
	        else if(str.equals("4")){
	        	HRDepartment hrdepartment = new HRDepartment();
	        	for(Employee employee : employeeList){
	    			employee.accept(hrdepartment);
	    		}	
	        }
	        else {
				System.out.println("Input Error");
			}
		}
	}
	
	public static void work() {
		VisitorPattern demo = new VisitorPattern();
		demo.visitorPattern();
	}

}
