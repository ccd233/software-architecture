package visitorpattern.element;

import visitorpattern.visitor.Department;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:45 下午 2020/11/27
 * @Modified By:
 **/
//具体被访问者一：管理层
public class Manager extends Employee{
	
	private String name;
	private int workingHours;//上班时长
	private double salary;//薪水
	private int absent;//缺勤(按小时算)

	/**
	 * 构造函数
	 * @param name
	 * @param workingHours
	 * @param salary
	 * @param absent
	 */
	public Manager(String name, int workingHours, double salary, int absent) {
		this.name = name;
		this.workingHours = workingHours;
		this.salary = salary;
		this.absent = absent;
	}

	/**
	 * 接收访问者的访问
	 * @param department
	 */
	@Override
	public void accept(Department department) {
		department.visit(this);
	}

	/**
	 * 计算工时 每天上班时长*一个月上班天数-缺勤
	 * @return
	 */
	public int personHour() {
		return workingHours * 26 - absent;
	}

	/**
	 * 薪水=工资-缺勤时长*50
	 * @return
	 */
	public double getTotalSalary(){
		return salary - absent * 50;
	}

	/**
	 * getset方法
	 * @return
	 */
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
