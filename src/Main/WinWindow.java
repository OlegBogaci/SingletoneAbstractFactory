package Main;

import javax.swing.*;

public class WinWindow implements Window{
    JFrame frame = new JFrame("WinFrame");
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
