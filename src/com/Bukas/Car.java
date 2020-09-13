package com.Bukas;

import java.awt.*;

public class Car implements Drawable {
    Graphics2D g;
    int x;
    int y;
    int h;
    int w;
    Color carColor;

    public Car(Graphics2D g, int x, int y, int h, int w, Color carColor) {
        this.g = g;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.carColor = carColor;
    }

    @Override
    public void draw(Graphics2D g) {
        int[] Xpoints = {
                (int)(x + w*0.05),
                (int)(x + w*0.25),
                (int)(x + w*0.30),
                (int)(x + w*0.65),
                (int)(x + w*0.75),
                (int)(x + w*0.95),
                x + w,
                x
        };
        int[] Ypoints = {
                (int)(y + h*0.5),
                (int)(y + h*0.40),
                y,
                y,
                (int)(y + h*0.4),
                (int)(y + h*0.5),
                (int)(y + h*0.9),
                (int)(y + h*0.9),
        };

        g.setColor(carColor);
        Polygon carBody = new Polygon(Xpoints,Ypoints,8);
        g.fillPolygon(carBody);
        g.setColor(Color.black);
        g.fillOval((int)(x + w*0.15),(int)(y + h*0.7),(int)(h*0.4),(int)(h*0.4));
        g.fillOval((int)(x + w*0.7),(int)(y + h*0.7),(int)(h*0.4),(int)(h*0.4));
        g.setColor(new Color(0x34D0D0));
        g.fillRect((int)(x + w*0.35), (int)(y + h*0.1),(int)(w*0.15),(int)(h*0.25));
    }
}
