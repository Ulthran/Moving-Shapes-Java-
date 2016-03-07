/*
This class draws the Sun and composes
the Sky with Clouds
*/


import java.awt.*;
import java.applet.*;
import java.util.*;


public class Sun
{
   public static void drawSun(Graphics g)
   {
      g.setColor(Color.yellow);
      g.fillOval(-75, -75, 150, 150);
      
      g.setColor(Color.orange);
      g.drawLine(80, 10, 110, 15);
      g.drawLine(75, 30, 100, 40);
      g.drawLine(65, 50, 90, 65);
      g.drawLine(50, 65, 70, 85);
      g.drawLine(30, 75, 40, 100);
      g.drawLine(10, 80, 15, 105);
   }
}