package Main;

import javax.swing.*;

public class MacText implements Text {
    JButton b=new JButton("This machine works on MAC OS");

    @Override
    public JButton getText() {
        b.setBounds(130,100,100, 40);
        return b;
    }
}
