package visitorpattern.element;

import visitorpattern.visitor.Department;
//加油！打工人！！！！
public class Worker extends Employee {

	private String name;
	private int workingHours;//上班时长
	private double salary;//薪水
	private int absent;//缺勤(按小时算)
	
	public Worker(String name, int workingHours, double salary, int absent) {
		this.name = name;
		this.workingHours = workingHours;
		this.salary = salary;
		this.absent = absent;
	}

	@Override
	public void accept(Department department) {
		department.visit(this);
	}
	
	//计算工时 每天上班时长*一个月上班天数-缺勤
	public int personHour() {
		return workingHours * 26 - absent;
	}
	
	//薪水=工资-缺勤时长*100（加油！！！打工人！！！！！）
	public double getTotalSalary(){
		return salary - absent * 100;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}
 
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAbsent() {
		return absent;
	}
 
	public void setAbsent(int absent) {
		this.absent = absent;
	}


}
