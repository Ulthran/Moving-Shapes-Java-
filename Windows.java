/*
This class draws the Windows on the
Buildings
*/


import java.awt.*;
import java.applet.*;
import java.util.*; 


public class Windows
{
   private double buildingWidthDouble;
   private double buildingHeightDouble;
   private double windowSizeDouble;
   private int buildingX;
   private int buildingY;
   
   public Windows(double size, int x, int y)
   {
      windowSizeDouble = size;
      buildingX = x;
      buildingY = y;
      buildingWidthDouble = size * 100;
      buildingHeightDouble = size * 75;
   }
   
   public void pane1(Graphics g)
   {
      int windowX = buildingX+((int)(10.0*windowSizeDouble));
      int windowY = buildingY+((int)(10.0*windowSizeDouble));
      int windowWidth = (int)((1.0/2.0)*buildingWidthDouble)-(int)(20.0*windowSizeDouble);
      int windowHeight = ((int)((2.0/3.0)*buildingHeightDouble));
      
      int crossHairTopX = buildingX+(int)((1.0/4.0)*buildingWidthDouble);
      int crossHairTopY = buildingY+(int)(10.0*windowSizeDouble);
      int crossHairBottomX = buildingX+(int)(1.0/4.0*buildingWidthDouble);
      int crossHairBottomY = buildingY+((int)(10.0*windowSizeDouble))+(int)((2.0/3.0)*buildingHeightDouble);
      
      int crossHairLeftX = buildingX+((int)(10.0*windowSizeDouble));
      int crossHairLeftY = buildingY+(int)((1.0/3.0)*buildingHeightDouble)+(int)(10.0*windowSizeDouble);
      int crossHairRightX = buildingX+(int)((1.0/2.0)*buildingWidthDouble)-((int)(10.0*windowSizeDouble));
      int crossHairRightY = buildingY+(int)((1.0/3.0)*buildingHeightDouble)+(int)(10.0*windowSizeDouble);
      
      //dras da winda'
      g.setColor(new Color(229, 255, 255));
      g.fillRect(windowX, windowY, windowWidth, windowHeight);
           
      //dras da croshares
      g.setColor(Color.black);
      g.drawLine(crossHairTopX, crossHairTopY, crossHairBottomX, crossHairBottomY);
      g.drawLine(crossHairLeftX, crossHairLeftY, crossHairRightX, crossHairRightY);
   }
   
   public void pane2(Graphics g)
   {
      int windowX = buildingX+((int)(10.0*windowSizeDouble))+(int)((1.0/2.0)*buildingWidthDouble);
      int windowY = buildingY+((int)(10.0*windowSizeDouble));
      int windowWidth = (int)((1.0/2.0)*buildingWidthDouble)-(int)(20.0*windowSizeDouble);
      int windowHeight = ((int)((2.0/3.0)*buildingHeightDouble));
      
      int crossHairTopX = buildingX+(int)((1.0/4.0)*buildingWidthDouble)+(int)((1.0/2.0)*buildingWidthDouble);
      int crossHairTopY = buildingY+(int)(10.0*windowSizeDouble);
      int crossHairBottomX = buildingX+(int)(1.0/4.0*buildingWidthDouble)+(int)((1.0/2.0)*buildingWidthDouble);
      int crossHairBottomY = buildingY+((int)(10.0*windowSizeDouble))+(int)((2.0/3.0)*buildingHeightDouble);
      
      int crossHairLeftX = buildingX+((int)(10.0*windowSizeDouble))+(int)((1.0/2.0)*buildingWidthDouble);
      int crossHairLeftY = buildingY+(int)((1.0/3.0)*buildingHeightDouble)+(int)(10.0*windowSizeDouble);
      int crossHairRightX = buildingX+(int)((1.0/2.0)*buildingWidthDouble)-((int)(10.0*windowSizeDouble))+(int)((1.0/2.0)*buildingWidthDouble);
      int crossHairRightY = buildingY+(int)((1.0/3.0)*buildingHeightDouble)+(int)(10.0*windowSizeDouble);
      
      //dras da winda'
      g.setColor(new Color(229, 255, 255));
      g.fillRect(windowX, windowY, windowWidth, windowHeight);
      
      //draws da croshares
      g.setColor(Color.black);
      g.drawLine(crossHairTopX, crossHairTopY, crossHairBottomX, crossHairBottomY);
      g.drawLine(crossHairLeftX, crossHairLeftY, crossHairRightX, crossHairRightY);
   }
}