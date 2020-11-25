package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.List;

public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;
	
	public OrCriteria(Criteria criteria, Criteria othercriteria) {
		this.criteria=criteria;
		this.otherCriteria=othercriteria;
	}
	
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> firstCriteriaItems = criteria.meetCriteria(persons);
		List<Person> otherCriteriaItems = otherCriteria.meetCriteria(persons);
		
		for (Person person : otherCriteriaItems) {
			if(!firstCriteriaItems.contains(person)) {
				firstCriteriaItems.add(person);
			}
		}
		return firstCriteriaItems;
	}
	
}
