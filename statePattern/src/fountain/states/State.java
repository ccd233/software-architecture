package fountain.states;

import fountain.ui.Square;

public abstract class State {
	
	Square square;
	
	State(Square square){
		this.square = square;
	}
	
	public abstract String onClose();
	public abstract String onPlay();
	public abstract String onNext();
	public abstract String onPrevious();

}
