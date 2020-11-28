package visitorpattern.visitor;

import visitorpattern.element.*;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:45 下午 2020/11/27
 * @Modified By:
 **/

public abstract class Department {

	/**
	 * 访问人上人
	 * @param manager
	 */
	public abstract void visit(Manager manager);
	/**
	 * 访问打工人
	 * @param manager
	 */
	public abstract void visit(Worker worker);
}
