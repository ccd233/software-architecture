package mementopattern.character;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/
public class Memento {
	private List<String> states;
    private int index;
    /**
     * 构造方法
     * @param states
     * @param index
     */
    public Memento(List<String> states, int index) {
        //重新构建了一个新的集合，拷贝状态集合到新的集合中，保证原有集合变化不会影响到我们记录的值
        this.states = new ArrayList<>(states);
        this.index = index;
    }
    public List<String> getStates() {
        return states;
    }
    public int getIndex() {
        return index;
    }

}
