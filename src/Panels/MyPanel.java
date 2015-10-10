package Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class MyPanel extends JPanel {

    public void paintComponent(Graphics g1){
        super.paintComponent(g1);
        Graphics2D g2 = (Graphics2D) g1;
        QuadCurve2D mouth = new QuadCurve2D.Double(70, 130, 150, 200, 170, 130);
        g2.setColor(Color.yellow);
        Ellipse2D body = new Ellipse2D.Double(50, 50, 150, 150);
        g2.fill(body);
        BasicStroke pen1 = new BasicStroke(5);
        g2.setStroke(pen1);
        g2.setColor(Color.red);
        g2.draw(mouth);
        g2.setColor(Color.black);
        g2.draw(body);
        g2.setColor(Color.white);
        Ellipse2D eye1 = new Ellipse2D.Double(80, 80, 30, 30);
        g2.fill(eye1);
        Ellipse2D eye2 = new Ellipse2D.Double(150, 80, 30, 30);
        g2.fill(eye2);
        g2.setColor(Color.black);
        Ellipse2D pupil1 = new Ellipse2D.Float(90, 85, 5, 5);
        g2.draw(pupil1);
        Ellipse2D pupil2 = new Ellipse2D.Float(160, 85, 5, 5);
        g2.draw(pupil2);
    }
}
