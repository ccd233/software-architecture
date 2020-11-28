package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:38 下午 2020/11/27
 * @Modified By:
 **/
public class CriteriaChildren implements Criteria{

	/**
	 * 过滤出所有未成年人
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> childrenPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getAge() < 16) {
				childrenPersons.add(person);
			}
		}
		return childrenPersons;
	}
}
