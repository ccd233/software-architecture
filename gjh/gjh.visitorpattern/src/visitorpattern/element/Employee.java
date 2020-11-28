package visitorpattern.element;
import visitorpattern.visitor.Department;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:45 下午 2020/11/27
 * @Modified By:
 **/
//定义抽象被访问者
public abstract class Employee {

	public abstract void accept(Department department);
	
}
