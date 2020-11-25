package visitorpattern.visitor;

import visitorpattern.element.*;
public abstract class Department {

	//访问人上人
	public abstract void visit(Manager manager);
	//访问打工人
	public abstract void visit(Worker worker);
}
