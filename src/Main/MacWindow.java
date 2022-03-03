package Main;

import javax.swing.*;

public class MacWindow implements Window {
    JFrame frame = new JFrame("MacFrame");
    @Override
    public void showWindow() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(500,500);
        frame.setVisible(true);

    }

    @Override
    public void addText(JButton button) {
        frame.add(button);
    }
}
