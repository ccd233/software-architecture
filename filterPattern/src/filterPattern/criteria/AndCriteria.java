package filterPattern.criteria;

import java.util.List;
import filterPattern.person.Person;

public class AndCriteria implements Criteria{
	
	private Criteria criteria;
	private Criteria otherCriteria;
	
	public AndCriteria(Criteria criteria, Criteria othercriteria) {
		this.criteria=criteria;
		this.otherCriteria=othercriteria;
	}
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
