package forms;

import Panels.MyPanel;

import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {

    public myFrame()
    {
        setTitle("My first program on java!");
        setSize(250, 250);
        MyPanel p1 = new MyPanel();
        Container pane = getContentPane();
        pane.add(p1);

    }
}
