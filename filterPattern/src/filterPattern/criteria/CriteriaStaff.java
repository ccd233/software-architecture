package filterPattern.criteria;

import java.util.ArrayList;
import java.util.List;
import filterPattern.person.Person;

public class CriteriaStaff implements Criteria{
	
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> staffPersons = new ArrayList<Person>();
		for (Person person : persons) {
			if(person.getType().equalsIgnoreCase("VISITOR")) {
				staffPersons.add(person);
			}
		}
		return staffPersons;
	}

}
