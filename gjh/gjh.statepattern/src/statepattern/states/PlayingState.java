package statepattern.states;

import statepattern.ui.Square;

public class PlayingState extends State{

	PlayingState(Square square){
		super(square);
	}

	@Override
	public String onClose() {
		// TODO Auto-generated method stub
		square.changeState(new ClosedState(square));
		square.setCurrentPLCAfterStop();
		return "Stop Playing";
	}

	@Override
	public String onPlay() {
		// TODO Auto-generated method stub
		square.changeState(new ReadyState(square));
		return "Taking a break";
	}

	@Override
	public String onNext() {
		// TODO Auto-generated method stub
		return square.nextPLC();
	}

	@Override
	public String onPrevious() {
		// TODO Auto-generated method stub
		return square.previousPLC();
	}
}
