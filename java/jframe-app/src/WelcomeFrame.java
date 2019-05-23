import javax.swing.JFrame;
import javax.swing.JLabel;


public class WelcomeFrame extends JFrame {

	public WelcomeFrame()
	{
		    setTitle("Welcome Frame");
		    JLabel label=new JLabel("this is label");
		    label.setBounds(200, 100, 100, 50);
		    add(label);
		    setSize(1024,760);
		    setLayout(null);
		    setVisible(true);
    }
}
