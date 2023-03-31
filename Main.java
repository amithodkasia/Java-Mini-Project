
import java.awt.*;
import javax.swing.*;

public class Main extends JWindow {
   Image splashScreen;
   ImageIcon imageIcon;
   public Main() {  
      splashScreen = Toolkit.getDefaultToolkit().getImage("C:\\Users\\kesha\\OneDrive\\Desktop\\Icons\\sp\\splash2.png");
      // Create ImageIcon from Image
      imageIcon = new ImageIcon(splashScreen);
      // Set JWindow size from image size
      setSize(700,700);
      // Get current screen size
      Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
      // Get x coordinate on screen for make JWindow locate at center
      int x = (screenSize.width-getSize().width)/2;
      // Get y coordinate on screen for make JWindow locate at center
      int y = (screenSize.height-getSize().height)/2;
      // Set new location for JWindow
      setLocation(x,y);
      // Make JWindow visible
      setVisible(true);
   }
   // Paint image onto JWindow
   public void paint(Graphics g) {
      super.paint(g);
      g.drawImage(splashScreen, 0, 0, this);
   }
   public static void main(String[]args) {
      Main splash = new Main();
      try {
         // Make JWindow appear for 5 seconds before disappear
         Thread.sleep(5000);
         splash.dispose();
      } catch(Exception e) {
         e.printStackTrace();
      }
	  new Frame();
   }
}