package exercises.exercise_1.code_2;

import processing.core.*;

public class Code_2_1 extends PApplet {
  public static void main(String args[]) {
    PApplet.main("exercises.exercise_1.code_2.Code_2_1");
  }

  public void settings() {
    size(400, 400);
  }

  public void setup() {}

  public void draw() {
    float x1 = 100, y1 = 100;
    float x2 = 300, y2 = 250;
    float x3 = 100, y3 = 250;
    triangle(x1, y1, x2, y2, x3, y3);
  }
}
