package filterpattern.criteria;

import filterpattern.person.Person;

import java.util.List;
/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:38 下午 2020/11/27
 * @Modified By:
 **/
public interface Criteria {
	
	public List<Person> meetCriteria(List<Person> persons);

}
