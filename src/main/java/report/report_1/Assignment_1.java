package report.report_1;

import processing.core.*;
import report.report_1.model.Coordinate;
import report.report_1.model.Line;
import report.report_1.model.Rect;

public class Assignment_1 extends PApplet {
  TransformClient transformClient = new TransformClient();

  public static void main(String args[]) {
    PApplet.main("report.report_1.Assignment_1");
  }

  public void settings() {
    size(500, 500);
  }

  public void setup() {
    noLoop();
  }

  public void draw() {
    // Support line for better visuallity.
    Line supportLine = new Line(new Coordinate(0, 0), new Coordinate(500f, 500f * 0.3f));
    drawLine(supportLine);

    // Original rect.
    Rect initialRect =
        new Rect(
            new Coordinate(100, 30),
            new Coordinate(200, 30),
            new Coordinate(200, 60),
            new Coordinate(100, 60));
    fill(0);
    stroke(0);
    drawRect(initialRect);

    // Transformed rect.
    Rect transformedRect = transformClient.getTransformedRect(initialRect);
    fill(255, 0, 0, 150);
    stroke(255, 0, 0);
    drawRect(transformedRect);

    save("./src/main/java/report/report_1/Assignment_1_rendering_image.jpg");
  }

  private void drawLine(Line line) {
    line(line.start.x, line.start.y, line.end.x, line.end.y);
  }

  private void drawRect(Rect rect) {
    quad(rect.p1.x, rect.p1.y, rect.p2.x, rect.p2.y, rect.p3.x, rect.p3.y, rect.p4.x, rect.p4.y);
  }

  private class TransformClient {
    public Rect getTransformedRect(Rect rect) {
      Coordinate p1 = getTransformedCoordinate(rect.p1);
      Coordinate p2 = getTransformedCoordinate(rect.p2);
      Coordinate p3 = getTransformedCoordinate(rect.p3);
      Coordinate p4 = getTransformedCoordinate(rect.p4);

      Rect transformed = new Rect(p1, p2, p3, p4);
      return transformed;
    }

    private Coordinate getTransformedCoordinate(Coordinate coordinate) {
      // This is a hard-coded calculation. See report for theoretical process.
      float x = (91f / 109f) * coordinate.x + (60f / 109f) * coordinate.y;
      float y = (60f / 109f) * coordinate.x - (91f / 109f) * coordinate.y;

      Coordinate transformed = new Coordinate(x, y);
      return transformed;
    }
  }
}
