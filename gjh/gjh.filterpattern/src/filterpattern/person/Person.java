package filterpattern.person;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:39 下午 2020/11/27
 * @Modified By:
 **/
public class Person {
	
	private String name;
	private int age;
	private String type;

	/**
	 * 构造函数
	 * @param name
	 * @param age
	 * @param type
	 */
	public Person(String name,int age,String type){
	   this.name = name;
	   this.age = age;
	   this.type = type;   
	}
	 
	public String getName() {
	   return name;
	}
	public int getAge() {
	   return age;
	}
	public String getType() {
		return type;
	}

}
