/*
Creates Bodies
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Body
{
   protected int bodyX;
   protected int bodyY;
   
   public Body(int x, int y)
   {
      bodyX = x;
      bodyY = y;
   }
   
   public void drawBody(Graphics g)
   {
      
   }
   
   public void drawEyes(Graphics g)
   {
      Eyes eyes = new Eyes(bodyX, bodyY);
      
      eyes.drawEyes(g);
   }
}