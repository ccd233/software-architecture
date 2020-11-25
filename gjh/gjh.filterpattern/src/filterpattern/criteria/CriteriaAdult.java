package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

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
