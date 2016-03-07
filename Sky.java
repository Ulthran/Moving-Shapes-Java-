/*Charlie Bushman
Called by Lab07st
Creates a sky with clouds and a sun
Contains 3 methods*/

import java.awt.*;
import java.applet.*;
import java.util.*; 

public class Sky
{
   public Sky()
   {
      //borign stufs
   }
   
   public void drawSky(Graphics g)
   {
      g.setColor(new Color(0, 150, 255));
      g.fillRect(0, 0, 1240, 300);
   }
   
   public void drawSun(Graphics g)
   {
      Sun.drawSun(g);
   }
   
   public void drawClouds(Graphics g)
   {
      Clouds.drawClouds(g);
   }
}