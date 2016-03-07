/*
Draws the Clouds to compose the Sky
with the Sun
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Clouds
{
   public static void drawClouds(Graphics g)
   {
      g.setColor(Color.white);
      
      /* CLOUD ONE */
      g.fillOval(250, 20, 100, 100);
      g.fillOval(200, 30, 100, 100);
      g.fillOval(270, 25, 75, 75);
      g.fillOval(290, 15, 100, 75);
      g.fillOval(310, 60, 100, 75);
      
      /* CLOUD TWO */
      g.fillOval(570, 20, 100, 100);
      g.fillOval(630, 30, 100, 100);
      g.fillOval(620, 25, 75, 75);
      g.fillOval(650, 15, 100, 75);
      g.fillOval(600, 60, 100, 75);
   }
}