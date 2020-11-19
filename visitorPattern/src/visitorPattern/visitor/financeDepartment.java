package visitorPattern.visitor;

import visitorPattern.element.Manager;
import visitorPattern.element.Worker;
import Tools.PrintTool;

public class financeDepartment extends Department {
	
	//访问经理工资
	@Override
	public void visit(Manager manager) {
		double totalSalary = manager.getTotalSalary();
		PrintTool.print("");
		System.out.println("Manger's name: " + manager.getName() + 
				"  Salary =" + manager.getSalary() + 
				", Hours of absense " + manager.getAbsent() + "hours"+
				", Settle salary="+totalSalary);
	}

	//访问打工人工资
	@Override
	public void visit(Worker worker) {
		double totalSalary = worker.getTotalSalary();
		PrintTool.print("");
		System.out.println("Manger's name: " + worker.getName() + 
				"  Salary =" + worker.getSalary() + 
				", Hours of absense " + worker.getAbsent() + "hours"+
				", Settle salary="+totalSalary);
	}
}
