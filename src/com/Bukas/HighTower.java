package com.Bukas;

import java.awt.*;

public class HighTower implements Drawable{
    Graphics2D g;
    int x;
    int y;
    int h;
    int w;
    int windowRows;
    int windowCols;
    Color houseColor;

    public HighTower(Graphics2D g, int x, int y, int h, int w, int windowRows, int windowCols, Color houseColor) {
        this.g = g;
        this.x = x;
        this.y = y;
        this.h = h;
        this.w = w;
        this.windowRows = windowRows;
        this.windowCols = windowCols;
        this.houseColor = houseColor;
    }

    @Override
    public void draw(Graphics2D g) {
        g.setColor(houseColor);
        g.fillRect(x,y,w,h);
        int windowWidTotal = (int)(w * 0.9);
        int windowStepW = windowWidTotal / (windowCols * 2);
        int windowHeightTotal = (int)(h * 0.8);
        int windowStepH = windowHeightTotal / (windowRows * 2);
        System.out.println("Ws = " + windowStepW);
        System.out.println("Hs = " + windowStepH);
        g.setColor(new Color(0xC5D641));
        for (int i = 0; i < windowRows; i++) {
            for (int j = 0; j < windowCols; j++) {
                g.fillRect((int)(x + 0.05*w + windowStepW*0.5 + 2*windowStepW*j), (int)(y+h*0.1 + windowStepH*0.5 + 2*windowStepH*i),windowStepW,20);
            }
        }

    }
}
