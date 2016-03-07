/*
This class will draw the Town which
is composed of Buildings with Windows
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Town
{
   private double buildingSize;
   private int buildingX;
   private int buildingY;
   private boolean flag;
   private Color buildingColor;
   
   public Town(double size, int x, int y, boolean office, Color color)
   {
      buildingSize = size;
      buildingX = x;
      buildingY = y;
      flag = office;
      buildingColor = color;
   }
   
   public static void drawRoad(Graphics g)
   {
      g.setColor(new Color(26, 26, 26));
      g.fillRect(0, 500, 1240, 800);
      
      g.setColor(new Color(229, 230, 0));
      for(int i=0; i<1240; i+=50)
      {
         g.fillRect(i, 600, 25, 10);
      }
   }
   
   public static void drawGrass(Graphics g)
   {
      g.setColor(Color.green);
      g.fillRect(0, 300, 1240, 200);
   }
   
   public double getBuildingSize()
   {
      return buildingSize;
   }
   
   public void drawBuilding(Graphics g)
   {
      if(flag){
         Building building = new Building(buildingSize, buildingX, buildingY, buildingColor);
         building.building(g);
         building.buildingWindows(g);
      }else{
         OfficeBuilding building = new OfficeBuilding(buildingSize, buildingX, buildingY, buildingColor);
         building.building(g);
         building.buildingWindows(g);
         building.buildingTop(g);
         building.buildingWindowsTop(g);
      }
   }
}