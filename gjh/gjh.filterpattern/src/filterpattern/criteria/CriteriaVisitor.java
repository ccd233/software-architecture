package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.ArrayList;
import java.util.List;

public class CriteriaVisitor implements Criteria{
	
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
