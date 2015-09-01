import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

int startX=0; 
int startY=300; 
int endX=0; 
int endY=300;


public void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);
}
public void draw()
{
	
		int i=0;
     	while(endX<300){
		endX=startX+(int)(Math.random()*9);
		endY=startY+(int)(Math.random()*18)-9;

		stroke((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		line(startX, startY, endX, endY);
		startX=endX; 
		startY=endY;
	}
}
public void mousePressed()
{
	startX=0; 
	startY=300; 
	endX=0; 
	endY=300;

}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
