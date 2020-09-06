package com.Bukas;

import java.awt.*;

public class Road implements Drawable{
    int x;
    int y;
    int rowH;
    int length;

    boolean isSolid;

    public Road(int x, int y, int rowH, int length,  boolean isSolid) {
        this.x = x;
        this.y = y;
        this.rowH = rowH;
        this.length = length;
        this.isSolid = isSolid;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(Color.GRAY);
        g.fillRect(x,y,length,rowH);
        g.setColor(Color.white);
        for (int i = 0; i * 20 < length; i++) {
            if (isSolid || i % 2 ==0){
                g.fillRect(x + 20 * i,y+(rowH/2) -3,20,6);
            }
        }

    }
}
