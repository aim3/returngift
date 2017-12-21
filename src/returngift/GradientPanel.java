package returngift;

	import java.awt.Color;
	import java.awt.GradientPaint;
	import java.awt.Graphics;
	import java.awt.Graphics2D;
	import java.awt.RenderingHints;

	import javax.swing.JPanel;
	
public class GradientPanel extends JPanel {

	    @Override
	    protected void paintComponent(Graphics g) {
	        super.paintComponent(g);
	        Graphics2D g2d = (Graphics2D) g;
	        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
	        int w = getWidth();
	        int h = getHeight();
	        Color color1 = AppUI.light_bluish_gray;
	        Color color2 = AppUI.dark_bluish_gray;
	        GradientPaint gp = new GradientPaint(0, 0, color1, 0, h, color2);
	        g2d.setPaint(gp);
	        g2d.fillRect(0, 0, w, h);
	    }
	}
