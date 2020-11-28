package statepattern.states;


import statepattern.ui.Square;

/**
 * @Author Guan Jinghui
 * @Description:
 * @Date: Created in 11:42 下午 2020/11/27
 * @Modified By:
 **/
public class ClosedState extends State{

	/**
	 * 构造函数
	 * @param square
	 */
	ClosedState(Square square){
		super(square);
		square.setPlaying(false);
	}

	/**
	 * 关闭状态接收onClose，转为关闭状态
	 * @return
	 */
	@Override
	public String onClose() {
		if(square.isPlaying()) {
			square.changeState(new ReadyState(square));
			return "Stop playing";
		}else {
			return "Fountain is closed";
		}
	}

	/**
	 * 关闭状态接收onPlay，转为准备
	 * @return
	 */
	@Override
	public String onPlay() {
		square.changeState(new ReadyState(square));
		return "foutain is ready";
	}

	/**
	 * 关闭状态接收onNext，仍然为关闭状态
	 * @return
	 */
	@Override
	public String onNext() {
		return "Fountain is closed";
	}

	/**
	 * 关闭状态接收onPrevious，仍然为关闭状态
	 * @return
	 */
	@Override
	public String onPrevious() {
		return "Fountain is closed";
	}
}
