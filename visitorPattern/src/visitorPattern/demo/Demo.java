package visitorPattern.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import visitorPattern.element.*;
import visitorPattern.visitor.*;
import Tools.PrintTool;

public class Demo {
	
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
	        	int workingHours = scan.nextInt();
	        	System.out.println("Please enter the salary：");
	        	int salary = scan.nextInt();
	        	System.out.println("Please enter the length of absence：");
	        	int absence = scan.nextInt();
	        	Employee empl = new Manager(name, workingHours, salary, absence);
	        	employeeList.add(empl);
	        }
	        else if(str.equals("2")) {
	        	System.out.println("Please enter a name：");
	        	String name = scan.next();
	        	System.out.println("Please enter the workingHours：");
	        	int workingHours = scan.nextInt();
	        	System.out.println("Please enter the salary：");
	        	int salary = scan.nextInt();
	        	System.out.println("Please enter the length of absence：");
	        	int absence = scan.nextInt();
	        	Employee empl = new Worker(name,workingHours,salary,absence);
	        	employeeList.add(empl);
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
		}
	}
	
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.visitorPattern();
	}

}
