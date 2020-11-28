package mementopattern.character;

import tools.PrintTool;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/
public class Caretaker {
	private Originator originator;
    private List<Memento> mementos = new ArrayList<>();
    private int current;
    /**
     * 构造函数
     * @param originator
     */
    public Caretaker(Originator originator) {
        this.originator = originator;
        this.current = 0;
    }
    /**
     * 创建一个新的检查点
     * @return
     */
    public int createMemento() {
        Memento memento = this.originator.createMemento();
        this.mementos.add(memento);
        return this.current++;
    }
    /**
     * 将发起人对象状态恢复到某一个检查点
     * @param index
     */
    public void restoreMemento(int index) {
        Memento memento = mementos.get(index);
        originator.restoreMemento(memento);
    }
    /**
     * 将某一个检查点删除
     * @param index
     */
    public void removeMemento(int index) {
        mementos.remove(index);
    }
    public void printAll() {
        PrintTool.print("");
        for (int i = 0; i < mementos.size(); i++) {
            PrintTool.print("Stage lighting state i : " + i + " : " + mementos.get(i)
            + " : " + mementos.get(i).getStates());
            PrintTool.print("---------------------------------");
        }
    }

}
