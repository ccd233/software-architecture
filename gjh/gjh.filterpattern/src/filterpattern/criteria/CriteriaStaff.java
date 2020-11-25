package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaStaff implements Criteria{
	
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
