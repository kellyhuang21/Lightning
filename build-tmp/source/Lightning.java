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

int startX=150; 
int startY=0; 
int endX=0; 
int endY=300;
int count;
double randomLightning;

public void setup()
{
  size(300,300);
  background(0);
  strokeWeight(2);
  frameRate(5);

}
public void draw()
{

	startX=150; 
	startY=0; 
	endX=0; 
	endY=150;
	fill(0);
	rect(0,0,width,height);
	lightning();
	if (Math.random() <.5f){
	startX=140; 
	startY=0; 
	endX=0; 
	endY=150;
	lightning();
}
	randomLightning = Math.random();
	if (randomLightning <.2f){
	startX=160; 
	startY=0; 
	endX=0; 
	endY=150;
	lightning();
}
	
}
public void mousePressed()
{
	
	startX=150; 
	startY=0; 
	endX=0; 
	endY=150;
	fill(0);
	rect(0,0,width,height);

}

public void lightning(){
	
	int i=0;
     	while(endY<300){
		endX=startX+(int)(Math.random()*20)-10;
		endY=startY+(int)(Math.random()*9);

		stroke(195, (int)(Math.random()*145)+110, 55);
		line(startX, startY, endX, endY);
		startX=endX; 
		startY=endY;
	

	}
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
