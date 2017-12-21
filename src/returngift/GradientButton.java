package returngift;

	import java.awt.Color;
	import java.awt.GradientPaint;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.Point;

	import javax.swing.JButton;
	
public class GradientButton extends JButton {
	
	   public GradientButton(String name) {
           super(name);
           setContentAreaFilled(false);
           setFocusPainted(false); // used for demonstration
       }

       @Override
       protected void paintComponent(Graphics g) {
           final Graphics2D g2 = (Graphics2D) g.create();
           g2.setPaint(new GradientPaint(
                   new Point(0, 0), 
                   AppUI.light_bluish_gray, 
                   new Point(0, getHeight()), 
                   AppUI.dark_bluish_gray));
           g2.fillRect(0, 0, getWidth(), getHeight());
           g2.dispose();

           super.paintComponent(g);
       }
	}
