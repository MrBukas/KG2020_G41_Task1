package com.Bukas;

import java.awt.*;

public class House implements Drawable {
    Graphics2D g;
    int x;
    int y;
    int h;
    int w;
    int roofH;
    Color houseColor;
    Color doorColor;
    Color roofColor;

    public House(Graphics2D g, int x, int y, int h, int w, int roofH, Color houseColor, Color doorColor, Color roofColor) {
        this.g = g;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.roofH = roofH;
        this.houseColor = houseColor;
        this.doorColor = doorColor;
        this.roofColor = roofColor;
    }
    private void drawHouse(Graphics2D g,int x,int y, int h,int w, int roofH, Color houseColor, Color doorColor,Color roofColor){
        g.setColor(houseColor);
        g.fillRect(x,y,w,h);
        g.setColor(roofColor);

        int[] xRoof = {(int)(x - w * 0.15), x + (w/2), (int)(x + w * 1.15)};
        int[] yRoof = {y,y-roofH,y};
        Polygon roof = new Polygon(xRoof,yRoof,3);
        g.fillPolygon(roof);

        g.setColor(doorColor);
        g.fillRect((int)(x + w * 0.6),(int)(y + h * 0.4),(int)(w*0.3),(int)(h*0.6));

    }

    @Override
    public void draw(Graphics2D g) {
        drawHouse(g,x,y,h,w,roofH,houseColor,doorColor,roofColor);
    }
}
