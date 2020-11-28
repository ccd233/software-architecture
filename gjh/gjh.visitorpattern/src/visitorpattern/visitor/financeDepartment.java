package visitorpattern.visitor;

import visitorpattern.element.Manager;
import visitorpattern.element.Worker;
import tools.PrintTool;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:45 下午 2020/11/27
 * @Modified By:
 **/
public class financeDepartment extends Department {

	/**
	 * 访问经理工资
	 * @param manager
	 */
	@Override
	public void visit(Manager manager) {
		double totalSalary = manager.getTotalSalary();
		PrintTool.print("");
		PrintTool.print("Manger's name: " + manager.getName() + 
				"  Salary =" + manager.getSalary() + 
				", Hours of absense " + manager.getAbsent() + "hours"+
				", Settle salary="+totalSalary);
	}

	/**
	 * 访问打工人工资
	 * @param manager
	 */
	@Override
	public void visit(Worker worker) {
		double totalSalary = worker.getTotalSalary();
		PrintTool.print("");
		PrintTool.print("Manger's name: " + worker.getName() + 
				"  Salary =" + worker.getSalary() + 
				", Hours of absense " + worker.getAbsent() + "hours"+
				", Settle salary="+totalSalary);
	}
}
