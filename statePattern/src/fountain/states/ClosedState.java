package fountain.states;


import fountain.ui.Square;


public class ClosedState extends State{

	ClosedState(Square square){
		super(square);
		square.setPlaying(false);
	}
	
	@Override
	public String onClose() {
		if(square.isPlaying()) {
			square.changeState(new ReadyState(square));
			return "Stop playing";
		}else {
			return "Fountain is closed";
		}
	}
	
	@Override
	public String onPlay() {
		square.changeState(new ReadyState(square));
		return "foutain is ready";
	}
	
	@Override
	public String onNext() {
		return "Fountain is closed";
	}
	
	@Override
	public String onPrevious() {
		return "Fountain is closed";
	}
}
