package statepattern.ui;

import javax.swing.*;
import java.awt.*;

public class UI {

	private Square square;
    private static JTextField textField = new JTextField();

    public UI(Square square) {
        this.square = square;
    }
    public void init() {
        JFrame frame = new JFrame("Fountain");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel context = new JPanel();
        context.setLayout(new BoxLayout(context, BoxLayout.Y_AXIS));
        frame.getContentPane().add(context);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
        context.add(textField);
        context.add(buttons);

        // Context delegates handling user's input to a state object. Naturally,
        // the outcome will depend on what state is currently active, since all
        // states can handle the input differently.
        JButton play = new JButton("Play");
        play.addActionListener(e -> textField.setText(square.getState().onPlay()));
        JButton stop = new JButton("Stop");
        stop.addActionListener(e -> textField.setText(square.getState().onClose()));
        JButton next = new JButton("Next");
        next.addActionListener(e -> textField.setText(square.getState().onNext()));
        JButton prev = new JButton("Prev");
        prev.addActionListener(e -> textField.setText(square.getState().onPrevious()));
        frame.setVisible(true);
        frame.setSize(400, 100);
        buttons.add(play);
        buttons.add(stop);
        buttons.add(next);
        buttons.add(prev);
    }
}
