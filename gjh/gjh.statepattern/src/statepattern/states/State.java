package statepattern.states;

import statepattern.ui.Square;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/
public abstract class State {
	
	Square square;

	/**
	 * 构造函数，其他状态均由该接口继承而来
	 * @param square
	 */
	State(Square square){
		this.square = square;
	}
	
	public abstract String onClose();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();

}
