package exercises.exercise_1.code_2;

import processing.core.PApplet;

public class Code_2_3 extends PApplet {
  float x1 = 100, y1 = 100;
  float x2 = 300, y2 = 250;
  float x3 = 100, y3 = 250;
  float sx = 1.25f, sy = 0.75f;

  public static void main(String args[]) {
    PApplet.main("exercises.exercise_1.code_2.Code_2_3");
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
    float[] res = getCenter();
    float cx = res[0];
    float cy = res[1];

    x1 = (x1 - cx) * sx + cx;
    y1 = (y1 - cy) * sy + cy;

    x2 = (x2 - cx) * sx + cx;
    y2 = (y2 - cy) * sy + cy;

    x3 = (x3 - cx) * sx + cx;
    y3 = (y3 - cy) * sy + cy;
  }

  public float[] getCenter() {
    float[] res = new float[2];

    res[0] = width / 2;
    res[1] = height / 2;

    return res;
  }
}
