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
public class CriteriaVisitor implements Criteria{

	/**
	 * 过滤出所有游客
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> visitorPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getType().equalsIgnoreCase("VISITOR")) {
				visitorPersons.add(person);
			}
		}
		return visitorPersons;
	}

}
