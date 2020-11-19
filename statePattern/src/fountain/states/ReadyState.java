package fountain.states;

import fountain.ui.Square;

public class ReadyState extends State{

	public ReadyState(Square square) {
		super(square);
	}

	@Override
	public String onClose() {
		// TODO Auto-generated method stub
		square.changeState(new ClosedState(square));
		return "Fountain is closed";
	}

	@Override
	public String onPlay() {
		// TODO Auto-generated method stub
		String action = square.startPlayback();
		square.changeState(new PlayingState(square));
		return action;
	}

	@Override
	public String onNext() {
		// TODO Auto-generated method stub
		return "Fountain is closed";
	}

	@Override
	public String onPrevious() {
		// TODO Auto-generated method stub
		return "Fountain is closed";
	}
}
