import java.awt.Canvas;
import java.awt.Graphics;

class Main {
  public void text(String text) {
    System.out.println(text);
  }
  public void calc(double x) {
    System.out.println(x);
  }
  public static void main(String[] args) {
    Main main = new Main();
    main.text("Hello World");
    main.calc(1+1);
  }
}