package com.Bukas;

import java.awt.*;

public class Clock implements Drawable{
    int x;
    int y;
    int size;
    int hours;
    int mins;

    public Clock(int x, int y, int size, int hours, int mins) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.hours = hours;
        this.mins = mins;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(new Color(0xA5A7DA));
        g.fillOval(x,y,size,size);
        g.setColor(Color.BLACK);
        Font font = new Font(null,0,18);
        g.setFont(font);

        g.drawString("1",x+10,y+10);
        for (int i = 0; i < 12; i++) {
            int dx,dy;
            int r = size/2;
            dx =(int)(x - 4 + size /2 + r * Math.cos(Math.PI / 6 * i));// 4 для коррекции
            dy =(int)(y + 4 + size /2 + r * Math.sin(Math.PI / 6 * i));// 4 для коррекции

            g.drawString((i+3)%12+"",dx,dy);
        }

        int dxMin,dxHour,dyMin,dyHour;
        double da = Math.PI / 6;
        dxMin =(int)(x + size * 0.4 * Math.cos(da * mins) / 5);
        dyMin =(int)(y + size * 0.4 * Math.sin(da * mins) / 5);
        dxHour =(int)((x + size/2) + size * Math.cos(da * hours));
        dyHour =(int)((y + size/2) + size * Math.sin(da * hours));
        g.drawLine(x + size/2,y + size/2 ,dxHour,dyHour);
    }
}
