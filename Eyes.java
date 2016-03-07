/*
Creates Eyes
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Eyes
{
   private int eyeX;
   private int eyeY;
   
   public Eyes(int x, int y)
   {
      eyeX = x;
      eyeY = y;
   }
   
   public void drawEyes(Graphics g)
   {
      g.setColor(Color.white);
      g.fillOval(eyeX+15, eyeY+33, 25, 25);
      g.fillOval(eyeX+60, eyeY+33, 25, 25);
      
      g.setColor(Color.black);
      g.fillOval(eyeX+23, eyeY+41, 10, 10);
      g.fillOval(eyeX+68, eyeY+41, 10, 10);
   }
}