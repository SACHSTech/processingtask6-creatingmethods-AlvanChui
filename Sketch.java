import processing.core.PApplet;

public class Sketch extends PApplet 
{
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() 
  {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() 
  {
    background(210, 255, 173);
  }
  //the main program that executes the methods
  public void draw()
  {
    drawSnowman(100, 175, 255, 255, 255);
    drawSun(width-10, 0, 100);
    drawFloor(-1, height*95/100, width+1, height+1);
    drawSnowman(200, centerValue(200), 255, 255, 255);
  }
  
  /* FloorX: x-coordinate of starting point (top left angle) of the floor
   * FloorY: y-coordinate of starting point (top left angle) of the floor
   * FloorWidth: the width of the floor
   * FloorHeight: the height of the floor
   */
  private void drawFloor(float FloorX, float FloorY, float FloorWidth, float FloorHeight)
  {
    fill(255);
    rect(FloorX, FloorY, FloorWidth, FloorHeight);
  }
  /* SunX: the x-coordinate of the center point of the sun
   * SunY: the y-coordinate of the center point of the sun
   * SunSize: the radius of the sun
   */
  private void drawSun(float SunX, float SunY, float SunSize)
  {
    fill(255, 127, 0);
    ellipse(SunX, SunY, SunSize, SunSize);
  }
  /* x: x-coordinades of Snownman
   * y: y-coordinades of Snownman
   * colorR: color (red) value of snowman
   * colorG: color (green) value of snowman
   * colorB: color (blue) value of snowman
   */
  private void drawSnowman(float x, float y, float colorR, float colorG, float colorB)
  {
    fill(colorR, colorG, colorB);
    ellipse(x, y, width / 4, height / 4);
    fill(colorR, colorG, colorB);
    ellipse(x, y + height / 3, width * 5 / 12, height * 5 / 12);
    fill(0,0,0);
    rect(x - width / 150, y + height * 7 / 30, width / 75, height / 60);
    fill(0,0,0);
    rect(x - width / 150,y + height * 17 / 60, width / 75, height / 60);
    fill(0,0,0);
    rect(x - width / 150, y + height / 3, width / 75, height / 60);
    fill(255 - colorR/2, 255 - colorG/2, 255 - colorB/2);
    ellipse(x - width / 20, y - height / 40, width / 40, height / 40);
    fill(255 - colorR/2, 255 - colorG/2, 255 - colorB/2);
    ellipse(x + width / 20, y - height / 40, width / 40, height / 40);
    fill(255, 0, 0);
    triangle(x - width/6, y - height / 12, x + width / 6, y- height / 12, x, y - height * 11 / 60);
  }
  /* dimension: y-coordinates of of the Snowman
   * returned value: the center of the drawing
   */
  private float centerValue(float dimension) 
  {
    return dimension - height/6; 
  }
}