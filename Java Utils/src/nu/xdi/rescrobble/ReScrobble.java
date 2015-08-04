package nu.xdi.rescrobble;

import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 * @author Kevin Phair
 * @date 4 Aug 2015
 */
public class ReScrobble extends JFrame {

	static JFrame appFrame;
	static ReScrobble frame;
	static Rectangle screenSize;
	
	public static void main (String[] args) {

		frame = new ReScrobble();
		
	}
	
	public ReScrobble () {
	
		appFrame = this;
		
		screenSize = this.getGraphicsConfiguration().getBounds();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(screenSize.width / 4, screenSize.height / 4, screenSize.width / 2, screenSize.height / 2);
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			System.out.println("Exception attempting to set system look and feel");
		}
		this.setVisible(true);
		
	}

}
