package com.Bukas;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        new Clock(200,200,200,4,15).draw((Graphics2D) g);
        //g.fillArc(300,300,100,200,10,220);
        //g.drawOval(100,100,100,100);
        House house1 = new House((Graphics2D) g,200,200,100,100,30,Color.cyan,Color.magenta,Color.red);
        House house2 = new House((Graphics2D) g,400,300,50,90,100,Color.RED,Color.BLACK,Color.GREEN);
        //house1.draw((Graphics2D) g);
        //house2.draw((Graphics2D) g);

        Sun sun = new Sun((Graphics2D) g,50,50,50,100,30,new Color(0xD58827));
        sun.draw((Graphics2D) g);

        Road road = new Road(50,300,100,400,false);
        //road.draw((Graphics2D) g);
    }

}
