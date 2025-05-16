package playground;

import processing.core.*;

public class Sample extends PApplet {
  public static void main(String args[]) {
    // ここの名前もファイル名と同じにする
    PApplet.main("playground.Sample");
  }

  public void settings() {
    // sizeメソッドだけはここに指定する
    size(960, 720);
  }

  public void setup() {}

  public void draw() {
    // ここに実際のProcessingのコードを記載していく
    background(255);
    quad(400, 100, 300, 200, 600, 200, 550, 50);
    triangle(250, 250, 200, 450, 600, 450);
  }
}
