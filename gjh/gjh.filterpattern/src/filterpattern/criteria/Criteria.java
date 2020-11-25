package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.List;

public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
