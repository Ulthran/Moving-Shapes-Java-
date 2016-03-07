// Lab10vst.java

// The Lab10 graded assignment is open ended.
// There is no provided student version for starting, nor are there
// any files with solutions for the different point versions.

// Check the Lab assignment document for additional details.

/*
Charlie Bushman
Composition of Buildings with Windows
Composition of Bodies with Eyes
Composition of Sky with Clouds and Sun
Composition of Town with Buildings and Office Buildings
Office Buildings inherits from Buildings
People inherits from Shapes which inherits from Body
*/


import java.awt.*;
import java.applet.*;
import java.util.*;


public class Lab10vst extends Applet
{
   double buildingSize1 = Math.random()+1;
   double buildingSize2 = Math.random()+1;
   double buildingSize3 = Math.random()+1;
   double buildingSize4 = Math.random()+1;
   double buildingSize5 = Math.random()+1;
   double buildingSize6 = Math.random()+1;
   double buildingSize7 = Math.random()+1;
   double buildingSize8 = Math.random()+1;
   double buildingSize9 = Math.random()+1;
   double buildingSize10 = Math.random()+1;
   double buildingSize11 = Math.random()+1;
   double buildingSize12 = Math.random()+1;
   double buildingSize13 = Math.random()+1;
   
   boolean[] flags = new boolean[13];
   
   Color buildingColor1 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor2 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor3 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor4 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor5 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor6 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor7 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor8 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor9 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor10 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor11 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor12 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   Color buildingColor13 = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
   
   public void paint(Graphics g)
   {         
      for(int i=0;i<13;i++)
      {
         if(Math.random()>0.5){
            flags[i] = true;
         }else{
            flags[i] = false;
         }
      }
      
      sky(g);
            
      //windowsTest(g);
      
      //buildingTest(g);
      
      town(g);
      
      //eyesTest(g);
      
      //bodyTest(g);
      
      //shapesTest(g);
      
      people(g);
   }
   
   
   //Dras the skie
   public void sky(Graphics g)
   {
      Sky sky1 = new Sky();
      
      sky1.drawSky(g);
      sky1.drawSun(g);
      sky1.drawClouds(g);
   }
   
   //maks bill dings
   public void town(Graphics g)
   {      
      Town.drawRoad(g);
      
      Town.drawGrass(g);
      
      /*All 'dem buildins'*/
      
      Town building1 = new Town(buildingSize1, 0, 300, flags[0], buildingColor1);
      
      Town building2 = new Town(buildingSize2, 100, 300, flags[1], buildingColor2);
      
      Town building3 = new Town(buildingSize3, 200, 300, flags[2], buildingColor3);
      
      Town building4 = new Town(buildingSize4, 300, 300, flags[3], buildingColor4);
      
      Town building5 = new Town(buildingSize5, 400, 300, flags[4], buildingColor5);
      
      Town building6 = new Town(buildingSize6, 500, 300, flags[5], buildingColor6);
      
      Town building7 = new Town(buildingSize7, 600, 300, flags[6], buildingColor7);
      
      Town building8 = new Town(buildingSize8, 700, 300, flags[7], buildingColor8);
      
      Town building9 = new Town(buildingSize9, 800, 300, flags[8], buildingColor9);
      
      Town building10 = new Town(buildingSize10, 900, 300, flags[9], buildingColor10);
      
      Town building11 = new Town(buildingSize11, 1000, 300, flags[10], buildingColor11);
      
      Town building12 = new Town(buildingSize12, 1100, 300, flags[11], buildingColor12);
      
      Town building13 = new Town(buildingSize13, 1200, 300, flags[12], buildingColor13);
      
      double[] buildings = {buildingSize1, buildingSize2, buildingSize3, buildingSize4, buildingSize5,
      buildingSize6, buildingSize7, buildingSize8, buildingSize9, buildingSize10, buildingSize11,
      buildingSize12, buildingSize13};
      double placeHolder = 0.0;
      
      //bubble sort the building sizes in ascending order
      for(int i=1; i>0; i--)
      {
         for(int j=0; j<12; j++)
         {
            if(buildings[j]>buildings[j+1]){
               placeHolder = buildings[j];
               buildings[j] = buildings[j+1];
               buildings[j+1] = placeHolder;
               i=+3;
            }
         }
         System.out.println(i);
      }
      
      System.out.println(buildings[0]+" "+buildings[1]+" "+buildings[2]+" "+buildings[3]+" "+buildings[4]+" "+buildings[5]+" "+buildings[6]+" "+buildings[7]+" "+buildings[8]+" "+buildings[9]+" "+buildings[10]+" "+buildings[11]+" "+buildings[12]);
      System.out.println(building1.getBuildingSize()+" "+building2.getBuildingSize());
      System.out.println(buildingSize1+" "+buildingSize2+" "+buildingSize3+" "+buildingSize4+" "+buildingSize5+" "+buildingSize6+" "+buildingSize7+" "+buildingSize8+" "+buildingSize9+" "+buildingSize10+" "+buildingSize11+" "+buildingSize12+" "+buildingSize13);
      
      //print the buildings in ascending size
      for(int i=0;i<13;i++)
      {
         if(building1.getBuildingSize() == buildings[i]){
            building1.drawBuilding(g);
         }
         if(building2.getBuildingSize() == buildings[i]){
            building2.drawBuilding(g);
         }
         if(building3.getBuildingSize() == buildings[i]){
            building3.drawBuilding(g);
         }
         if(building4.getBuildingSize() == buildings[i]){
            building4.drawBuilding(g);
         }
         if(building5.getBuildingSize() == buildings[i]){
            building5.drawBuilding(g);
         }
         if(building6.getBuildingSize() == buildings[i]){
            building6.drawBuilding(g);
         }
         if(building7.getBuildingSize() == buildings[i]){
            building7.drawBuilding(g);
         }
         if(building8.getBuildingSize() == buildings[i]){
            building8.drawBuilding(g);
         }
         if(building9.getBuildingSize() == buildings[i]){
            building9.drawBuilding(g);
         }
         if(building10.getBuildingSize() == buildings[i]){
            building10.drawBuilding(g);
         }
         if(building11.getBuildingSize() == buildings[i]){
            building11.drawBuilding(g);
         }
         if(building12.getBuildingSize() == buildings[i]){
            building12.drawBuilding(g);
         }
         if(building13.getBuildingSize() == buildings[i]){
            building13.drawBuilding(g);
         }
      }
   }
   
