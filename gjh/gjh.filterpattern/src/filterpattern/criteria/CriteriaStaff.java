package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:39 下午 2020/11/27
 * @Modified By:
 **/
public class CriteriaStaff implements Criteria{

	/**
	 * 过滤出所有员工
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> staffPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getType().equalsIgnoreCase("STAFF")) {
				staffPersons.add(person);
			}
		}
		return staffPersons;
	}

}
