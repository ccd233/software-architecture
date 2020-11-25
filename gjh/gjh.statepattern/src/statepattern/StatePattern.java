package statepattern;

import statepattern.ui.Square;
import statepattern.ui.UI;

public class StatePattern {

	public static void work() {
        StatePattern demo = new StatePattern();
        demo.add_scene();
    }
	
	public void add_scene() {
		Square square = new Square();
        UI ui = new UI(square);
        ui.init();
	}
}
