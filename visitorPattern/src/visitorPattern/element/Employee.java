package visitorPattern.element;
import visitorPattern.visitor.Department;
//定义抽象被访问者
public abstract class Employee {

	public abstract void accept(Department department);
	
}
