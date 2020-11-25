package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaChildren implements Criteria{
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
