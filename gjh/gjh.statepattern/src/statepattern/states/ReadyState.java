package statepattern.states;

import statepattern.ui.Square;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/

public class ReadyState extends State{

	/**
	 * 构造函数
	 * @param square
	 */
	public ReadyState(Square square) {
		super(square);
	}

	/**
	 * 由准备状态接受输入onClose，转为关闭
	 * @return
	 */
	@Override
	public String onClose() {
		// TODO Auto-generated method stub
		square.changeState(new ClosedState(square));
		return "Fountain is closed";
	}

	/**
	 * 由准备状态接受输入onPlay，转为开始运行状态
	 * @return
	 */
	@Override
	public String onPlay() {
		// TODO Auto-generated method stub
		String action = square.startPlayback();
		square.changeState(new PlayingState(square));
		return action;
	}

	/**
	 * 由准备状态接受输入onNext，转为关闭状态
	 * @return
	 */
	@Override
	public String onNext() {
		// TODO Auto-generated method stub
		return "Fountain is closed";
	}

	/**
	 * 由准备状态接受输入onPrevious，转为关闭状态
	 * @return
	 */
	@Override
	public String onPrevious() {
		// TODO Auto-generated method stub
		return "Fountain is closed";
	}
}
