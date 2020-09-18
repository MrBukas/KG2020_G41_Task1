package com.Bukas;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel {
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(0x3BD8DA));
        g.fillRect(0,0,800,500);
        Sun sun = new Sun((Graphics2D) g,50,50,50,100,30,new Color(0xD58827));
        sun.draw((Graphics2D) g);


        Road road = new Road(0,450,100,800,false);
        road.draw((Graphics2D) g);
        new HighTower((Graphics2D) g,50,100,350,100,8,3,new Color(0x6993B1)).draw((Graphics2D) g);
        new HighTower((Graphics2D) g,200,250,200,100,4,4,Color.gray).draw((Graphics2D) g);
        new HighTower((Graphics2D) g,400,150,300,100,6,3,Color.blue).draw((Graphics2D) g);
        new HighTower((Graphics2D) g,510,350,100,220,2,5,new Color(0xB58773)).draw((Graphics2D) g);
        new Car((Graphics2D) g,200,400,70,180,Color.red).draw((Graphics2D) g);
        new Car((Graphics2D) g,400,460,70,220,Color.blue).draw((Graphics2D) g);
        new Car((Graphics2D) g,20,460,70,140,new Color(0x77D538)).draw((Graphics2D) g);
        new Clock(200,200,200,3,42).draw((Graphics2D) g);

    }

}
