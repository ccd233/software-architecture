package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:40 下午 2020/11/27
 * @Modified By:
 **/
public class OrCriteria implements Criteria{

	private Criteria criteria;
	private Criteria otherCriteria;

	/**
	 * 构造函数
	 * @param criteria
	 * @param othercriteria
	 */
	public OrCriteria(Criteria criteria, Criteria othercriteria) {
		this.criteria=criteria;
		this.otherCriteria=othercriteria;
	}

	/**
	 * 且方法，相当于取交集
	 * @param persons
	 * @return
	 */
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
