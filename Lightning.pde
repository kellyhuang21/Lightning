int startX=150; 
int startY=0; 
int endX=0; 
int endY=300;
int count;

void setup()
{
  size(300,300);
  background(0);
  strokeWeight(3);
  frameRate(10);

}
void draw()
{

	lightning();
	lightning2();
	// startX=150; 
	// startY=0; 
	// endX=0; 
	// endY=150;
	// fill(0);
	// rect(0,0,width,height);
	// lightning();	
	
}
void mousePressed()
{
	
	startX=150; 
	startY=0; 
	endX=0; 
	endY=150;
	fill(0);
	rect(0,0,width,height);

}

void lightning(){
	
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
void lightning2(){
	
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