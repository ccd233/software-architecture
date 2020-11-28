package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:36 下午 2020/11/27
 * @Modified By:
 **/
public class AndCriteria implements Criteria{
	
	private Criteria criteria;
	private Criteria otherCriteria;

	/**
	 * 构造函数
	 * @param criteria
	 * @param othercriteria
	 */
	public AndCriteria(Criteria criteria, Criteria othercriteria) {
		this.criteria=criteria;
		this.otherCriteria=othercriteria;
	}

	/**
	 * 或方法，相当于取并集
	 * @param persons
	 * @return
	 */
	@Override
	public List<Person> meetCriteria(List<Person> persons){
		List<Person> firstCriteriaPersons = criteria.meetCriteria(persons);
		return otherCriteria.meetCriteria(firstCriteriaPersons);
	}

}
