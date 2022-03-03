package Main;

import javax.swing.*;

public class WinText implements Text{
    JButton b=new JButton("This machine works on Windows OS");

    @Override
    public JButton getText() {
        b.setBounds(130,100,100, 40);
        return b;
    }
}
