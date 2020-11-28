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
public class HRDepartment extends Department {

	/**
	 * 访问经理打卡情况
	 * @param manager
	 */
	@Override
	public void visit(Manager manager) {
		PrintTool.print("");
		int workTime = manager.personHour();
		PrintTool.print(manager.getName()+ "\'s total work time is："+ workTime);
	}

	/**
	 * 访问打工人打卡情况
	 * @param manager
	 */
	@Override
	public void visit(Worker worker) {
		PrintTool.print("");
		int workTime = worker.personHour();
		PrintTool.print(worker.getName()+ "\'s total work time is："+ workTime);
	}
	
}
