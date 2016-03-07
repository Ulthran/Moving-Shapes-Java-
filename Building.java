/*
This class draws the buildings themselves
without adornment
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 

//buildingSize is a random double (between 1&2) that is passed into Building and Windows
//buildingX and buildingY are the top left coordinates of each building
//also passed into Building and Window
//buildings will be (100*buildingSize) wide and (75*buildingSize) tall

public class Building
{
   protected double buildingSize;
   protected int buildingX;
   protected int buildingY;
   protected Color buildingColor;
   
   public Building(double size, int x, int y, Color color)
   {
      buildingSize = size;
      buildingX = x;
      buildingY = y;
      buildingColor = color;
   }
   
   public void building(Graphics g)
   {     
      g.setColor(buildingColor);
      g.fillRect(buildingX, buildingY, (int)(100*buildingSize), (int)(75*buildingSize));
   }
   
   public void buildingWindows(Graphics g)
   {
      Windows windows = new Windows(buildingSize, buildingX, buildingY);
      windows.pane1(g);
      windows.pane2(g);
   }
}