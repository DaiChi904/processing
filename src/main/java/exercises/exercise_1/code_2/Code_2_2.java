package exercises.exercise_1.code_2;

import processing.core.PApplet;

public class Code_2_2 extends PApplet {
  int x1 = 100, y1 = 100;
  int x2 = 300, y2 = 250;
  int x3 = 100, y3 = 250;
  int tx = 300, ty = 400;

  public static void main(String args[]) {
    PApplet.main("exercises.exercise_1.code_2.Code_2_2");
  }

  public void settings() {
    size(1000, 1000);
  }

  public void setup() {}

  public void draw() {
    transform();
    triangle(x1, y1, x2, y2, x3, y3);
  }

  public void transform() {
    x1 = x1 + tx;
    y1 = y1 + ty;

    x2 = x2 + tx;
    y2 = y2 + ty;

    x3 = x3 + tx;
    y3 = y3 + ty;
  }
}
