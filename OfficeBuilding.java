/*
Draws office buildings
inheriting from the Building class
*/


import java.awt.*;
import java.applet.*;
import java.util.*;


public class OfficeBuilding extends Building
{
   private Color buildingColor;
   
   public OfficeBuilding(double size, int x, int y, Color color)
   {
      super(size, x, y, color);
      buildingColor = color;
   }
   
   /*MAKE ALL OFFICE BUILDINGS SAME COLOR*/
   public void buildingTop(Graphics g)
   {
      g.setColor(buildingColor);
      g.fillRect(buildingX, buildingY-(int)(75.0*buildingSize), (int)(100*buildingSize), (int)(75*buildingSize));
   }
   
   public void buildingWindowsTop(Graphics g)
   {
      Windows windowsTop = new Windows(buildingSize, buildingX, buildingY-(int)(75.0*buildingSize));
      windowsTop.pane1(g);
      windowsTop.pane2(g);
   }
}