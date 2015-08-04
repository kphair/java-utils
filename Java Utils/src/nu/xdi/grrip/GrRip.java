package nu.xdi.grrip;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * @author Kevin Phair
 * @date 4 Aug 2015
 */
public class GrRip extends JFrame {

	static JFrame appFrame;
	static GrRip frame;
	static Rectangle screenSize;
	
	public static void main (String[] args) {

		frame = new GrRip ();
		System.out.println("frame:" + frame);
		
	}
	
	public GrRip () {
		
		appFrame = this;
		System.out.println("appFrame:" + appFrame);
		screenSize = this.getGraphicsConfiguration().getBounds();
		this.setBounds(screenSize.width / 4, screenSize.height / 4, screenSize.width / 2, screenSize.height / 2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Exception attempting to set application look and feel");
		}
		
		
		this.setVisible(true);
	}

}
