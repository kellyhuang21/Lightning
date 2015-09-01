int startX=0; 
int startY=300; 
int endX=0; 
int endY=300;


void setup()
{
  size(300,300);
  strokeWeight(5);
  background(0);
}
void draw()
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
void mousePressed()
{
	startX=0; 
	startY=300; 
	endX=0; 
	endY=300;

}

