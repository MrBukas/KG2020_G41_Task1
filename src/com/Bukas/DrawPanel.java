package com.Bukas;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(100,100,100,100);
        House house1 = new House((Graphics2D) g,200,200,100,100,30,Color.cyan,Color.magenta,Color.red);
        House house2 = new House((Graphics2D) g,400,300,50,90,100,Color.RED,Color.BLACK,Color.GREEN);
        house1.draw((Graphics2D) g);
        house2.draw((Graphics2D) g);
    }

}
