package visitorpattern.visitor;


import visitorpattern.element.Manager;
import visitorpattern.element.Worker;
import tools.PrintTool;

public class HRDepartment extends Department {
	
	//经理上班时长
	@Override
	public void visit(Manager manager) {
		PrintTool.print("");
		int workTime = manager.personHour();
		System.out.println(manager.getName()+ "\'s total work time is："+ workTime);
	}
	
	//打工人上班时长
	@Override
	public void visit(Worker worker) {
		PrintTool.print("");
		int workTime = worker.personHour();
		System.out.println(worker.getName()+ "\'s total work time is："+ workTime);
	}
	
}
