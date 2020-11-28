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
public class CriteriaAdult implements Criteria{

	/**
	 * 过滤出所有成年人
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> adultPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getAge() >= 16) {
				adultPersons.add(person);
			}
		}
		return adultPersons;
	}

}
