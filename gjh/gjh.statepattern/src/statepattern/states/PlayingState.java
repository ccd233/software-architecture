package statepattern.states;

import statepattern.ui.Square;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/

public class PlayingState extends State{

	/**
	 * 构造函数
	 * @param square
	 */
	PlayingState(Square square){
		super(square);
	}

	/**
	 * 表演状态接收输入onClose，转为暂停状态
	 * @return
	 */
	@Override
	public String onClose() {
		// TODO Auto-generated method stub
		square.changeState(new ClosedState(square));
		square.setCurrentPLCAfterStop();
		return "Stop Playing";
	}

	/**
	 * 表演状态接收输入onPlay，转为暂停状态
	 * @return
	 */
	@Override
	public String onPlay() {
		// TODO Auto-generated method stub
		square.changeState(new ReadyState(square));
		return "Taking a break";
	}

	/**
	 * 表演状态接收输入onNext，进行下一种表演
	 * @return
	 */
	@Override
	public String onNext() {
		// TODO Auto-generated method stub
		return square.nextPLC();
	}

	/**
	 * 表演状态接收输入onPrevious，进行上一种表演
	 * @return
	 */
	@Override
	public String onPrevious() {
		// TODO Auto-generated method stub
		return square.previousPLC();
	}
}
