package filterPattern.criteria;

import java.util.ArrayList;
import java.util.List;
import filterPattern.person.Person;

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
