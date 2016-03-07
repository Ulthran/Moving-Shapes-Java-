/*
Creates different Shapes with Eyes
and Bodies
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Shapes extends Body
{
   protected double bodyType;
   
   public Shapes(int bodyX, int bodyY, double bodyT)
   {
      super(bodyX, bodyY);
      bodyType = bodyT;
   }   
   
   public void drawBody(Graphics g)
   {      
      g.setColor(Color.red);
      
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
   }
}