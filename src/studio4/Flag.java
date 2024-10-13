package studio4;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
    
    public static void drawFlag() {
        StdDraw.clear();

        
        StdDraw.setPenColor(255, 255, 255); 
        StdDraw.filledRectangle(2.75, 8, 2.75, 8); 
        StdDraw.filledRectangle(19.25, 8, 2.75, 8);
        StdDraw.setPenColor(255, 0, 0); 
        StdDraw.filledRectangle(11, 8, 5.5, 8); 
        // draw petal
        double centerX = 11; 
        double centerY = 8;  
        
        StdDraw.setPenColor(255, 255, 255); 
        StdDraw.filledCircle(centerX, centerY, 1);
        StdDraw.setPenColor(255, 204, 0); 
        for (int i = 0; i < 5; i++) {
            double angle = Math.toRadians(72 * i); 
            double petalX = centerX + 2 * Math.cos(angle);
            double petalY = centerY + 2 * Math.sin(angle);
            StdDraw.filledCircle(petalX, petalY, 1.2);
        }
    }

    public static void main(String[] args) {
        StdDraw.setXscale(0, 22);
        StdDraw.setYscale(0, 16);
        StdDraw.setCanvasSize(512, 512);
        drawFlag(); 
    }
}