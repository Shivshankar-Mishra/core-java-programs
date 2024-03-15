package com.mkyong;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
public class DrawShapes extends JFrame {
private static final long serialVersionUID = 1L;
public DrawShapes() {
setSize(new Dimension(320, 320));
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
JPanel p = new JPanel() {
@Override
public void paintComponent(Graphics g) {
Graphics2D g2 = (Graphics2D) g;
Shape line = new Line2D.Double(3, 3, 303, 303);
Shape rect = new Rectangle(3, 3, 303, 303);
Shape circle = new Ellipse2D.Double(100, 100, 100, 100);
Shape roundRect = new RoundRectangle2D.Double(20, 20, 250, 250,
5, 25);
g2.draw(line);
g2.draw(rect);
g2.draw(circle);
g2.draw(roundRect);
}
};
setTitle("My Shapes");
this.getContentPane().add(p);
}
public static void main(String arg[]) {
SwingUtilities.invokeLater(new Runnable() {
@Override
public void run() {
// TODO Auto-generated method stub
new DrawShapes();
}
});
}
}