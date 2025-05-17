package exercises.exercise_1.code_2;

import processing.core.PApplet;

public class Code_2_4 extends PApplet {
  float x1 = 100, y1 = 100;
  float x2 = 300, y2 = 250;
  float x3 = 100, y3 = 250;

  public static void main(String args[]) {
    PApplet.main("exercises.exercise_1.code_2.Code_2_4");
  }

  public void settings() {
    size(500, 500);
  }

  public void setup() {
    noLoop();
  }

  public void draw() {
    transform();
    triangle(x1, y1, x2, y2, x3, y3);
  }

  public void transform() {
    float angle = (PI / 6);

    float x1r = x1 * cos(angle) - y1 * sin(angle);
    float y1r = x1 * sin(angle) + y1 * cos(angle);

    float x2r = x2 * cos(angle) - y2 * sin(angle);
    float y2r = x2 * sin(angle) + y2 * cos(angle);

    float x3r = x3 * cos(angle) - y3 * sin(angle);
    float y3r = x3 * sin(angle) + y3 * cos(angle);

    x1 = x1r;
    y1 = y1r;
    x2 = x2r;
    y2 = y2r;
    x3 = x3r;
    y3 = y3r;
  }
}
