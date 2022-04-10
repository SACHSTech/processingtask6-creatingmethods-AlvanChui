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
  //declare locations
  float X_Value_lvl2 = random(width);
  float Y_Value_lvl2 = random(height);
  float X_Value_lvl3 = random(width);
  float Y_Value_lvl3 = random(height);
  float colorR = random(255);
  float colorG = random(255);
  float colorB = random(255);
  public void draw()
  {
    drawSnowman_lvl2(X_Value_lvl2, Y_Value_lvl2);
    drawSnowman_lvl3(X_Value_lvl3, Y_Value_lvl3, colorR, colorG, colorB);
    X_Value_lvl4(width/2, height/2);
  }
  //level 2
  private void drawSnowman_lvl2(float x, float y)
  {
    fill(255);
    ellipse(x, y, width / 4, height / 4);
    fill(255);
    ellipse(x, y + height / 3, width * 5 / 12, height * 5 / 12);
    fill(0);
    rect(x - width / 150, y + height * 7 / 30, width / 75, height / 60);
    fill(0);
    rect(x - width / 150,y + height * 17 / 60, width / 75, height / 60);
    fill(0);
    rect(x - width / 150, y + height / 3, width / 75, height / 60);
    fill(127);
    ellipse(x - width / 20, y - height / 40, width / 40, height / 40);
    fill(127);
    ellipse(x + width / 20, y - height / 40, width / 40, height / 40);
    fill(255, 0, 0);
    triangle(x - width/6, y - height / 12, x + width / 6, y- height / 12, x, y - height * 11 / 60);
  }
  //level 3
  private void drawSnowman_lvl3(float x, float y, float colorR, float colorG, float colorB)
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
    fill((255 - colorR) * 3/2, (255 - colorG) * 3/2, (255 - colorB) * 3/2);
    ellipse(x - width / 20, y - height / 40, width / 40, height / 40);
    fill((255 - colorR) * 3/2, (255 - colorG) * 3/2, (255 - colorB) * 3/2);
    ellipse(x + width / 20, y - height / 40, width / 40, height / 40);
    fill((255 - colorR) * 2, (255 - colorG) * 2, (255 - colorB) * 2);
    triangle(x - width/6, y - height / 12, x + width / 6, y- height / 12, x, y - height * 11 / 60);
  }
  //level 4
  private float X_Value_lvl4(float x, float y) 
  {
    return (x - width / 4); 
  }
}