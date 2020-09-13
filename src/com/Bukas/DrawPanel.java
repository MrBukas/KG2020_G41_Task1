package com.Bukas;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //g.drawOval(100,100,100,100);
        //House house1 = new House((Graphics2D) g,200,200,100,100,30,Color.cyan,Color.magenta,Color.red);
        //House house2 = new House((Graphics2D) g,400,300,50,90,100,Color.RED,Color.BLACK,Color.GREEN);
        //house1.draw((Graphics2D) g);
        //house2.draw((Graphics2D) g);
//
        //Sun sun = new Sun((Graphics2D) g,50,50,50,100,30,new Color(0xD58827));
        //sun.draw((Graphics2D) g);
//
        //Road road = new Road(50,300,100,400,false);
        //road.draw((Graphics2D) g);
        //new HighTower((Graphics2D) g,200,200,200,100,4,4,Color.gray).draw((Graphics2D) g);
        //new HighTower((Graphics2D) g,400,200,300,100,6,3,Color.blue).draw((Graphics2D) g);
        new Car((Graphics2D) g,200,200,100,250,Color.red).draw((Graphics2D) g);
        new Car((Graphics2D) g,0,0,200,500,Color.blue).draw((Graphics2D) g);

    }

}
