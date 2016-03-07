/*
This class draws the People of the Town.
They are random colors and random Shapes
with Bodies and Eyes
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class People extends Shapes
{
   protected Color bodyColor;
   
   public People(int bodyX, int bodyY, Color bodyC, double bodyType)
   {
      super(bodyX, bodyY, bodyType);
      bodyColor = bodyC;
   }
   
   public void drawPeople(Graphics g)
   {
      g.setColor(bodyColor);
      
      if(bodyType<0.33){
         g.fillRect(bodyX, bodyY, 100, 100);
      }else{
         if(bodyType<0.66){
            g.fillOval(bodyX, bodyY, 100, 100);
         }else{
            Polygon triangle = new Polygon();
            triangle.addPoint(bodyX+50, bodyY);
            triangle.addPoint(bodyX+100, bodyY+100);
            triangle.addPoint(bodyX, bodyY+100);
            g.fillPolygon(triangle);
         }
      }
      
      drawEyes(g);
   }
   
   public int getX()
   {
      return bodyX;
   }
   
   public Color getBodyColor()
   {
      return bodyColor;
   }
   
   public double getBodyType()
   {
      return bodyType;
   }
}