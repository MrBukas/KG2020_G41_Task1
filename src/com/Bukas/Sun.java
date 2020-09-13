package com.Bukas;

import java.awt.*;

public class Sun implements Drawable{
    Graphics2D g;
    int x0;
    int y0;
    int r;
    int R;
    int n;
    Color c;

    public Sun(Graphics2D g,int x0, int y0, int r, int r1, int n, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }


    private static void drawSun(Graphics2D g, int x0, int y0, int r, int R, int n, Color c) {
        g.setColor(c);
        g.fillOval(x0-r,y0-r,2*r,2*r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            int dx1,dx2,dy1,dy2;
            dx1 =(int)(x0 + r * Math.cos(da * i));
            dy1 =(int)(y0 + r * Math.sin(da * i));
            dx2 =(int)(x0 + R * Math.cos(da * i));
            dy2 =(int)(y0 + R * Math.sin(da * i));
            g.drawLine(dx1,dy1,dx2,dy2);
        }
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g,x0,y0,r,R,n,c);
    }
}
