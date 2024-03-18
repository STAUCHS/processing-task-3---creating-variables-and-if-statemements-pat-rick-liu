import java.util.Random;

import processing.core.PApplet;

public class Sketch extends PApplet {
	
  public void settings() {
	// put your size call here
    size(1000, 500);
  }

  // Variables
  int intHeight;
  int intWidth;
  public void setup() {
    surface.setResizable(true);
	  
    // Random x and y values
    Random myRandom = new Random();
  intHeight = myRandom.nextInt(height/7);
  intWidth = myRandom.nextInt(width/5);

  if (intWidth %2 == 1 ){
    intWidth *= -1;
  }
  
  }
  public void draw() {

    // Ratio Variables 
  float floatWidthRatio = (float)(width)/900;
  float floatHeightRatio = (float)(height)/500;

  // Background changer
  if(intWidth <= 100 && intHeight <= 35)
     {
          background(61, 73, 102);
     }
     else if(intWidth > 100 && intHeight <= 35)
     {
          background(179, 188, 209);
     }
     else if(intWidth <= 100 && intHeight > 35)
     {
          background(217, 21, 240);
     }
     else
          background(17, 150, 189);
     {
  }

    // The house base + features
    fill(136, 140, 141);
    noStroke();
    rect(300 * floatWidthRatio - intWidth, 275 * floatHeightRatio - intHeight, 400 * floatWidthRatio, 250 * floatHeightRatio);  

    // Door
    fill(161, 102, 47); 
    rect(475 * floatWidthRatio - intWidth, 425 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 100 * floatHeightRatio); 

      // Windows
      fill(251, 200, 56); 
      stroke(161, 102, 47); 
      rect(390 * floatWidthRatio - intWidth, 300 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 50 * floatHeightRatio);
      line(415 * floatWidthRatio - intWidth, 300 * floatHeightRatio - intHeight, 415 * floatWidthRatio - intWidth, 350 * floatHeightRatio - intHeight);
      line(390 * floatWidthRatio - intWidth, 325 * floatHeightRatio - intHeight, 440 * floatWidthRatio - intWidth, 325 * floatHeightRatio - intHeight);
      // Window 2
      rect(560 * floatWidthRatio - intWidth, 300 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 50 * floatHeightRatio);
      line(585 * floatWidthRatio - intWidth, 300 * floatHeightRatio - intHeight, 585 * floatWidthRatio - intWidth, 350 * floatHeightRatio - intHeight);
      line(560 * floatWidthRatio - intWidth, 325 * floatHeightRatio - intHeight, 610 * floatWidthRatio - intWidth, 325 * floatHeightRatio - intHeight);
      // Window 3
      rect(390 * floatWidthRatio - intWidth, 425 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 50 * floatHeightRatio);
      line(415 * floatWidthRatio - intWidth, 425 * floatHeightRatio - intHeight, 415 * floatWidthRatio - intWidth, 475 * floatHeightRatio - intHeight);
      line(390 * floatWidthRatio - intWidth, 450 * floatHeightRatio - intHeight, 440 * floatWidthRatio - intWidth, 450 * floatHeightRatio - intHeight);
      // Window 4
      rect(560 * floatWidthRatio - intWidth, 425 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 50 * floatHeightRatio);
      line(585 * floatWidthRatio - intWidth, 425 * floatHeightRatio - intHeight, 585 * floatWidthRatio - intWidth, 475 * floatHeightRatio - intHeight);
      line(560 * floatWidthRatio - intWidth, 450 * floatHeightRatio - intHeight, 610 * floatWidthRatio - intWidth, 450 * floatHeightRatio - intHeight);
    
      // Pillars
      fill(161, 102, 47); 
      noStroke();
      rect(300 * floatWidthRatio - intWidth, 380 * floatHeightRatio - intHeight, 400 * floatWidthRatio, 20 * floatHeightRatio);
      rect(325 * floatWidthRatio - intWidth, 270 * floatHeightRatio - intHeight, 25 * floatWidthRatio, 255 * floatHeightRatio);
      rect(650 * floatWidthRatio - intWidth, 270 * floatHeightRatio - intHeight, 25 * floatWidthRatio, 255 * floatHeightRatio);
  
      // Smoke
      fill(254);
      ellipse(350 * floatWidthRatio - intWidth, 120 * floatHeightRatio - intHeight, 50 * floatWidthRatio, 50 * floatHeightRatio);
      ellipse(365 * floatWidthRatio - intWidth, 130 * floatHeightRatio - intHeight, 40 * floatWidthRatio, 40 * floatHeightRatio);
      ellipse(370 * floatWidthRatio - intWidth, 95 * floatHeightRatio - intHeight, 30 * floatWidthRatio, 30 * floatHeightRatio);

      // Chimney
      fill(161, 102, 47);
      beginShape();
      vertex(350 * floatWidthRatio - intWidth, 275 * floatHeightRatio - intHeight);
      vertex(350 * floatWidthRatio - intWidth, 150 * floatHeightRatio - intHeight);
      vertex(400 * floatWidthRatio - intWidth, 150 * floatHeightRatio - intHeight);
      vertex(400 * floatWidthRatio - intWidth, 275 * floatHeightRatio - intHeight);
      endShape(CLOSE);

    // Roof
    triangle(250 * floatWidthRatio - intWidth, 275 * floatHeightRatio - intHeight, 500 * floatWidthRatio - intWidth, 125 * floatHeightRatio - intHeight,750 * floatWidthRatio - intWidth, 275 * floatHeightRatio - intHeight);
  
    // Sun
    fill(254, 254, 40);
    ellipse(150*width/1000, 100*height/500, 100*width/1000, 100*height/500);
  
    // Display current time
    int hr = hour();
    int min = minute();

    fill(0);
    textSize(30);
    text(hr, 20 * floatWidthRatio, 50 * floatHeightRatio);
    text(min, 20 * floatWidthRatio, 80 * floatHeightRatio); 
  }
}
