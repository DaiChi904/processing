package report.report_1;

import processing.core.PApplet;
import report.report_1.model.Coordinate;
import report.report_1.model.Triangle;

public class Assignment_2 extends PApplet {
  int WIDTH = 750;
  int HEIGHT = 750;

  public static void main(String args[]) {
    PApplet.main("report.report_1.Assignment_2");
  }

  public void settings() {
    size(WIDTH, HEIGHT);
  }

  public void setup() {
    background(26, 52, 91);
    stroke(255, 255, 255);
    strokeWeight(1);
    noFill();
    noLoop();
  }

  public void draw() {
    Triangle rootTriangle =
        new Triangle(
            new Coordinate((float) WIDTH / 2.0f, 0),
            new Coordinate(0, (float) HEIGHT),
            new Coordinate((float) WIDTH, (float) HEIGHT));

    drawFractal(rootTriangle, 7);

    save("./src/main/java/report/report_1/Assignment_2_rendering_image.jpg");
  }

  private Coordinate getMiddlePoint(Coordinate p1, Coordinate p2) {
    return new Coordinate((p1.x + p2.x) / 2f, (p1.y + p2.y) / 2f);
  }

  private void drawFractal(Triangle triangle, int depth) {
    if (depth == 0) {
      // Base case
      drawTriangle(triangle);
    } else if (depth > 0) {
      // Recursive step
      Coordinate m12 = getMiddlePoint(triangle.p1, triangle.p2);
      Coordinate m23 = getMiddlePoint(triangle.p2, triangle.p3);
      Coordinate m13 = getMiddlePoint(triangle.p1, triangle.p3);

      Triangle t1 = new Triangle(triangle.p1, m12, m13);
      Triangle t2 = new Triangle(m12, triangle.p2, m23);
      Triangle t3 = new Triangle(m13, m23, triangle.p3);

      drawFractal(t1, depth - 1);
      drawFractal(t2, depth - 1);
      drawFractal(t3, depth - 1);
    }
  }

  private void drawTriangle(Triangle triangle) {
    triangle(
        triangle.p1.x, triangle.p1.y, triangle.p2.x, triangle.p2.y, triangle.p3.x, triangle.p3.y);
  }
}