   public void people(Graphics g)
   {
      People[] people = new People[5];
      Color bodyColor;
      double bodyType;
      
      for(int i=0; i<5; i++)
      {      
      int x;
      bodyColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
      bodyType = Math.random();
      
      x = (int)(Math.random()*500);
      
      people[i] = new People(x, 500, bodyColor, bodyType);
      }
      
      int personXMin = Math.min(Math.min(Math.min(Math.min(people[0].getX(), people[1].getX()), people[2].getX()), people[3].getX()), people[4].getX());
      double[] increments = {(Math.random()+1)*5, (Math.random()+1)*5, (Math.random()+1)*5, (Math.random()+1)*5, (Math.random()+1)*5};
      
      for(int j=personXMin; j<1300; )
      {
		   for(int i=0; i<5; i++)
         {
         j=people[i].getX();
         j+=increments[i];
         
         people[i] = new People(j, 500, people[i].getBodyColor(), people[i].getBodyType());
         people[i].drawPeople(g);
         }
         
         long startDelay = System.currentTimeMillis();
		   long endDelay = 0;
		   while (endDelay - startDelay < 50){
			endDelay = System.currentTimeMillis();
         }
         
         personXMin = Math.min(Math.min(Math.min(Math.min(people[0].getX(), people[1].getX()), people[2].getX()), people[3].getX()), people[4].getX());
         j = personXMin;
         town(g);
      }
   }
   
   //does the windows work?
   public void windowsTest(Graphics g)
   {
      Windows windowTest = new Windows(1.5, 450, 100);
      
      windowTest.pane1(g);
      windowTest.pane2(g);
   }
   
   //do da billdins draw?
   public void buildingTest(Graphics g)
   {
      Building buildingTest = new Building(1.5, 100, 200, Color.black);
      
      buildingTest.building(g);
      buildingTest.buildingWindows(g);
   }
   
   public void eyesTest(Graphics g)
   {
      Eyes eyesTest = new Eyes(400, 500);
      
      eyesTest.drawEyes(g);
   }
   
   public void bodyTest(Graphics g)
   {
      Body bodyTest = new Body(400, 500);
      
      bodyTest.drawBody(g);
      bodyTest.drawEyes(g);
   }
   
   public void shapesTest(Graphics g)
   {
      Shapes shapesTest = new Shapes(400, 500, Math.random());
      
      shapesTest.drawBody(g);
      shapesTest.drawEyes(g);
   }
}