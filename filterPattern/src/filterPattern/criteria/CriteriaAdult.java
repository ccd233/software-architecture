package filterPattern.criteria;

import java.util.ArrayList;
import java.util.List;
import filterPattern.person.Person;

public class CriteriaAdult implements Criteria{
	
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
