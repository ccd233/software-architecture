package filterPattern.criteria;

import java.util.List;
import filterPattern.person.Person;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
