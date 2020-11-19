package fountain.Demo;

import fountain.ui.Square;
import fountain.ui.UI;

public class Demo {

	public static void main(String[] args) {
        Demo demo = new Demo();
        demo.add_scene();
    }
	
	public void add_scene() {
		Square square = new Square();
        UI ui = new UI(square);
        ui.init();
	}
}
